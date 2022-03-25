package control;

import control.LoginGuiController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FXAPP extends Application {
    private Stage stage;

    public static void run() {
        launch();
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stage= primaryStage;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/logingui.fxml"));
        Scene loginScene = loader.load();
        LoginGuiController controller = loader.getController();
        primaryStage.setScene(loginScene);
        controller.setParentController(this);
        stage.show();

    }

    public void login() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/mainGui.fxml"));
        Scene scene= loader.load();
        stage.setScene(scene);
    }
}
