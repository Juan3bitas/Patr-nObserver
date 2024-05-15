module co.edu.uniquindio.observer {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;

    opens co.edu.uniquindio.observer to javafx.fxml;
    exports co.edu.uniquindio.observer;

    opens co.edu.uniquindio.observer.controller;
    exports co.edu.uniquindio.observer.controller;
}
