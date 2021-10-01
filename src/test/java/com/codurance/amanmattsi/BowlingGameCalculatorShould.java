package com.codurance.amanmattsi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BowlingGameCalculatorShould {

	@Test
	void create_a_game() {
		Game g = new Game();
	}

	@Test
	void roll_a_game_of_0() {
		Game g = new Game();
		int calculatedScore = g.calculateGameScore("00|00|00|00|00|00|00|00|00|00");

		assertEquals(0, calculatedScore);
	}
}
