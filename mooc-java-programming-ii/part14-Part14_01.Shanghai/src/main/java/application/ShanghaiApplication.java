package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application{
    
    @Override
    public void start(Stage window) throws Exception {
        NumberAxis xAxis = new NumberAxis(2006, 2018, 2);
        NumberAxis yAxis = new NumberAxis();
        
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");
        
        XYChart.Series dataSet = new XYChart.Series();
        
        dataSet.getData().add(new XYChart.Data(2007, 73));
        dataSet.getData().add(new XYChart.Data(2008, 68));
        dataSet.getData().add(new XYChart.Data(2009, 72));
        dataSet.getData().add(new XYChart.Data(2010, 72));
        dataSet.getData().add(new XYChart.Data(2011, 74));
        dataSet.getData().add(new XYChart.Data(2012, 73));
        dataSet.getData().add(new XYChart.Data(2013, 76));
        dataSet.getData().add(new XYChart.Data(2014, 73));
        dataSet.getData().add(new XYChart.Data(2015, 67));
        dataSet.getData().add(new XYChart.Data(2016, 56));
        dataSet.getData().add(new XYChart.Data(2017, 56));
        
        lineChart.getData().add(dataSet);
        
        Scene view = new Scene(lineChart);                
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(args);
    }

}
