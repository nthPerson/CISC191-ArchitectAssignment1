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
// Sean: Added some new imports for Gridpane
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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

        // create arrays
        int[] array = new int[]{0, 1, 2, 3, 4};
        int[][] mdArray = new int[][]{{0, 1, 2, 3, 4}, {5, 6, 7, 8, 9}, {10, 11, 12, 13, 14}};

        IntArray intArray = new IntArray(array);
        MDIntArray mdIntArray = new MDIntArray(mdArray);

        //size of window
        float width = 800;
        float height = 650;

        // Sean: Create new boarder pane and grid pane to better organize the UI
        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, width, height);

        // Sean: Create close button outside of gridpane
        Button closeButton = new Button("X");
        closeButton.setOnAction(e -> stage.close());

        StackPane stackPane = new StackPane(closeButton);
        stackPane.setMargin(closeButton, new Insets(10, 10, 0, 0));
        borderPane.setTop(stackPane);

        // Sean: Used Grid Pane instead of Stack Pane to further organize the UI of the buttons into a clean grid
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setAlignment(Pos.CENTER);

        Button ArrayPrintAll = new Button("1DArray Print All");
        Button ArrayPrintMax = new Button("1D Array Print Max");
        Button ArrayPrintMin = new Button("1D Array Print Min");
        Button MDArrayPrintAll = new Button("2DArray Print All");
        Button MDArrayPrintMax = new Button("2D Array Print Max");
        Button MDArrayPrintMin = new Button("2D Array Print Min");

        gridPane.add(ArrayPrintAll, 0, 0);
        gridPane.add(ArrayPrintMax, 0, 1);
        gridPane.add(ArrayPrintMin, 0, 2);
        gridPane.add(MDArrayPrintAll, 1, 0);
        gridPane.add(MDArrayPrintMax, 1, 1);
        gridPane.add(MDArrayPrintMin, 1, 2);

        borderPane.setCenter(gridPane);

        stage.setScene(scene);
        stage.show();

        //create and set button actions
        EventHandler<ActionEvent> closeEvent = e -> stage.close();
        EventHandler<ActionEvent> ArrayPrintAllEvent = e -> intArray.printAll();
        EventHandler<ActionEvent> ArrayPrintMaxEvent = e -> intArray.max();
        EventHandler<ActionEvent> ArrayPrintMinEvent = e -> intArray.min();
        EventHandler<ActionEvent> MDArrayPrintAllEvent = e -> mdIntArray.printAll();
        EventHandler<ActionEvent> MDArrayPrintMaxEvent = e -> mdIntArray.getMaxValue();
        EventHandler<ActionEvent> MDArrayPrintMinEvent = e -> mdIntArray.getMinValue();

        closeButton.setOnAction(closeEvent);
        ArrayPrintAll.setOnAction(ArrayPrintAllEvent);
        ArrayPrintMax.setOnAction(ArrayPrintMaxEvent);
        ArrayPrintMin.setOnAction(ArrayPrintMinEvent);
        MDArrayPrintAll.setOnAction(MDArrayPrintAllEvent);
        MDArrayPrintMax.setOnAction(MDArrayPrintMaxEvent);
        MDArrayPrintMin.setOnAction(MDArrayPrintMinEvent);


        //set the stage
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
