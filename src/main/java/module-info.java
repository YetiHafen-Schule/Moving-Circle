module com.example.movingcircle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.movingcircle to javafx.fxml;
    exports com.example.movingcircle;
}