package sudoku;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sudoku.userinterfaces.IUserInterfaceContract;
import sudoku.userinterfaces.UserInterfaceImpl;

import java.io.IOException;
import java.text.RBTableBuilder;

public class SudokuApplication extends Application {

    private IUserInterfaceContract.View uiImpl;



    @Override
    public void start(Stage stage) throws IOException {

        uiImpl = new UserInterfaceImpl(primaryStage);
        try {
            RBTableBuilder SudokuBuildLogic;
            SudokuBuildLogic.build(uiImpl);
        }catch(IOException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}