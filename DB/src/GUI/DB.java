/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Zuzu
 */
public class DB extends Application {
    
//    @Override
   public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
//        
//        Scene scene = new Scene(root);
//        stage.setTitle("Batabase - CS:GO");
//        stage.setScene(scene);
//        stage.show();
   }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //launch(args);
        
       mainGet();
        
        
    }
    public static void mainGet() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println(e);
        }

        String url = "jdbc:postgresql://horton.elephantsql.com:5432/umlvfvxv";
        String username = "umlvfvxv";
        String password = "nzT6Llfe5-d9cxLoYT9ZFFCKYXsL_G5z";

        try {
            Connection db = DriverManager.getConnection(url, username, password);

            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("select * from people");
            while (rs.next()) {

                System.out.print(rs.getString(1) + "\t" + " - ");
                System.out.print(rs.getString(2) + "\t" + " - ");
                System.out.println(rs.getString(3) + " ");
            }
            rs.close();
            st.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
