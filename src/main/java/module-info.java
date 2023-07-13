module com.project.cs207groupproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.project.cs207groupproject to javafx.fxml;
    exports com.project.cs207groupproject;
}
