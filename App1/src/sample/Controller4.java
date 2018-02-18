package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller4 {

    public void changescreen_previous(javafx.event.ActionEvent event) throws IOException {

        Parent scene_1999 = FXMLLoader.load(getClass().getResource("scene2.fxml"));
        Scene scene2 = new Scene(scene_1999,1000,700);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene2);
        window.show();

    }
    public void changescreen(javafx.event.ActionEvent event) throws IOException {

        Parent scene_1999 = FXMLLoader.load(getClass().getResource("scene5.fxml"));
        Scene scene2 = new Scene(scene_1999,1000,700);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene2);
        window.show();

    }

}