module com.example.invent_manage_app {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;
    requires com.google.gson;


    opens com.example.invent_manage_app to javafx.fxml;
//    exports com.example.invent_manage_app;
    exports com.example.invent_manage_app.Controller;
    opens com.example.invent_manage_app.Controller to javafx.fxml;
    exports com.example.invent_manage_app.view;
    opens com.example.invent_manage_app.view to javafx.fxml;
    exports com.example.invent_manage_app;
}