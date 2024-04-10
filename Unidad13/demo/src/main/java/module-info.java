module ccgfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens ccgfx to javafx.fxml;
    exports ccgfx;
}
