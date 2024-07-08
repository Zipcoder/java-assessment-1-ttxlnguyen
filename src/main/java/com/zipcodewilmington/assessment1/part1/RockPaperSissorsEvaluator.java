package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String winningSign = "";

        switch (handSign) {
            case "rock":
                winningSign = "paper";
                break;
            case "paper":
                winningSign = "scissors";
                break;
            case "scissors":
                winningSign = "rock";
                break;
        }

        return winningSign;
//        return null;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String losingSign = "";

        switch (handSign) {
            case "rock":
                losingSign = "scissor";
                break;
            case "paper":
                losingSign = "rock";
                break;
            case "scissors":
                losingSign = "paper";
                break;
        }

        return losingSign;
//        return null;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String determine = "";

        switch (handSignOfPlayer1) {
            case "rock":
                determine = "rock";
        }

        return determine;
//        return null;
    }
}
