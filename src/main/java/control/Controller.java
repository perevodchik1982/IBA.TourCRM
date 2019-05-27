package control;

import javafx.stage.Stage;
import model.Model;
import view.View;

public class Controller {
    private Model mModel;
    private View mView;

    public Controller() {
        this(new Model(), new View());
    }

    public Controller(Model model, View view) {
        mModel = new Model();
        mView = new View();
    }

    public void start(Stage primaryStage) {
        mView.drawPrimaryStage(primaryStage);
    }
}
