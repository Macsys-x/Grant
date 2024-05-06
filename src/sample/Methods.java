package sample;

import javafx.fxml.FXMLLoader; 
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



import java.io.IOException;
import java.net.URL;

public class Methods {


    public void transition(String fxml, Button button)
    {

        button.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = getClass().getResource(fxml);
        loader.setLocation(xmlUrl);
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();



    }


    public double BallsForVisit(TextField ColLesBe, double Ball,double ColLessons, Label ColBALL, Label BallOneLes)
    {
        try {
            double ColLesBe1k = Double.parseDouble(ColLesBe.getText());
            double Balls = (20 / ColLessons) * ColLesBe1k;
            double BallOneLessons = 20 / ColLessons;

            int Col = (int) ColLessons;
            if (Balls <= 20) {

                ColBALL.setText(String.valueOf(String.format("%.1f", Balls)) + " балл(ов)");
                BallOneLes.setText("Количество баллов за посещение одного занятия: " + String.valueOf(BallOneLessons));
                return Balls;
            } else {
                ColBALL.setText("Число посещенных занятий введено неверно, так как \nпревышает общее число занятий (" + String.valueOf(Col) + ")!");
                Balls = 0;
            }
        } catch (Exception e) {
            ColBALL.setText("Вы ввели некорректные данные!");
        }
        return 0;
    }






}
