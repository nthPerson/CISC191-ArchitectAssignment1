package edu.sdccd.cisc191.template;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * This program is a server that takes connection requests on
 * the port specified by the constant LISTENING_PORT.  When a
 * connection is opened, the program sends the current time to
 * the connected socket.  The program will continue to receive
 * and process connections until it is killed (by a CONTROL-C,
 * for example).  Note that this server processes each connection
 * as it is received, rather than creating a separate thread
 * to process the connection.
 */
public class Server extends Application {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void start(int port) throws Exception {
        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            CustomerRequest request = CustomerRequest.fromJSON(inputLine);
            CustomerResponse response = new CustomerResponse(request.getId(), "Jane", "Doe");
            out.println(CustomerResponse.toJSON(response));
        }
    }

//    public void stop() throws IOException {
//        in.close();
//        out.close();
//        clientSocket.close();
//        serverSocket.close();
//    }

    @Override
    public void start(Stage stage) throws Exception {

        Canvas menuCanvas = new Canvas(100,100);
        BorderPane borderPane = new BorderPane();
        HBox header = new HBox();
        VBox gameBoard = new VBox();
        StackPane stackPane = new StackPane();
        Button closeButton = new Button("X");
        float width = 1500;
        float height = 800;
        Scene scene = new Scene(stackPane, width, height);

        closeButton.setTranslateX((width/2)-20);
        closeButton.setTranslateY((-height/2)+20);

        EventHandler<ActionEvent> closeEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                stage.close();
            }
        };

        closeButton.setOnAction(closeEvent);

        stackPane.getChildren().add(closeButton);

        stage.setScene(scene);
        stage.setTitle("Menu");
        stage.show();
    }

    public static void main(String[] args) {

       launch();

//        Server server = new Server();
//        try {
//            server.start(4444);
//            server.stop();
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
    }
} //end class Server
