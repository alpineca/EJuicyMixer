module com.alpineca.liquidmixer {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.swing;
    requires org.testfx;
    requires org.testfx.junit;
    requires junit;

    requires eu.hansolo.tilesfx;
    requires javafx.graphics;

    opens com.alpineca.liquidmixer to javafx.fxml;
    exports com.alpineca.liquidmixer;
    opens controllers to javafx.fxml;
    exports controllers;
}