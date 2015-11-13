package eltempsdsktp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

public class Controller {
    public ListView lvLlistaPrediccions;
    public ImageView ivIconPrediccio;
    public DialogPane dpDialeg;
    public MenuItem miDialog;
    public Button btCloseDialeg;

    public void initialize() {
        ObservableList<String> items = FXCollections.observableArrayList(
                "Previsió 1", "Previsió 2", "Previsió 3", "Previsió 4");
        lvLlistaPrediccions.setItems(items);

        btCloseDialeg = (Button)dpDialeg.lookupButton(ButtonType.CLOSE);
        btCloseDialeg.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                dpDialeg.setVisible(false);
            }
        });
    }

    public void mieDialogClick(ActionEvent actionEvent) {
        dpDialeg.setVisible(true);
    }
}
