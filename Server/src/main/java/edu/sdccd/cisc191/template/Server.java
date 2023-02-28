package edu.sdccd.cisc191.template;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.BufferedReader;
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

        Drink drinks = new Drink();
        Food food = new Food();

        float width = 1500;
        float height = 800;

        StackPane stackPane = new StackPane();
        Scene scene = new Scene(stackPane, width, height);

        Button closeButton = new Button("X");
        Button waterButton = new Button("Water");
        Button cakeButton = new Button("Cake");
        Button FinishButton = new Button("Done");

        closeButton.setTranslateX((width / 2) - 20);
        closeButton.setTranslateY((-height / 2) + 20);

        waterButton.setTranslateX(50);
        waterButton.setTranslateY(50);

        cakeButton.setTranslateX(200);
        cakeButton.setTranslateY(200);

        FinishButton.setTranslateX(-200);
        FinishButton.setTranslateY(-200);

        EventHandler<ActionEvent> closeEvent = e -> stage.close();
        EventHandler<ActionEvent> finishEvent = e -> {
            drinks.printArray();
            food.printArray();
            food.printPrice();
            drinks.printPrice();
            stage.close();
        };
        EventHandler<ActionEvent> addWaterEvent = e -> {
            drinks.addWater();
        };
        EventHandler<ActionEvent> addCakeEvent = e -> food.addCake();

        closeButton.setOnAction(closeEvent);
        waterButton.setOnAction(addWaterEvent);
        cakeButton.setOnAction(addCakeEvent);
        FinishButton.setOnAction(finishEvent);

        stackPane.getChildren().add(closeButton);
        stackPane.getChildren().add(waterButton);
        stackPane.getChildren().add(cakeButton);
        stackPane.getChildren().add(FinishButton);

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
