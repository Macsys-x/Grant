package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.Methods;

public class ControllerSocRating {
int iStudentKurator=20,iStarostaGroup=30,iPresidentCC=100,iZamPresidentCC=90, iDirectorKomCC=70, iStarostaOfFloor=35;
int iUniversityChiefOrganizer=50, iUniversityZamChiefOrganizer=25, iUniversityCommandChiefOrganizer=20;
int iCommActivitiesChiefOrganizer=25, iCommActivitiesZamChiefOrganizer=15, iCommActivitiesCommandChiefOrganizer=10;
int iCommanderAndCommissioner=45,iCentralSectionCommittee=2,iSelectionCommissions=2;
double iTimLider = 0.75;
    double iVolonterReu=0.25;
    double iFighter=0.25;
    static double iColBallsOfSocRating;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private CheckBox StudentKurator;

    @FXML
    private CheckBox StarostaGroup;

    @FXML
    private CheckBox PresidentCC;

    @FXML
    private CheckBox ZamPresidentCC;

    @FXML
    private CheckBox DirectorKomCC;

    @FXML
    private CheckBox StarostaOfFloor;

    @FXML
    private CheckBox TimLider;

    @FXML
    private CheckBox VolonterReu;

    @FXML
    private TextField ColTimLider;

    @FXML
    private TextField ColVolonterReu;

    @FXML
    private CheckBox UniversityChiefOrganizer;

    @FXML
    private CheckBox UniversityZamChiefOrganizer;

    @FXML
    private CheckBox UniversityCommandChiefOrganizer;

    @FXML
    private CheckBox CommActivitiesChiefOrganizer;

    @FXML
    private CheckBox CommActivitiesZamChiefOrganizer;

    @FXML
    private CheckBox CommActivitiesCommandChiefOrganizer;

    @FXML
    private CheckBox CommanderAndCommissioner;

    @FXML
    private CheckBox Fighter;

    @FXML
    private TextField ColFighter;

    @FXML
    private CheckBox CentralSectionCommittee;

    @FXML
    private CheckBox SelectionCommissions;

    @FXML
    private TextField ColCentralSectionCommittee;

    @FXML
    private TextField ColSelectionCommissions;

    @FXML
    private Label ColBallsOfSocRating;

    @FXML
    private Button ButtonCalc;

    @FXML
    private Button ButtonEnd;

    @FXML
    private Button ButtonBack;

    @FXML
    void initialize() {
        ButtonBack.setOnAction(event -> {
            new Methods().transition("/sample/FailFXML/ScienRating.fxml", ButtonBack);
        });

        ButtonCalc.setOnAction(event -> {
            ShowSocResult();
        });

        ButtonEnd.setOnAction(event -> {
           //===================================================
                ShowSocResult();
           //====================================================
            new Methods().transition("/sample/FailFXML/End.fxml", ButtonEnd);
            ControllerEnd.sBallsOfSocRating = "Количество баллов социального рейтинга: "  + String.valueOf(iColBallsOfSocRating);
        });


    }
    private void ShowSocResult()
    {

        iColBallsOfSocRating=0;

        if (StudentKurator.isSelected()) {
            iColBallsOfSocRating += iStudentKurator;
        }

        if (StarostaGroup.isSelected()) {
            iColBallsOfSocRating += iStarostaGroup;
        }

        if (PresidentCC.isSelected()) {
            iColBallsOfSocRating += iPresidentCC;
        }

        if (ZamPresidentCC.isSelected()) {
            iColBallsOfSocRating += iZamPresidentCC;
        }

        if (DirectorKomCC.isSelected()) {
            iColBallsOfSocRating += iDirectorKomCC;
        }

        if (StarostaOfFloor.isSelected()) {
            iColBallsOfSocRating += iStarostaOfFloor;
        }
        try {
            if (TimLider.isSelected()) {
                iColBallsOfSocRating += (iTimLider*Integer.valueOf(ColTimLider.getText()));
            }}
        catch (Exception e)
        {

        }


        try {
            if (VolonterReu.isSelected()) {
                iColBallsOfSocRating += (iVolonterReu*Integer.valueOf(ColVolonterReu.getText()));
            }}
        catch (Exception e)
        {

        }

        if (UniversityChiefOrganizer.isSelected()) {
            iColBallsOfSocRating += iUniversityChiefOrganizer;
        }

        if (UniversityZamChiefOrganizer.isSelected()) {
            iColBallsOfSocRating += iUniversityZamChiefOrganizer;
        }

        if (UniversityCommandChiefOrganizer.isSelected()) {
            iColBallsOfSocRating += iUniversityCommandChiefOrganizer;
        }
        if (CommActivitiesChiefOrganizer.isSelected()) {
            iColBallsOfSocRating += iCommActivitiesChiefOrganizer;
        }

        if (CommActivitiesZamChiefOrganizer.isSelected()) {
            iColBallsOfSocRating += iCommActivitiesZamChiefOrganizer;
        }

        if (CommActivitiesCommandChiefOrganizer.isSelected()) {
            iColBallsOfSocRating += iCommActivitiesCommandChiefOrganizer;
        }

        if (CommanderAndCommissioner.isSelected()) {
            iColBallsOfSocRating += iCommanderAndCommissioner;
        }

        try {
            if (Fighter.isSelected()) {
                iColBallsOfSocRating += (iFighter*Integer.valueOf(ColFighter.getText()));
            }}

        catch (Exception e)
        {

        }

        try {
            if (CentralSectionCommittee.isSelected()) {
                iColBallsOfSocRating += (iCentralSectionCommittee*Integer.valueOf(ColCentralSectionCommittee.getText()));
            }}
        catch (Exception e)
        {

        }
        try {
            if (SelectionCommissions.isSelected()) {
                iColBallsOfSocRating += (iSelectionCommissions*Integer.valueOf(ColSelectionCommissions.getText()));
            }}
        catch (Exception e)
        {

        }
        try {
            if (iColBallsOfSocRating>100)
            {
                iColBallsOfSocRating=100;
            }}
        catch (Exception e)
        {

        }



        ColBallsOfSocRating.setText("Количество баллов социального рейтинга: " + String.valueOf(iColBallsOfSocRating));
    }
}
