module app.sudoku {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.sudoku to javafx.fxml;
    exports app.sudoku;
    exports sudoku;
    opens sudoku to javafx.fxml;
}