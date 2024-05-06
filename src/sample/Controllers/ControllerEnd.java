package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import sample.Methods;

public class ControllerEnd {
static String sBallsOfDiscipline;
static String sBallsOfScienRating;
static String sBallsOfSocRating;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label BallsOfDiscipline;

    @FXML
    private Label BallsOfScienRating;

    @FXML
    private Label BallsOfSocRating;

    @FXML
    private Hyperlink Link;

    @FXML
    private Button ButtonShowResult;

    @FXML
    private Button ButtonBack;

    @FXML
    void initialize() {
        ButtonBack.setOnAction(event -> {
            new Methods().transition("/sample/FailFXML/SocRating.fxml", ButtonBack);
        });

        ButtonShowResult.setOnAction(actionEvent -> {
            ShowResult();
        });

    }

    public void ShowResult()
    {
        BallsOfDiscipline.setText(sBallsOfDiscipline);
        BallsOfScienRating.setText(sBallsOfScienRating);
        BallsOfSocRating.setText(sBallsOfSocRating);
    }


}
