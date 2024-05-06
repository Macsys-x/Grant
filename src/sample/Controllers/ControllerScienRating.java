package sample.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import sample.Methods;

public class ControllerScienRating {
int iInternationalWin = 20, iInternationalPartic=15, iRegionWin=15, iRegionPartic=10, iInsideVuzWin=10, iInsideVuzPartic=5;
int iParticRubezhPartic=30, iParticRubezhPrize=20, iParticRFPartic=20, iParticRFPrize=15, iParticRegionPartic=15, iParticRegionPrize=10;
int iParticKafedraPartic=10, iParticKafedraPrize=5, iParticWithStandInKonferenc=10, iResearchWork=20, iCollectInformation=15;
int iWorkInScientificCircles=10, iPublicationInScopusWos=70, iPublicationInBAK=40, iPublicationInRinc=15;
int iPublicationInOther=10, iAvtorIzobret=70, iAvtorOfProgramm=40;
double ColBallsOfScienRatingi;
static int Kurs;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private CheckBox InternationalWin;

    @FXML
    private CheckBox InternationalPartic;

    @FXML
    private CheckBox RegionWin;

    @FXML
    private CheckBox RegionPartic;

    @FXML
    private CheckBox InsideVuzWin;

    @FXML
    private CheckBox InsideVuzPartic;

    @FXML
    private CheckBox ParticRubezhPartic;

    @FXML
    private CheckBox ParticRubezhPrize;

    @FXML
    private CheckBox ParticRFPartic;

    @FXML
    private CheckBox ParticRFPrize;

    @FXML
    private CheckBox ParticRegionPartic;

    @FXML
    private CheckBox ParticRegionPrize;

    @FXML
    private CheckBox ParticKafedraPartic;

    @FXML
    private CheckBox ParticKafedraPrize;

    @FXML
    private CheckBox ParticWithStandInKonferenc;

    @FXML
    private CheckBox ResearchWork;

    @FXML
    private CheckBox CollectInformation;

    @FXML
    private CheckBox WorkInScientificCircles;

    @FXML
    private CheckBox PublicationInScopusWos;

    @FXML
    private CheckBox PublicationInBAK;

    @FXML
    private CheckBox PublicationInRinc;

    @FXML
    private CheckBox PublicationInOther;

    @FXML
    private CheckBox AvtorIzobret;

    @FXML
    private CheckBox AvtorOfProgramm;

    @FXML
    private Label ColBallsOfScienRating;

    @FXML
    private Button ButtonCalc;

    @FXML
    private Button ButtonNext;

    @FXML
    private Button ButtonBack;

    @FXML
    void initialize() {
        ButtonBack.setOnAction(event -> {

                if (Kurs == 1) {
                    new Methods().transition("/sample/FailFXML/BallsForBe1Kurs.fxml", ButtonBack);
                }
            if (Kurs == 2) {
                new Methods().transition("/sample/FailFXML/BallsForBe2Kurs.fxml", ButtonBack);
            }
            if (Kurs == 3) {
                new Methods().transition("/sample/FailFXML/BallsForBe3Kurs.fxml", ButtonBack);
            }
            if (Kurs == 4) {
                new Methods().transition("/sample/FailFXML/BallsForBe4Kurs.fxml", ButtonBack);
            }
        });

        ButtonCalc.setOnAction(event -> {
            ShowScienResult();
        });

        ButtonNext.setOnAction(event -> {
            //========================================================

            ShowScienResult();

            //===========================================================
            new Methods().transition("/sample/FailFXML/SocRating.fxml", ButtonNext);
            ControllerEnd.sBallsOfScienRating = "Количество баллов научного рейтинга: "  + String.valueOf(ColBallsOfScienRatingi);

        });



    }

    private void ShowScienResult()
    {
        ColBallsOfScienRatingi = 0;
        if (InternationalWin.isSelected()) {
            ColBallsOfScienRatingi += iInternationalWin;
        }
        if (InternationalPartic.isSelected()) {
            ColBallsOfScienRatingi += iInternationalPartic;
        }
        if (RegionWin.isSelected()) {
            ColBallsOfScienRatingi += iRegionWin;
        }
        if (RegionPartic.isSelected()) {
            ColBallsOfScienRatingi += iRegionPartic;
        }
        if (InsideVuzWin.isSelected()) {
            ColBallsOfScienRatingi += iInsideVuzWin;
        }
        if (InsideVuzPartic.isSelected()) {
            ColBallsOfScienRatingi += iInsideVuzPartic;
        }


        if (ParticRubezhPartic.isSelected()) {
            ColBallsOfScienRatingi += iParticRubezhPartic;
        }

        if (ParticRubezhPrize.isSelected()) {
            ColBallsOfScienRatingi += iParticRubezhPrize;
        }

        if (ParticRFPartic.isSelected()) {
            ColBallsOfScienRatingi += iParticRFPartic;
        }

        if (ParticRFPrize.isSelected()) {
            ColBallsOfScienRatingi += iParticRFPrize;
        }

        if (ParticRegionPartic.isSelected()) {
            ColBallsOfScienRatingi += iParticRegionPartic;
        }

        if (ParticRegionPrize.isSelected()) {
            ColBallsOfScienRatingi += iParticRegionPrize;
        }

        if (ParticKafedraPartic.isSelected()) {
            ColBallsOfScienRatingi += iParticKafedraPartic;
        }

        if (ParticKafedraPrize.isSelected()) {
            ColBallsOfScienRatingi += iParticKafedraPrize;
        }

        if (ParticWithStandInKonferenc.isSelected()) {
            ColBallsOfScienRatingi += iParticWithStandInKonferenc;
        }

        if (ResearchWork.isSelected()) {
            ColBallsOfScienRatingi += iResearchWork;
        }

        if (CollectInformation.isSelected()) {
            ColBallsOfScienRatingi += iCollectInformation;
        }

        if (WorkInScientificCircles.isSelected()) {
            ColBallsOfScienRatingi += iWorkInScientificCircles;
        }

        if (PublicationInScopusWos.isSelected()) {
            ColBallsOfScienRatingi += iPublicationInScopusWos;
        }

        if (PublicationInBAK.isSelected()) {
            ColBallsOfScienRatingi += iPublicationInBAK;
        }

        if (PublicationInRinc.isSelected()) {
            ColBallsOfScienRatingi += iPublicationInRinc;
        }

        if (PublicationInOther.isSelected()) {
            ColBallsOfScienRatingi += iPublicationInOther;
        }

        if (AvtorIzobret.isSelected()) {
            ColBallsOfScienRatingi += iAvtorIzobret;
        }

        if (AvtorOfProgramm.isSelected()) {
            ColBallsOfScienRatingi += iAvtorOfProgramm;
        }



        if (ColBallsOfScienRatingi > 200) {
            ColBallsOfScienRatingi = 200;
        }



        ColBallsOfScienRating.setText("Количество баллов научного рейтинга: "  + String.valueOf(ColBallsOfScienRatingi));
    }
}
