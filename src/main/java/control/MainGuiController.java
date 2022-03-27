package control;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class MainGuiController implements Initializable {
    public Rectangle rect;
    public TableView<String> tableview;

    public void handleKeyPress(KeyEvent keyEvent) {
        System.out.println(keyEvent.getCode());
        switch (keyEvent.getCode()){
            case UP -> rect.setY(rect.getY()-1);
            case DOWN -> rect.setY(rect.getY()+1);
            default -> throw new IllegalStateException("Unexpected value: " + keyEvent.getCode());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tableview.getProperties().addListener((InvalidationListener) observable -> {

        });
    }
}
