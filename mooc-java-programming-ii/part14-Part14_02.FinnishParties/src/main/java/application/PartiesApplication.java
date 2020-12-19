package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    @Override
    public void start(Stage window) {
        // create important variables 

        NumberAxis xAxis = new NumberAxis(1968, 2008, 2);
        NumberAxis yAxis = new NumberAxis();

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");

        // read the file 
        String path = "partiesdata.tsv";
        Map<String, Map<Integer, Double>> dataSet = getData(path);
        
        // set the data into XYData.Series variables 
        dataSet.keySet().stream().forEach(each -> {
            XYChart.Series data = new XYChart.Series();
            data.setName(each);

            dataSet.get(each).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });
            lineChart.getData().add(data);
        });

        Scene scene = new Scene(lineChart);
        window.setScene(scene);
        window.show();
    }

    public Map<String, Map<Integer, Double>> getData(String path) {
        Map<String, Map<Integer, Double>> dataSet = new HashMap<>();
        ArrayList<Integer> years = new ArrayList<>();
        try {
            Files.lines(Paths.get(path)).
                    map(row -> row.split("\t")).
                    forEach(parts -> {
                        // add years if its the first row 
                        if (parts[0].equals("Party")) {
                            for (int i = 1; i < parts.length; i++) {
                                years.add(Integer.valueOf(parts[i]));
                            }
                        } else {
                            Map<Integer, Double> data = new HashMap<>();
                            for (int i = 1; i < parts.length; i++) {
                                if (parts[i].equals("-")) {
                                    data.putIfAbsent(years.get(i - 1), 0.0);
                                    continue;
                                }
                                data.putIfAbsent(years.get(i - 1), Double.valueOf(parts[i]));
                            }
                            dataSet.putIfAbsent(parts[0], data);
                        }
                    });
        } catch (IOException e) {
            System.out.println("can not read the file. Please enter valid path");
            System.out.println(e.getMessage());
        }
        return dataSet;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(PartiesApplication.class);
    }

}
