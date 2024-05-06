package sample.Controllers;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import sample.Methods;


public class Controller4Kurs {

    double ColLessons4k; //Количество пар
    double Balls4k; //Баллы за выполнение заданий на аудиторных занятиях
    static String Discipline = "";
    double dBallsOfCreativeRating;
    double dBallsOfControll;
    static double AllBalls;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuButton Select4k;

    @FXML
    private MenuItem ProektIntelInfSys4k1s;

    @FXML
    private MenuItem ProektSysUprZnan4k1s;

    @FXML
    private MenuItem ProektInfAnalisSys4k1s;

    @FXML
    private MenuItem ProektSysUprVzaim4k1s;

    @FXML
    private MenuItem MarkInfTehnAndUslug4k1s;

    @FXML
    private MenuItem UpravITProekt4k1s;

    @FXML
    private MenuItem TehnModelBusProc4k1s;

    @FXML
    private MenuItem TehnModelBusProc4k2s;

    @FXML
    private MenuItem TehnBigData4k2s;

    @FXML
    private MenuItem DevAvtSysUprPersonal4k1s;

    @FXML
    private TextField ColLesBe4kk; // Окно для ввода количества занятий

    @FXML
    private Label ColBALL4kk; // Вывод количество баллов за посещение

    @FXML
    private Label BallOneLes4kk; // Вывод количества баллов за одно посещенное занятие

    @FXML
    private Button ButtonBackMenu4k;

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

        ProektIntelInfSys4k1s.setOnAction(actionEvent -> {
            Select4k.setText(ProektIntelInfSys4k1s.getText());
            ColLessons4k = 72;
            Discipline = ProektIntelInfSys4k1s.getText();
        });

        ProektSysUprZnan4k1s.setOnAction(actionEvent -> {
            Select4k.setText(ProektSysUprZnan4k1s.getText());
            ColLessons4k = 72;
            Discipline = ProektSysUprZnan4k1s.getText();
        });

        ProektInfAnalisSys4k1s.setOnAction(actionEvent -> {
            Select4k.setText(ProektInfAnalisSys4k1s.getText());
            ColLessons4k = 72;
            Discipline = ProektInfAnalisSys4k1s.getText();
        });

        ProektSysUprVzaim4k1s.setOnAction(actionEvent -> {
            Select4k.setText(ProektSysUprVzaim4k1s.getText());
            ColLessons4k = 90;
            Discipline = ProektSysUprVzaim4k1s.getText();
        });

        MarkInfTehnAndUslug4k1s.setOnAction(actionEvent -> {
            Select4k.setText(MarkInfTehnAndUslug4k1s.getText());
            ColLessons4k = 54;
            Discipline = MarkInfTehnAndUslug4k1s.getText();
        });

        UpravITProekt4k1s.setOnAction(actionEvent -> {
            Select4k.setText(UpravITProekt4k1s.getText());
            ColLessons4k = 72;
            Discipline = UpravITProekt4k1s.getText();
        });

        TehnModelBusProc4k1s.setOnAction(actionEvent -> {
            Select4k.setText(TehnModelBusProc4k1s.getText());
            ColLessons4k = 54;
            Discipline = TehnModelBusProc4k1s.getText();
        });

        TehnModelBusProc4k2s.setOnAction(actionEvent -> {
            Select4k.setText(TehnModelBusProc4k2s.getText());
            ColLessons4k = 72;
            Discipline = TehnModelBusProc4k2s.getText();
        });

        TehnBigData4k2s.setOnAction(actionEvent -> {
            Select4k.setText(TehnBigData4k2s.getText());
            ColLessons4k = 72;
            Discipline = TehnBigData4k2s.getText();
        });

        DevAvtSysUprPersonal4k1s.setOnAction(actionEvent -> {
            Select4k.setText(DevAvtSysUprPersonal4k1s.getText());
            ColLessons4k = 72;
            Discipline = DevAvtSysUprPersonal4k1s.getText();
        });

        ButtonBackMenu4k.setOnAction(event -> {
            new Methods().transition("/sample/FailFXML/Menu.fxml", ButtonBackMenu4k);

        });


        //==============================================
        ColLesBe4kk.setOnAction(event -> {
            Balls4k = new Methods().BallsForVisit(ColLesBe4kk, Balls4k, ColLessons4k, ColBALL4kk,BallOneLes4kk);
            Balls4k = Math.round(Balls4k * 10.0) / 10.0;


        });


        BallsOfCreativeRating.setOnAction(event -> {
           ShowCreativeRating();
        });

        BallsOfControll.setOnAction(actionEvent -> {
           ShowControle();

        });

        ButtonCalculate.setOnAction(event -> {
            ShowDisciplineBall();
        });

        ButtonNext.setOnAction(event -> {
            ControllerScienRating.Kurs = 4;
            ShowDisciplineBall();
            new Methods().transition("/sample/FailFXML/ScienRating.fxml", ButtonNext);
            ControllerEnd.sBallsOfDiscipline="Количество баллов по дициплине «"+Discipline+"»: " +String.valueOf(AllBalls);

        });



    }
    private void ShowDisciplineBall()
    {
        Balls4k = new Methods().BallsForVisit(ColLesBe4kk, Balls4k, ColLessons4k, ColBALL4kk,BallOneLes4kk);
        Balls4k = Math.round(Balls4k * 10.0) / 10.0;
        ShowCreativeRating();
        ShowControle();
        AllBalls = Balls4k + dBallsOfCreativeRating + dBallsOfControll;
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

    private void ShowControle()
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
