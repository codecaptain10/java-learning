package sudoku.userinterfaces;

import javafx.scene.input.KeyEvent;
import sudoku.problemdomain.SudokuGame;

public interface IUserInterfaceContract {

    interface  EventListener{
        void onSudokuInput(int x, int y, int input);
        void onDialogClick();
    }

    interface View{
        void handle(KeyEvent keyEvent);

        void setListener(IUserInterfaceContract.EventListener listener);
        void updateSquare(int x, int y, int input);
        void updateBoard(SudokuGame game);
        void showDialog(String Message);
        void showError(String message);
    }
}
