package com.codurance.amanmattsi;

import java.util.stream.IntStream;

public class Game {
    public int calculateGameScore(String gameNotation) {
        String[] formattedGameNotation = gameNotation.split("\\|");
        int score = 0;
        for (String frame : formattedGameNotation) {
            char[] pins = frame.toCharArray();
            score += Character.getNumericValue(pins[0]) + Character.getNumericValue(pins[1]);
        }
        return score;
    }
}
