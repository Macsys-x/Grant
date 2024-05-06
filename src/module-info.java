module MyApplication {

    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.compiler;

    opens sample.Controllers to javafx.fxml;
    exports sample;

}