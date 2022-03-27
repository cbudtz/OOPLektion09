package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginGuiController implements Initializable {
    @FXML
    public TextField username;
    @FXML
    public TextField password;
    private FXAPP fxapp;


    public void setParentController(FXAPP fxapp) {
        this.fxapp=fxapp;
    }

    public void login(ActionEvent mouseEvent) throws IOException {
        if ("brian".equals(username.getText()) && "kodeord".equals(password.getText())){
            //Yuck - double cast - alternative solution to swapping scenes... :
            //Scene mainScene = new FXMLLoader(getClass().getResource("/mainGui.fxml")).load();
            //((Stage)((Node)mouseEvent.getSource()).getScene().getWindow()).setScene(mainScene);
            fxapp.login();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Initializing");
        //
        password.requestFocus();
    }
}
