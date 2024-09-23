import java.util.Arrays;

public class TicTacToe {

    private int[] board;

    public TicTacToe() {
        board = new int[]{
                0, 0, 0,
                0, 0, 0,
                0, 0, 0
        };
    }

    public boolean makeMoveCross(int x, int y) {
        if (x >= 0 && x <= 3
                && y >= 0 && y <= 3){

            if (board[x * 3 + y] != 0) return false;

            board[x * 3 + y] = 1;

            return true;
        }
        return false;
    }

    public boolean makeMoveCircle(int x, int y) {
        if (x >= 0 && x <= 3
                && y >= 0 && y <= 3){

            if (board[x * 3 + y] != 0) return false;

            board[x * 3 + y] = 2;

            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s\n%s %s %s\n%s %s %s"
                , board[0], board[1], board[2]
                , board[3], board[4], board[5]
                , board[6], board[7], board[8]);
    }
}
