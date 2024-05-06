package sample.Controllers;


import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import sample.Methods;

public class Controller2Kurs {

    double ColLessons2k; //Количество пар
    double Balls2k; //Баллы за выполнение заданий на аудиторных занятиях
    static String Discipline = "";
    double dBallsOfCreativeRating;
    double dBallsOfControll;
    static double AllBalls;


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ButtonBackMenu2k;

    @FXML
    private MenuButton Select2k;

    @FXML
    private MenuItem Filosofia2k1s;

    @FXML
    private MenuItem English2k1s;

    @FXML
    private MenuItem English2k2s;

    @FXML
    private MenuItem VicheslitSystems2k1s;

    @FXML
    private MenuItem ArhitekturaPredpiat2k2s;

    @FXML
    private MenuItem EkonomFirms2k2s;

    @FXML
    private MenuItem TVandMS2k1s;

    @FXML
    private MenuItem OperationSystem2k1s;

    @FXML
    private MenuItem InformTechnolAndSystemIn2k2s;

    @FXML
    private MenuItem WebProgram2k1s;

    @FXML
    private MenuItem UpravlenieInfSystem2k2s;

    @FXML
    private MenuItem ProgrammApp2k2s;

    @FXML
    private MenuItem InfMenegment2k2s;

    @FXML
    private MenuItem ElDisPoFizreISport2k1s;

    @FXML
    private MenuItem ElDisPoFizreISport2k2s;

    @FXML
    private MenuItem IsledOperAndMetodOptimiz2k2s;

    @FXML
    private MenuItem MatAndImitModelir2k2s;

    @FXML
    private MenuItem DateBase2k1s;

    @FXML
    private MenuItem DateBase2k2s;

    @FXML
    private MenuItem ProektInfSystem2k1s;

    @FXML
    private MenuItem ProektInfSystem2k2s;

    @FXML
    private MenuItem OrgDobrDeiatAndVzaim2k2s;

    @FXML
    private TextField ColLesBe2kk;

    @FXML
    private Label ColBALL2kk;

    @FXML
    private Label BallOneLes2kk;
    //================================================
    @FXML
    private TextField BallsOfCreativeRating;

    @FXML
    private TextField BallsOfControll;

    @FXML
    private Label MARK3;

    @FXML
    private Label MARK4;

    @FXML
    private Label MARK5;

    @FXML
    private Button ButtonCalculate;

    @FXML
    private Label ErrorCreative;

    @FXML
    private Label ErrorControll;

    @FXML
    private Label AllColOfBall;


    @FXML
    private Button ButtonNext;

    @FXML
    void initialize() {

        Filosofia2k1s.setOnAction(event -> {
            Select2k.setText(Filosofia2k1s.getText());
            ColLessons2k = 72;
            Discipline = Filosofia2k1s.getText();
        });

        English2k1s.setOnAction(event -> {
            Select2k.setText(English2k1s.getText());
            ColLessons2k = 36;
            Discipline = English2k1s.getText();
        });


        English2k2s.setOnAction(event -> {
            Select2k.setText(English2k2s.getText());
            ColLessons2k = 54;
            Discipline = English2k2s.getText();
        });


        VicheslitSystems2k1s.setOnAction(event -> {
            Select2k.setText(VicheslitSystems2k1s.getText());
            ColLessons2k = 72;
            Discipline = VicheslitSystems2k1s.getText();
        });

        ArhitekturaPredpiat2k2s.setOnAction(event -> {
            Select2k.setText(ArhitekturaPredpiat2k2s.getText());
            ColLessons2k = 72;
            Discipline = ArhitekturaPredpiat2k2s.getText();
        });

        EkonomFirms2k2s.setOnAction(event -> {
            Select2k.setText(EkonomFirms2k2s.getText());
            ColLessons2k = 54;
            Discipline = EkonomFirms2k2s.getText();
        });

        TVandMS2k1s.setOnAction(event -> {
            Select2k.setText(TVandMS2k1s.getText());
            ColLessons2k = 54;
            Discipline = TVandMS2k1s.getText();
        });

        OperationSystem2k1s.setOnAction(event -> {
            Select2k.setText(OperationSystem2k1s.getText());
            ColLessons2k = 54;
            Discipline = OperationSystem2k1s.getText();
        });

        InformTechnolAndSystemIn2k2s.setOnAction(event -> {
            Select2k.setText(InformTechnolAndSystemIn2k2s.getText());
            ColLessons2k = 54;
            Discipline = InformTechnolAndSystemIn2k2s.getText();
        });

        WebProgram2k1s.setOnAction(event -> {
            Select2k.setText(WebProgram2k1s.getText());
            ColLessons2k = 54;
            Discipline = WebProgram2k1s.getText();
        });

        UpravlenieInfSystem2k2s.setOnAction(event -> {
            Select2k.setText(UpravlenieInfSystem2k2s.getText());
            ColLessons2k = 54;
            Discipline = UpravlenieInfSystem2k2s.getText();
        });

        ProgrammApp2k2s.setOnAction(event -> {
            Select2k.setText(ProgrammApp2k2s.getText());
            ColLessons2k = 54;
            Discipline = ProgrammApp2k2s.getText();
        });

        InfMenegment2k2s.setOnAction(event -> {
            Select2k.setText(InfMenegment2k2s.getText());
            ColLessons2k = 54;
            Discipline = InfMenegment2k2s.getText();
        });

        ElDisPoFizreISport2k1s.setOnAction(event -> {
            Select2k.setText(ElDisPoFizreISport2k1s.getText());
            ColLessons2k = 27;
            Discipline = ElDisPoFizreISport2k1s.getText();
        });

        ElDisPoFizreISport2k2s.setOnAction(event -> {
            Select2k.setText(ElDisPoFizreISport2k2s.getText());
            ColLessons2k = 27;
            Discipline = ElDisPoFizreISport2k2s.getText();
        });

        IsledOperAndMetodOptimiz2k2s.setOnAction(event -> {
            Select2k.setText(IsledOperAndMetodOptimiz2k2s.getText());
            ColLessons2k = 54;
            Discipline = IsledOperAndMetodOptimiz2k2s.getText();
        });

        MatAndImitModelir2k2s.setOnAction(event -> {
            Select2k.setText(MatAndImitModelir2k2s.getText());
            ColLessons2k = 54;
            Discipline = MatAndImitModelir2k2s.getText();
        });

        DateBase2k1s.setOnAction(event -> {
            Select2k.setText(DateBase2k1s.getText());
            ColLessons2k = 36;
            Discipline = DateBase2k1s.getText();
        });

        DateBase2k2s.setOnAction(event -> {
            Select2k.setText(DateBase2k2s.getText());
            ColLessons2k = 54;
            Discipline = DateBase2k2s.getText();
        });

        ProektInfSystem2k1s.setOnAction(event -> {
            Select2k.setText(ProektInfSystem2k1s.getText());
            ColLessons2k = 72;
            Discipline = ProektInfSystem2k1s.getText();
        });

        ProektInfSystem2k2s.setOnAction(event -> {
            Select2k.setText(ProektInfSystem2k2s.getText());
            ColLessons2k = 72;
            Discipline = ProektInfSystem2k2s.getText();
        });

        OrgDobrDeiatAndVzaim2k2s.setOnAction(event -> {
            Select2k.setText(OrgDobrDeiatAndVzaim2k2s.getText());
            ColLessons2k = 18;
            Discipline = OrgDobrDeiatAndVzaim2k2s.getText();
        });

        ButtonBackMenu2k.setOnAction(event -> {
            new Methods().transition("/sample/FailFXML/Menu.fxml", ButtonBackMenu2k);

        });

        //==============================================
        ColLesBe2kk.setOnAction(event -> {
            Balls2k = new Methods().BallsForVisit(ColLesBe2kk, Balls2k, ColLessons2k, ColBALL2kk,BallOneLes2kk);
            Balls2k = Math.round(Balls2k * 10.0) / 10.0;


        });


        BallsOfCreativeRating.setOnAction(event -> {
            ShowCreativeRating();
        });

        BallsOfControll.setOnAction(actionEvent -> {
            ShowControl();
        });

        ButtonCalculate.setOnAction(event -> {
            ShowDisciplineResult();
        });

        ButtonNext.setOnAction(event -> {
            ControllerScienRating.Kurs = 2;
            ShowDisciplineResult();
            new Methods().transition("/sample/FailFXML/ScienRating.fxml", ButtonNext);
            ControllerEnd.sBallsOfDiscipline="Количество баллов по дициплине «"+Discipline+"»: " +String.valueOf(AllBalls);
        });
    }
    private void ShowDisciplineResult()
    {
        Balls2k = new Methods().BallsForVisit(ColLesBe2kk, Balls2k, ColLessons2k, ColBALL2kk,BallOneLes2kk);
        Balls2k = Math.round(Balls2k * 10.0) / 10.0;
        ShowCreativeRating();
        ShowControl();
        AllBalls = Balls2k + dBallsOfCreativeRating + dBallsOfControll;
        AllColOfBall.setText("Общее количество баллов: " + String.valueOf(AllBalls));
        MARK3.setText(String.valueOf(AllBalls));
//=======================================================
        if (AllBalls < 50){
            MARK3.setText(String.valueOf(50-AllBalls) + " баллов");
            MARK4.setText(String.valueOf(70-AllBalls) + " баллов");
            MARK5.setText(String.valueOf(85-AllBalls) + " баллов");
        }
        if (AllBalls >=50 && AllBalls < 70)
        {
            MARK3.setText("0 баллов. Баллов хватает для оценки!");
            MARK4.setText(String.valueOf(70-AllBalls) + " баллов");
            MARK5.setText(String.valueOf(85-AllBalls) + " баллов");
        }
        if (AllBalls < 85 && AllBalls >= 70)
        {
            MARK3.setText("0 баллов. Баллов хватает для оценки!");
            MARK4.setText("0 баллов. Баллов хватает для оценки!");
            MARK5.setText(String.valueOf(85-AllBalls) + " баллов");
        }

    }

    private void ShowCreativeRating()
    {
        try {
            dBallsOfCreativeRating = Integer.parseInt(BallsOfCreativeRating.getText());

            if (dBallsOfCreativeRating <= 20)
            {
                dBallsOfCreativeRating = Double.parseDouble(BallsOfCreativeRating.getText());
                ErrorCreative.setText("");
            }
            else {
                ErrorCreative.setText("Ошибка! Максимальное количество баллов за творческий подход к учебной работе - 20 баллов.");
            }
        }
        catch (Exception e)
        {
            ErrorCreative.setText("Вы ввели неверные данные");
        }
    }
    private void ShowControl()
    {
        try {
            dBallsOfControll = Integer.parseInt(BallsOfControll.getText());

            if (dBallsOfControll <= 20)
            {
                dBallsOfControll = Double.parseDouble(BallsOfControll.getText());
                ErrorControll.setText("");
            }
            else {
                ErrorControll.setText("Ошибка! Максимальное количество баллов за текущий и рубежный контроль - 20 баллов.");
            }
        }
        catch (Exception e)
        {
            ErrorControll.setText("Вы ввели неверные данные");
        }
    }
}
