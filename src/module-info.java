module EmailClientJavaFX {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;

    opens com.stankowski;
    opens com.stankowski.view;
    opens com.stankowski.controller;
}