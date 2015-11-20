package eltempsdsktp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage dialogStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("eltempsdsktp.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("El Temps");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();

        // Load the fxml file and create a new stage for the popup
        FXMLLoader dlgLoader = new FXMLLoader(getClass().getResource("dialeg.fxml"));
        Parent page = dlgLoader.load();
        dialogStage = new Stage();
        dialogStage.setTitle("Diàleg FXML");
        dialogStage.initModality(Modality.WINDOW_MODAL);
        dialogStage.initOwner(primaryStage);
        dialogStage.setScene(new Scene(page));

        // Guardem el dialogStage al controlador per poder accedir-hi i mostrar ña finestra
        ((DlgController)dlgLoader.getController()).setDialogStage(dialogStage);

        // Guardem el controlador del diàleg al controlador principal per poder cridar el mètode que
        // el mostra quan triem la opció al menú.
        ((Controller)loader.getController()).setDlgController(dlgLoader.getController());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
