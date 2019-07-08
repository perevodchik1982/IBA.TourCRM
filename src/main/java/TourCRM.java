import control.Controller;
import javafx.application.Application;
import javafx.stage.Stage;

import java.sql.Connection;

public class TourCRM extends Application {



       public static void main(String[] args){
launch(args);
}

       public void start(Stage primaryStage) throws Exception {
              Controller controller = new Controller();
              controller.start(primaryStage);
              // ConnectionDriver connectionDriver = new ConnectionDriver(); // /test connection
              //to do
              //Database architecture - Phil done
              //data input - Vlad
              //tours collections - Vlad
              //clients collections - Vlad
              //saving collections to database - Phil
              //database queries - Phil
              //displaying results of database queries - Phil
              // Creating pull request on github
              // preparing to release


       }
}
