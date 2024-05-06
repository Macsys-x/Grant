package sample.Controllers;



import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import sample.Methods;
public class ControllerMenu {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Button1Kurs;

    @FXML
    private Button Button2Kurs;

    @FXML
    private Button Button3Kurs;

    @FXML
    private Button Button4Kurs;



    @FXML
    void initialize() {


        Button1Kurs.setOnAction(event -> {

            new Methods().transition("/sample/FailFXML/BallsForBe1Kurs.fxml",Button1Kurs);
        });


        Button2Kurs.setOnAction(event -> {

            new Methods().transition("/sample/FailFXML/BallsForBe2Kurs.fxml",Button2Kurs);

        });


        Button3Kurs.setOnAction(event -> {

            new Methods().transition("/sample/FailFXML/BallsForBe3Kurs.fxml", Button3Kurs);

        });


        Button4Kurs.setOnAction(event -> {

            new Methods().transition("/sample/FailFXML/BallsForBe4Kurs.fxml", Button4Kurs);

        });


    }




}
