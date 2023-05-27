module com.example.learningjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.freshly to javafx.fxml;
    exports com.example.freshly;
}