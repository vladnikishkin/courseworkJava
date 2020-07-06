package Class;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AppControllerNewClient {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField firstnameFiled;

    @FXML
    private TextField lastnameField;

    @FXML
    private TextField phone_numberField;

    @FXML
    private TextField modelField;

    @FXML
    private TextField versionField;

    @FXML
    private TextField repair_codeField;

    @FXML
    private TextField timeField;

    @FXML
    private TextField priceField;

    @FXML
    private Button createField;

    @FXML
    private Button deleteField;

    @FXML
    private Button updateField;

    @FXML
    void initialize() {
        createField.setOnAction(event -> {
            WorkingMethods work = new WorkingMethods(firstnameFiled.getText(), lastnameField.getText(),
                    Integer.parseInt(phone_numberField.getText()), modelField.getText(), versionField.getText(),
                    Integer.parseInt(repair_codeField.getText()), timeField.getText(),
                    Integer.parseInt(priceField.getText()));
            work.create();
        });
        deleteField.setOnAction(event -> {
            WorkingMethods work = new WorkingMethods(firstnameFiled.getText(), lastnameField.getText(),
                    Integer.parseInt(phone_numberField.getText()), modelField.getText(), versionField.getText(),
                    Integer.parseInt(repair_codeField.getText()), timeField.getText(),
                    Integer.parseInt(priceField.getText()));
            work.delete();
        });
        updateField.setOnAction(event -> {
            WorkingMethods work = new WorkingMethods(firstnameFiled.getText(), lastnameField.getText(),
                    Integer.parseInt(phone_numberField.getText()), modelField.getText(), versionField.getText(),
                    Integer.parseInt(repair_codeField.getText()), timeField.getText(),
                    Integer.parseInt(priceField.getText()));
            work.update();
        });
    }
}
