package eltempsdsktp;

import javafx.stage.Stage;

/**
 * Created by rcasamajo on 19/11/15.
 */
public class DlgController {
    private Stage dialogStage;

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public void showDialogStage() {
        dialogStage.show();
    }
}
