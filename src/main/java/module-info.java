module com.example.kursywalut {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kursywalut to javafx.fxml;
    exports com.example.kursywalut;
}