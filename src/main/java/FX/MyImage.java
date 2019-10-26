package FX;

import javafx.scene.Group;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.Glow;
import javafx.scene.image.*;
import javafx.scene.paint.Color;

import java.io.FileInputStream;

public class MyImage {
    public static ImageView getImageFromWeb(){
        Image image = new Image("https://www.tutorialspoint.com/green/images/logo.png");

        ImageView imageView = new ImageView(image);
        imageView.setX(100);
        imageView.setY(50);

        imageView.setFitHeight(200);
        imageView.setFitWidth(400);

        imageView.setPreserveRatio(false);

        Glow glow = new Glow();
        glow.setLevel(4);

        imageView.setEffect(glow);

        return imageView;
    }
    public static ImageView getImageFromResource() throws Exception{
        FileInputStream inputstream = new FileInputStream(
                "C:\\Users\\kielek\\IdeaProjects\\JavaFXGit\\src\\main\\resources\\tabaluga.jpg");
        Image image = new Image(inputstream);
        ImageView imageView = new ImageView(image);
        imageView.setX(50);
        imageView.setY(25);
        imageView.setFitHeight(350);
        imageView.setFitWidth(500);
        return imageView;
    }
    public static ImageView getImageFromPixels() throws Exception{
        FileInputStream inputstream = new FileInputStream(
                "C:\\Users\\kielek\\IdeaProjects\\JavaFXGit\\src\\main\\resources\\tabaluga2.jpg");
        Image image = new Image(inputstream);
        int width = (int)image.getWidth();
        int height = (int)image.getHeight();

        WritableImage wImage = new WritableImage(width, height);
        PixelReader pixelReader = image.getPixelReader();
        PixelWriter writer = wImage.getPixelWriter();

        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color color = pixelReader.getColor(x, y);
                if (!color.equals(Color.WHITE)) {
                    writer.setColor(x, y, color.darker());
                }

            }
        }

        ImageView imageView = new ImageView(wImage);

        return imageView;
    }
    public static Group getGroup(){
        try{
            return new Group(getImageFromPixels());
        }
        catch (Exception ex){
            return null;
        }
    }
}
