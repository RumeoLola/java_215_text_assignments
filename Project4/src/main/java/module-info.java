module com.example.demo1project4 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires jdk.jdi;

    opens com.example.demo1project4 to javafx.fxml;
    exports com.example.demo1project4;
}