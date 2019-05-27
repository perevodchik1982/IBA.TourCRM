import control.Controller;
import javafx.application.Application;
import javafx.stage.Stage;

public class TourCRM extends Application {



       public static void main(String[] args){
launch(args);
}

       public void start(Stage primaryStage) throws Exception {
              Controller controller = new Controller();
              controller.start(primaryStage);
       }
}
