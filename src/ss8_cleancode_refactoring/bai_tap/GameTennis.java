package ss8_cleancode_refactoring.bai_tap;

public class GameTennis {
    public static String getScore(String player1Name, String player2Name, int player1point, int player2point) {
        boolean isScore = player1point == player2point;
        boolean isStop = (player1point >= 4 || player2point >= 4);
        if (isScore) {
            return getEqualScore(player1point);
        }
        if (isStop) {
            return getStopGame(player1point, player2point);
        }
        String score = getScorePlayer(player1point) + " - " + getScorePlayer(player2point);
        return score;
    }

    public static String getEqualScore(int equalScore) {
        switch (equalScore) {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            case 3:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    public static String getScorePlayer(int playerScore) {
        switch (playerScore) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
            default:
                return "";
        }
    }

    public static String getStopGame(int player1Score, int player2Score) {
        int minusResult = player1Score - player2Score;
        if (minusResult == 1) {
            return "Advantage player1";
        } else if (minusResult == -1) {
            return "Advantage player2";
        } else if (minusResult >= 2) {
            return player1Score + " - " + player2Score + ": Win for player1";
        } else {
            return player1Score + " - " + player2Score + ": Win for player2";
        }
    }
}
