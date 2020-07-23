package com.arcompany.maven;

import javafx.application.Application;
import static javafx.application.ConditionalFeature.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends Application{
    
    
    public static void main( String[] args ){
        
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/FXMLclient.fxml"));
        Scene scene = new Scene(root,900,550);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Sales Controller");
        primaryStage.show();
        
    }
}
