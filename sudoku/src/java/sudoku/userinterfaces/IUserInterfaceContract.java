package sudoku.userinterfaces;

import sudoku.problemdomain.SudokuGame;

public interface IUserInterfaceContract {

    interface  EventListener{
        void onSudokuOnput(int x, int y, int input);
        void onDialogClick();
    }

    interface View{
        void setListener(IUserInterfaceContract.EventListener listener);
        void updateSquare(int x, int y, int input);
        void updateBoard(SudokuGame game);
        void showDialog(String Message);
        void showError(String message);
    }
}
