package sample.Controllers;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import sample.Methods;

import java.math.BigDecimal;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller1Kurs {
    double ColLessons1k; //���������� ���
    static String Discipline = "";
    double Balls1k; //����� �� ���������� ������� �� ���������� ��������
    double dBallsOfCreativeRating;
    double dBallsOfControll;
    static double AllBalls;



     @FXML
     private ResourceBundle resources;

     @FXML
     private URL location;

     @FXML
     private Button ButtonBackMenu1k; //������ �������� � ����
    
     @FXML
     private MenuButton Select1k; //����� ����������

     @FXML
     private MenuItem BGD1k1s; //���

     @FXML
     private MenuItem ICIT1k1s;//�������������� ������� � ����������

     @FXML
     private MenuItem VishMatem1k1s; //������ ���������� 1 �������

     @FXML
     private MenuItem VishMatem1k2s; //������ ���������� 2 �������

     @FXML
     private MenuItem TCICA1k1s; //������ ������ � ��������� ������

     @FXML
     private MenuItem English1k1s; //����������� ���� 1 �������

     @FXML
     private MenuItem English1k2s; //����������� ���� 2 �������

     @FXML
     private MenuItem History1k1s; //�������

     @FXML
     private MenuItem Fizra1k1s; //���������� �������� 1-�� �������

     @FXML
     private MenuItem Fizra1k2s; //���������� �������� 2-�� �������

     @FXML
     private MenuItem ElDisPoFizreISport1k1s; //���������� ���������� �� ���������� �������� � ������ 1-�� �������

     @FXML
     private MenuItem ElDisPoFizreISport1k2s; //���������� ���������� �� ���������� �������� � ������ 2-�� �������
     //============================================

     @FXML
     private MenuItem Menegment1k2s; //����������

     @FXML
     private MenuItem OOP1k2s; //������ ��������-���������������� ����������������

     @FXML
     private MenuItem DiskrMat1k2s; //���������� ����������

     @FXML
     private MenuItem EtikaDel1k2s; //����� ������� ���������

     @FXML
     private MenuItem TIS1k2s; //������ �������������� ������

     @FXML
     private MenuItem Liderstvo1k2s; //���������

     @FXML
     private MenuItem SocPsihAdaptAndKommunic1k1s; //���������-��������������� ��������� � ������������

     @FXML
     private MenuItem PravAspektDeiatelInOlastInfKommunicTech1k2s; //�������� ������� ������������ � ������� ����������������������������� ����������

     @FXML
     private MenuItem OsnoviSovrEkonom1k1s; //������ ������������ ���������

     @FXML
     private MenuItem AlgoritmAndProgramm1k1s; //�������������� � ����������������

     @FXML
     private MenuItem DelovAndMeschkultKommun1k2s; //������� � ������������� ������������
//========================================

     @FXML
     private TextField ColLesBe1kk; // ���� ��� ����� ���������� �������

     @FXML
     private Label ColBALL1kk; // ����� ���������� ������ �� ���������

     @FXML
     private Label BallOneLes1kk; // ����� ���������� ������ �� ���� ���������� �������
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
            ControllerEnd.sBallsOfDiscipline="���������� ������ �� ��������� �"+Discipline+"�: " +String.valueOf(AllBalls);
        });
         

     }
     private void ShowDisciplineResult()
     {
         Balls1k = new Methods().BallsForVisit(ColLesBe1kk, Balls1k, ColLessons1k, ColBALL1kk,BallOneLes1kk);
         Balls1k = Math.round(Balls1k * 10.0) / 10.0;
         ShowCreativeRating();
         ShowControl();
         AllBalls = Balls1k + dBallsOfCreativeRating + dBallsOfControll;
         AllColOfBall.setText("����� ���������� ������: " + String.valueOf(AllBalls));
         MARK3.setText(String.valueOf(AllBalls));
//=======================================================

         if (AllBalls < 50){
             MARK3.setText(String.valueOf(50-AllBalls) + " ������");
             MARK4.setText(String.valueOf(70-AllBalls) + " ������");
             MARK5.setText(String.valueOf(85-AllBalls) + " ������");
         }

         if (AllBalls >=50 && AllBalls < 70)
         {
             MARK3.setText("0 ������. ������ ������� ��� ������!");
             MARK4.setText(String.valueOf(70-AllBalls) + " ������");
             MARK5.setText(String.valueOf(85-AllBalls) + " ������");
         }
         if (AllBalls < 85 && AllBalls >= 70)
         {
             MARK3.setText("0 ������. ������ ������� ��� ������!");
             MARK4.setText("0 ������. ������ ������� ��� ������!");
             MARK5.setText(String.valueOf(85-AllBalls) + " ������");
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
                 ErrorCreative.setText("������! ������������ ���������� ������ �� ���������� ������ � ������� ������ - 20 ������.");
             }
         }
         catch (Exception e)
         {
             ErrorCreative.setText("�� ����� �������� ������");
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
                 ErrorControll.setText("������! ������������ ���������� ������ �� ������� � �������� �������� - 20 ������.");
             }
         }
         catch (Exception e)
         {
             ErrorControll.setText("�� ����� �������� ������");
         }
     }
 }

