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
    private DlgController dlgController;

    public void initialize() {
        ObservableList<String> items = FXCollections.observableArrayList(
                "Previsió 1", "Previsió 2", "Previsió 3", "Previsió 4");
        lvLlistaPrediccions.setItems(items);

        this.crearDialog();
    }

    private void crearDialog() {
        // Definició d'un diàleg usant la classe Dialog
        dialog = new Dialog();
        dialog.setTitle("Diàleg");
        dialog.setHeaderText("This is a custom dialog");
        dialog.setResizable(true);

        // Afegim controls i els organitzem en un GridPane
        Label label1 = new Label("Predicció: ");
        ImageView img1 = new ImageView("01d.png");
        Label label2 = new Label("Sol");
        // No cal definir el tamany deñ GridPane al crear-lo
        GridPane grid = new GridPane();
        grid.add(label1, 0, 0);
        grid.add(img1, 1, 2);
        grid.add(label2, 2, 2);

        // Afegim el Grid al DialogPane que conté Dialog.
        // DialogPane és bàsicament una plantilla on organitzar el contingut del diàleg
        dialog.getDialogPane().setContent(grid);

        // Afegim un botó del tipus predefinit a ButtonData OK_DONE
        // L'afegim a la llista de botons del diàleg (getButtonTypes()) de manera que es situa de manera estàndard
        ButtonType buttonTypeOk = new ButtonType("Okay", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().add(buttonTypeOk);

        // Afegim la fulla d'estil al Dialog
        dialog.getDialogPane().getScene().getStylesheets().add("css/DarkTheme.css");
    }

    public void mieDialogClick(ActionEvent actionEvent) {
        // Mostrem el diàleg
        dialog.show();
    }

    public void setDlgController(DlgController dlgController) {
        this.dlgController = dlgController;
    }

    public void miDialegFXMLClick(ActionEvent actionEvent) {
        dlgController.showDialogStage();
    }
}
