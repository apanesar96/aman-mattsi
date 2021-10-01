package com.codurance.amanmattsi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BowlingGameCalculatorShould {

	private Game game;

	@BeforeEach
	void setUp() {
		game = new Game();
	}

	@Test
	void roll_a_game_of_0() {
		int calculatedScore = game.calculateGameScore("00|00|00|00|00|00|00|00|00|00");

		assertEquals(0, calculatedScore);
	}

	@Test
	void roll_a_game_of_all_ones() {
		int calculatedScore = game.calculateGameScore("11|11|11|11|11|11|11|11|11|11");

		assertEquals(20, calculatedScore);
	}
}
