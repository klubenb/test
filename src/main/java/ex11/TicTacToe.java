package ex11;
//todo есть вопрос по упражнению
public class TicTacToe {
    char[][] field;
    boolean isXPlayerGoing;
    boolean isGameEnded;


    public TicTacToe() {
        newGame();

    }

    public void newGame() {
        this.field = new char[][]{{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
        isXPlayerGoing = true;
        isGameEnded = false;
    }

    public char[][] getField() {
        return field;
    }

    public String checkGame() {
        if ((field[0][0] == field[1][0] && field[0][0] == field[2][0] && whoGoingNow() == field[0][0]) ||
                (field[0][1] == field[1][1] && field[0][1] == field[2][1] && whoGoingNow() == field[0][1]) ||
                (field[0][2] == field[1][2] && field[0][2] == field[2][2] && whoGoingNow() == field[0][2]) ||
//                horizont
                (field[0][0] == field[0][1] && field[0][0] == field[0][2] && whoGoingNow() == field[0][0]) ||
                (field[1][0] == field[1][1] && field[1][0] == field[1][2] && whoGoingNow() == field[1][0]) ||
                (field[2][0] == field[2][1] && field[2][0] == field[2][2] && whoGoingNow() == field[2][0]) ||
//                vertical
                (field[0][0] == field[1][1] && field[0][0] == field[2][2] && whoGoingNow() == field[0][0]) ||
                (field[2][0] == field[1][1] && field[2][0] == field[0][2] && whoGoingNow() == field[2][0])) {

            return String.valueOf(whoGoingNow());
        }


        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == '-') {

                    return null;

                }
            }
        }
        return "D";

    }

    private char whoGoingNow() {
        if (isXPlayerGoing) {
//            isXPlayerGoing = false;
            return 'X';
        } else {
//            isXPlayerGoing = true;
            return '0';
        }
    }

    public String makeMove(int x, int y) {
        if (!isGameEnded) {
            if (!(field[x - 1][y - 1] == '-')) {
                return String.format("Cell %d, %d is already occupied", x, y);
            } else {
                field[x - 1][y - 1] = whoGoingNow();
                if (checkGame() == null) {
                    if (isXPlayerGoing) isXPlayerGoing = false;
                    else isXPlayerGoing = true;
                    return "Move completed";
                }else if ("X".equals(checkGame()) || "0".equals(checkGame())) {
                    isGameEnded = true;
                    return String.format("Player %s won", checkGame());
                } else if ("D".equals(checkGame())) {
                    isGameEnded = true;
                    return "Draw";
//            }else{
//                if(isXPlayerGoing) isXPlayerGoing = false;
//                else isXPlayerGoing = true;
//                return "Move completed";
                }
            }
        }
        return "Game was ended";
    }
}
