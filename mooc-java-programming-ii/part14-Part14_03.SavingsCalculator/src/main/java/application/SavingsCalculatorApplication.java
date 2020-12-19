package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application{
    
    private DataLogicControl dataControl;

    public SavingsCalculatorApplication() {
        dataControl = new DataLogicControl();
    }        
    
    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();    
        layout = (BorderPane) createLayout();        
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
        
    }
    
    //
    private Parent createLayout() {
        BorderPane layout = new BorderPane();
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis(0, 125000, 25000);
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);       
        lineChart.setTitle("Savings calculator");    
        
        VBox vBox = new VBox();
        vBox.setPadding(new Insets(20, 20, 20, 20));
        vBox.setSpacing(20);
        
        BorderPane top = new BorderPane();
        Label textTop = new Label("Monthly savings");
        Slider topSlider = new Slider(25, 250, 25);
        topSlider.setShowTickLabels(true);
        topSlider.setShowTickMarks(true);  
        topSlider.setBlockIncrement(6.25f);  
        topSlider.setMajorTickUnit(25f);
        Label valueTop = new Label(String.valueOf(topSlider.getValue()));
        top.setLeft(textTop);
        top.setCenter(topSlider);
        top.setRight(valueTop);      
        
        
        BorderPane bot = new BorderPane();
        Label botText = new Label("Yearly interest rate");
        Slider botSlider = new Slider(0, 10, 0);
        botSlider.setShowTickLabels(true);
        botSlider.setShowTickMarks(true);             
        botSlider.setMajorTickUnit(2.5f);
        Label valueBot = new Label(String.valueOf(botSlider.getValue()));        
        bot.setLeft(botText);
        bot.setCenter(botSlider);
        bot.setRight(valueBot);
        
        vBox.getChildren().addAll(top, bot);
        layout.setTop(vBox);
        layout.setCenter(lineChart);
        
        // event handler       
        topSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> ov, Number old_val, Number new_val) {
                
                valueTop.setText(String.format("%.1f", new_val));
                updateLayout(lineChart, dataControl.getMonthlySaving((double) new_val), dataControl.getYearlySaving((double) new_val, Double.valueOf(valueBot.getText())));                
            }
        });
        botSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> ov, Number old_val, Number new_val) {
                valueBot.setText(String.format("%.1f", new_val));                               
                updateLayout(lineChart, dataControl.getMonthlySaving(Double.valueOf(valueTop.getText())), dataControl.getYearlySaving(Double.valueOf(valueTop.getText()), (double) new_val)); 
            }
        });
        
        return layout;                
    }       
    
    private void updateLayout(LineChart<Number, Number> lineChart, XYChart.Series month, XYChart.Series year) {
        lineChart.getData().clear();
        lineChart.getData().addAll(month, year);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(args);        
    }

}
