import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;

public class Main extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
        primaryStage.setTitle("Apple service");
        primaryStage.setScene(new Scene(root, 785, 535));
        primaryStage.show();
    }
    public static void main(final String[] args){
        launch(args);
    }
}