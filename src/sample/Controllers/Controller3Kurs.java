package sample.Controllers;


import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import sample.Methods;


public class Controller3Kurs {

    double ColLessons3k; //Количество пар
    double Balls3k; //Баллы за выполнение заданий на аудиторных занятиях
    static String Discipline = "";
    double dBallsOfCreativeRating;
    double dBallsOfControll;
    static double AllBalls;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuButton Select3k;

    @FXML
    private MenuItem InforSecurity3k2s;

    @FXML
    private MenuItem BuhUchet3k1s;

    @FXML
    private MenuItem ElDisPoFizreISport3k1s;

    @FXML
    private MenuItem ElDisPoFizreISport3k2s;

    @FXML
    private MenuItem English3k1s;

    @FXML
    private MenuItem English3k2s;

    @FXML
    private MenuItem UprElictrBusiness3k1s;

    @FXML
    private MenuItem DevelopSite3k1s;

    @FXML
    private MenuItem AvtSystemUpravSbitAndLog3k1s;

    @FXML
    private MenuItem SystemsElectrDokum3k2s;

    @FXML
    private MenuItem EkonomInfTehnAndSystem3k2s;

    @FXML
    private MenuItem InfSystemsInBuhUchet3k2s;

    @FXML
    private MenuItem AvtomSystemUprRes3k2s;

    @FXML
    private MenuItem DevelInforSystems3k1s;

    @FXML
    private MenuItem ProektPrakt3k1s;

    @FXML
    private MenuItem ProektPrakt3k2s;

    @FXML
    private MenuItem WorldInforSystemsAndAnalisInfMart3k1s;

    @FXML
    private MenuItem UpravCloudInfRes3k2s;

    @FXML
    private Button ButtonBackMenu3k;

    @FXML
    private TextField ColLesBe3kk; // Окно для ввода количества занятий

    @FXML
    private Label ColBALL3kk; // Вывод количество баллов за посещение

    @FXML
    private Label BallOneLes3kk; // Вывод количества баллов за одно посещенное занятие

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

        InforSecurity3k2s.setOnAction(actionEvent -> {
            Select3k.setText(InforSecurity3k2s.getText());
            ColLessons3k = 72;
            Discipline = InforSecurity3k2s.getText();
        });

        BuhUchet3k1s.setOnAction(actionEvent -> {
            Select3k.setText(BuhUchet3k1s.getText());
            ColLessons3k = 72;
            Discipline = BuhUchet3k1s.getText();
        });

        ElDisPoFizreISport3k1s.setOnAction(actionEvent -> {
            Select3k.setText(ElDisPoFizreISport3k1s.getText());
            ColLessons3k = 28;
            Discipline = ElDisPoFizreISport3k1s.getText();
        });

        ElDisPoFizreISport3k2s.setOnAction(actionEvent -> {
            Select3k.setText(ElDisPoFizreISport3k2s.getText());
            ColLessons3k = 28;
            Discipline = ElDisPoFizreISport3k2s.getText();
        });

        English3k1s.setOnAction(actionEvent -> {
            Select3k.setText(English3k1s.getText());
            ColLessons3k = 36;
            Discipline = English3k1s.getText();
        });

        English3k2s.setOnAction(actionEvent -> {
            Select3k.setText(English3k2s.getText());
            ColLessons3k = 54;
            Discipline = English3k2s.getText();
        });

        UprElictrBusiness3k1s.setOnAction(actionEvent -> {
            Select3k.setText(UprElictrBusiness3k1s.getText());
            ColLessons3k = 72;
            Discipline = UprElictrBusiness3k1s.getText();
        });

        DevelopSite3k1s.setOnAction(actionEvent -> {
            Select3k.setText(DevelopSite3k1s.getText());
            ColLessons3k = 54;
            Discipline = DevelopSite3k1s.getText();
        });

        AvtSystemUpravSbitAndLog3k1s.setOnAction(actionEvent -> {
            Select3k.setText(AvtSystemUpravSbitAndLog3k1s.getText());
            ColLessons3k = 72;
            Discipline = AvtSystemUpravSbitAndLog3k1s.getText();
        });

        SystemsElectrDokum3k2s.setOnAction(actionEvent -> {
            Select3k.setText(SystemsElectrDokum3k2s.getText());
            ColLessons3k = 72;
            Discipline = SystemsElectrDokum3k2s.getText();
        });

        EkonomInfTehnAndSystem3k2s.setOnAction(actionEvent -> {
            Select3k.setText(EkonomInfTehnAndSystem3k2s.getText());
            ColLessons3k = 54;
            Discipline = EkonomInfTehnAndSystem3k2s.getText();
        });

        InfSystemsInBuhUchet3k2s.setOnAction(actionEvent -> {
            Select3k.setText(InfSystemsInBuhUchet3k2s.getText());
            ColLessons3k = 72;
            Discipline = InfSystemsInBuhUchet3k2s.getText();
        });

        AvtomSystemUprRes3k2s.setOnAction(actionEvent -> {
            Select3k.setText(AvtomSystemUprRes3k2s.getText());
            ColLessons3k = 90;
            Discipline = AvtomSystemUprRes3k2s.getText();
        });

        DevelInforSystems3k1s.setOnAction(actionEvent -> {
            Select3k.setText(DevelInforSystems3k1s.getText());
            ColLessons3k = 108;
            Discipline = DevelInforSystems3k1s.getText();
        });

        ProektPrakt3k1s.setOnAction(actionEvent -> {
            Select3k.setText(ProektPrakt3k1s.getText());
            ColLessons3k = 72;
            Discipline = ProektPrakt3k1s.getText();
        });

        ProektPrakt3k2s.setOnAction(actionEvent -> {
            Select3k.setText(ProektPrakt3k2s.getText());
            ColLessons3k = 72;
            Discipline = ProektPrakt3k2s.getText();
        });

        WorldInforSystemsAndAnalisInfMart3k1s.setOnAction(actionEvent -> {
            Select3k.setText(WorldInforSystemsAndAnalisInfMart3k1s.getText());
            ColLessons3k = 36;
            Discipline = WorldInforSystemsAndAnalisInfMart3k1s.getText();
        });

        UpravCloudInfRes3k2s.setOnAction(actionEvent -> {
            Select3k.setText(UpravCloudInfRes3k2s.getText());
            ColLessons3k = 36;
            Discipline = UpravCloudInfRes3k2s.getText();
        });


        ButtonBackMenu3k.setOnAction(event -> {
            new Methods().transition("/sample/FailFXML/Menu.fxml", ButtonBackMenu3k);

        });


        //==============================================
        ColLesBe3kk.setOnAction(event -> {
            Balls3k = new Methods().BallsForVisit(ColLesBe3kk, Balls3k, ColLessons3k, ColBALL3kk,BallOneLes3kk);
            Balls3k = Math.round(Balls3k * 10.0) / 10.0;


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
            ControllerScienRating.Kurs = 3;
            ShowDisciplineResult();
            new Methods().transition("/sample/FailFXML/ScienRating.fxml", ButtonNext);
            ControllerEnd.sBallsOfDiscipline="Количество баллов по дициплине «"+Discipline+"»: " +String.valueOf(AllBalls);
        });


    }
    private void ShowDisciplineResult()
    {
        Balls3k = new Methods().BallsForVisit(ColLesBe3kk, Balls3k, ColLessons3k, ColBALL3kk,BallOneLes3kk);
        Balls3k = Math.round(Balls3k * 10.0) / 10.0;
        ShowCreativeRating();
        ShowControl();
        AllBalls = Balls3k + dBallsOfCreativeRating + dBallsOfControll;
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
