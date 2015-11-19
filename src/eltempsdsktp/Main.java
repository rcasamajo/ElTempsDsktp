package eltempsdsktp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("eltempsdsktp.fxml"));
        Parent root = loader1.load();
        primaryStage.setTitle("El Temps");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();

        // Load the fxml file and create a new stage for the popup
        FXMLLoader loader = new FXMLLoader(getClass().getResource("dialeg.fxml"));
        AnchorPane page = (AnchorPane) loader.load();
        Stage dialogStage = new Stage();
        dialogStage.setTitle("Diàleg FXML");
        dialogStage.initModality(Modality.WINDOW_MODAL);
        dialogStage.initOwner(primaryStage);
        Scene scene = new Scene(page);
        dialogStage.setScene(scene);
        ((DlgController)loader.getController()).setDialogStage(dialogStage);

        ((Controller)loader1.getController()).setDlgController(loader.getController());
    }


    public static void main(String[] args) {
        launch(args);
    }
}
