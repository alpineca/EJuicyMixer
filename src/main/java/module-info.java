module com.alpineca.liquidmixer {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires eu.hansolo.tilesfx;

    opens com.alpineca.liquidmixer to javafx.fxml;
    exports com.alpineca.liquidmixer;
    opens controllers to javafx.fxml;
    exports controllers;
}