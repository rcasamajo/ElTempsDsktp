package eltempsdsktp;

import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

/**
 * Created by rcasamajo on 19/11/15.
 */
public class DlgController {
    public LineChart lcGrafic;
    public CategoryAxis caXAxis;
    public NumberAxis caYAxis;
    private Stage dialogStage;

    public void initialize() {
        caXAxis.setLabel("Dies");
        caYAxis.setLabel("Temperatura (graus C.)");
        lcGrafic.setTitle("Evolució de les temperatures");
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public void showDialogStage() {
        lcGrafic.getData().clear();

        XYChart.Series series = new LineChart.Series();
        series.setName("Propera setmana");
        series.getData().add(new XYChart.Data("Dilluns", (int)(Math.random()*30)));
        series.getData().add(new XYChart.Data("Dimarts", (int)(Math.random()*30)));
        series.getData().add(new XYChart.Data("Dimecres", (int)(Math.random()*30)));
        series.getData().add(new XYChart.Data("Dijous", (int)(Math.random()*30)));
        series.getData().add(new XYChart.Data("Divendres", (int)(Math.random()*30)));
        series.getData().add(new XYChart.Data("Dissabte", (int)(Math.random()*30)));
        series.getData().add(new XYChart.Data("Diumenge", (int)(Math.random()*30)));

        lcGrafic.getData().add(series);

        dialogStage.show();
    }
}
