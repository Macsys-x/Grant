package sample.Controllers;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import sample.Methods;

import java.math.BigDecimal;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller1Kurs {
    double ColLessons1k; //Количество пар
    static String Discipline = "";
    double Balls1k; //Баллы за выполнение заданий на аудиторных занятиях
    double dBallsOfCreativeRating;
    double dBallsOfControll;
    static double AllBalls;



     @FXML
     private ResourceBundle resources;

     @FXML
     private URL location;

     @FXML
     private Button ButtonBackMenu1k; //Кнопка возврата в меню
    
     @FXML
     private MenuButton Select1k; //Выбор дисциплины

     @FXML
     private MenuItem BGD1k1s; //БЖД

     @FXML
     private MenuItem ICIT1k1s;//Информационные системы и технологии

     @FXML
     private MenuItem VishMatem1k1s; //Высшая математика 1 семестр

     @FXML
     private MenuItem VishMatem1k2s; //Высшая математика 2 семестр

     @FXML
     private MenuItem TCICA1k1s; //Теория систем и системный анализ

     @FXML
     private MenuItem English1k1s; //Иностранный язык 1 семестр

     @FXML
     private MenuItem English1k2s; //Иностранный язык 2 семестр

     @FXML
     private MenuItem History1k1s; //История

     @FXML
     private MenuItem Fizra1k1s; //Физическая культура 1-ый семестр

     @FXML
     private MenuItem Fizra1k2s; //Физическая культура 2-ой семестр

     @FXML
     private MenuItem ElDisPoFizreISport1k1s; //Элективные дисциплине по физической культуре и спорту 1-ый семестр

     @FXML
     private MenuItem ElDisPoFizreISport1k2s; //Элективные дисциплине по физической культуре и спорту 2-ой семестр
     //============================================

     @FXML
     private MenuItem Menegment1k2s; //Менеджмент

     @FXML
     private MenuItem OOP1k2s; //Основы объектно-ориентированного программирования

     @FXML
     private MenuItem DiskrMat1k2s; //Дискретная математика

     @FXML
     private MenuItem EtikaDel1k2s; //Этика деловых отношений

     @FXML
     private MenuItem TIS1k2s; //Теория информационных систем

     @FXML
     private MenuItem Liderstvo1k2s; //Лидерство

     @FXML
     private MenuItem SocPsihAdaptAndKommunic1k1s; //Социально-психологическая адаптация и коммуникации

     @FXML
     private MenuItem PravAspektDeiatelInOlastInfKommunicTech1k2s; //Правовые аспекты деятельности в области информационнокоммуникационных технологий

     @FXML
     private MenuItem OsnoviSovrEkonom1k1s; //Основы совремменной экономики

     @FXML
     private MenuItem AlgoritmAndProgramm1k1s; //Алгоритмизация и программирование

     @FXML
     private MenuItem DelovAndMeschkultKommun1k2s; //Деловые и межкультурные коммуникации
//========================================

     @FXML
     private TextField ColLesBe1kk; // Окно для ввода количества занятий

     @FXML
     private Label ColBALL1kk; // Вывод количество баллов за посещение

     @FXML
     private Label BallOneLes1kk; // Вывод количества баллов за одно посещенное занятие
//========================================

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
    //==============================

    @FXML
    private Button ButtonNext;

     @FXML
     void initialize() {
         BGD1k1s.setOnAction(event -> {
             Select1k.setText(BGD1k1s.getText());
             ColLessons1k = 36;
             Discipline = BGD1k1s.getText();
         });

         ICIT1k1s.setOnAction(event -> {
             Select1k.setText(ICIT1k1s.getText());
             ColLessons1k = 72;
             Discipline = ICIT1k1s.getText();
         });

         VishMatem1k1s.setOnAction(event -> {
             Select1k.setText(VishMatem1k1s.getText());
             ColLessons1k = 54;
             Discipline = VishMatem1k1s.getText();
         });

         VishMatem1k2s.setOnAction(event -> {
             Select1k.setText(VishMatem1k2s.getText());
             ColLessons1k = 72;
             Discipline = VishMatem1k2s.getText();
         });


         TCICA1k1s.setOnAction(event -> {
             Select1k.setText(TCICA1k1s.getText());
             ColLessons1k = 72;
             Discipline = TCICA1k1s.getText();
         });


         English1k1s.setOnAction(event -> {
             Select1k.setText(English1k1s.getText());
             ColLessons1k = 36;
             Discipline = English1k1s.getText();
         });

         English1k2s.setOnAction(event -> {
             Select1k.setText(English1k2s.getText());
             ColLessons1k = 36;
             Discipline = English1k2s.getText();
         });

         History1k1s.setOnAction(event -> {
             Select1k.setText(History1k1s.getText());
             ColLessons1k = 54;
             Discipline = History1k1s.getText();
         });

         Fizra1k1s.setOnAction(event -> {
             Select1k.setText(Fizra1k1s.getText());
             ColLessons1k = 18;
             Discipline = Fizra1k1s.getText();
         });

         Fizra1k2s.setOnAction(event -> {
             Select1k.setText(Fizra1k2s.getText());
             ColLessons1k = 18;
             Discipline = Fizra1k2s.getText();
         });


         ElDisPoFizreISport1k1s.setOnAction(event -> {
             Select1k.setText(ElDisPoFizreISport1k1s.getText());
             ColLessons1k = 27;
             Discipline = ElDisPoFizreISport1k1s.getText();
         });

         ElDisPoFizreISport1k2s.setOnAction(event -> {
             Select1k.setText(ElDisPoFizreISport1k2s.getText());
             ColLessons1k = 27;
             Discipline = ElDisPoFizreISport1k2s.getText();
         });

         //==============================================

         Menegment1k2s.setOnAction(event -> {
             Select1k.setText(Menegment1k2s.getText());
             ColLessons1k = 54;
             Discipline = Menegment1k2s.getText();
         });

         OOP1k2s.setOnAction(event -> {
             Select1k.setText(OOP1k2s.getText());
             ColLessons1k = 72;
             Discipline = OOP1k2s.getText();
         });


         DiskrMat1k2s.setOnAction(event -> {
             Select1k.setText(DiskrMat1k2s.getText());
             ColLessons1k = 72;
             Discipline = DiskrMat1k2s.getText();
         });


         EtikaDel1k2s.setOnAction(event -> {
             Select1k.setText(EtikaDel1k2s.getText());
             ColLessons1k = 54;
             Discipline = EtikaDel1k2s.getText();
         });


         TIS1k2s.setOnAction(event -> {
             Select1k.setText(TIS1k2s.getText());
             ColLessons1k = 72;
             Discipline = TIS1k2s.getText();
         });

         Liderstvo1k2s.setOnAction(event -> {
             Select1k.setText(Liderstvo1k2s.getText());
             ColLessons1k = 36;
             Discipline = Liderstvo1k2s.getText();
         });



         SocPsihAdaptAndKommunic1k1s.setOnAction(event -> {
             Select1k.setText(SocPsihAdaptAndKommunic1k1s.getText());
             ColLessons1k = 36;
             Discipline = SocPsihAdaptAndKommunic1k1s.getText();
         });

         PravAspektDeiatelInOlastInfKommunicTech1k2s.setOnAction(event -> {
             Select1k.setText(PravAspektDeiatelInOlastInfKommunicTech1k2s.getText());
             ColLessons1k = 72;
             Discipline = PravAspektDeiatelInOlastInfKommunicTech1k2s.getText();
         });

         OsnoviSovrEkonom1k1s.setOnAction(event -> {
             Select1k.setText(OsnoviSovrEkonom1k1s.getText());
             ColLessons1k = 72;
             Discipline = OsnoviSovrEkonom1k1s.getText();
         });

         AlgoritmAndProgramm1k1s.setOnAction(event -> {
             Select1k.setText(AlgoritmAndProgramm1k1s.getText());
             ColLessons1k = 72;
             Discipline = AlgoritmAndProgramm1k1s.getText();
         });

         DelovAndMeschkultKommun1k2s.setOnAction(event -> {
             Select1k.setText(DelovAndMeschkultKommun1k2s.getText());
             ColLessons1k = 54;
             Discipline = DelovAndMeschkultKommun1k2s.getText();
         });



         ButtonBackMenu1k.setOnAction(event -> {
             new Methods().transition("/sample/FailFXML/Menu.fxml", ButtonBackMenu1k);

         });

                

         //==============================================
         ColLesBe1kk.setOnAction(event -> {
             Balls1k = new Methods().BallsForVisit(ColLesBe1kk, Balls1k, ColLessons1k, ColBALL1kk,BallOneLes1kk);
             Balls1k = Math.round(Balls1k * 10.0) / 10.0;


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
            ControllerScienRating.Kurs = 1;
            ShowDisciplineResult();
            new Methods().transition("/sample/FailFXML/ScienRating.fxml", ButtonNext);
            ControllerEnd.sBallsOfDiscipline="Количество баллов по дициплине «"+Discipline+"»: " +String.valueOf(AllBalls);
        });
         

     }
     private void ShowDisciplineResult()
     {
         Balls1k = new Methods().BallsForVisit(ColLesBe1kk, Balls1k, ColLessons1k, ColBALL1kk,BallOneLes1kk);
         Balls1k = Math.round(Balls1k * 10.0) / 10.0;
         ShowCreativeRating();
         ShowControl();
         AllBalls = Balls1k + dBallsOfCreativeRating + dBallsOfControll;
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

