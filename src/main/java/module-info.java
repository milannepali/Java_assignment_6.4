module com.example.java_assignment_6_4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_assignment_6_4 to javafx.fxml;
    exports com.example.java_assignment_6_4;
}