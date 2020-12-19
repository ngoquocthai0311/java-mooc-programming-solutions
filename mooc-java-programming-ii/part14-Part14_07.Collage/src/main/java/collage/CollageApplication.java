package collage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {

        // the example opens the image, creates a new image, and copies the opened image
        // into the new one, pixel by pixel
        Image sourceImage = new Image("file:monalisa.png");

        PixelReader imageReader = sourceImage.getPixelReader();

        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();
               

        WritableImage targetImage = new WritableImage(width, height);                                                                     
        
        createSmallerImage(targetImage, imageReader);

        ImageView image = new ImageView(targetImage);        
        Pane pane = new Pane();
        pane.getChildren().addAll(image);

        stage.setScene(new Scene(pane));
        stage.show();
    }
    
    public void createSmallerImage(WritableImage image, PixelReader reader) {
        PixelWriter writer = image.getPixelWriter();
                
        int width = (int) image.getWidth() / 2;
        int height = (int) image.getHeight() / 2;          
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color color = reader.getColor(i * 2, j * 2);
                double red = 1.0 - color.getRed();
                double green = 1.0 - color.getGreen();
                double blue = 1.0 - color.getBlue();
                double opacity = color.getOpacity();

                Color newColor = new Color(red, green, blue, opacity);
                
                // set Color 
                writer.setColor(i, j, newColor);                      
                writer.setColor(i + width, j, newColor);
                writer.setColor(i, j + height, newColor);
                writer.setColor(i + width, j + height, newColor);
            }
        }
    }
    

    public static void main(String[] args) {
        launch(args);
    }

}
