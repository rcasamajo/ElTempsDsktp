package eltempsdsktp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class Controller {
    public ListView lvLlistaPrediccions;
    public ImageView ivIconPrediccio;
    public MenuItem miDialog;
    private Dialog dialog;

    public void initialize() {
        ObservableList<String> items = FXCollections.observableArrayList(
                "Previsió 1", "Previsió 2", "Previsió 3", "Previsió 4");
        lvLlistaPrediccions.setItems(items);

        // Definició d'un diàleg usant la classe Dialog
        dialog = new Dialog();
        dialog.setTitle("Diàleg");
        dialog.setHeaderText("This is a custom dialog");
        dialog.setResizable(true);

        Label label1 = new Label("Predicció: ");
        ImageView img1 = new ImageView("01d.png");
        Label label2 = new Label("Sol");
        GridPane grid = new GridPane();
        grid.add(label1, 1, 1);
        grid.add(img1, 1, 2);
        grid.add(label2, 2, 2);

        dialog.getDialogPane().setContent(grid);

        ButtonType buttonTypeOk = new ButtonType("Okay", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().add(buttonTypeOk);
    }

    public void mieDialogClick(ActionEvent actionEvent) {
        dialog.show();
    }
}
