package eltempsdsktp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.DialogPane;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;

public class Controller {
    public ListView lvLlistaPrediccions;
    public ImageView ivIconPrediccio;
    public DialogPane dpDialeg;

    public void initialize() {
        ObservableList<String> items = FXCollections.observableArrayList(
                "Previsió 1", "Previsió 2", "Previsió 3", "Previsió 4");
        lvLlistaPrediccions.setItems(items);
    }

}
