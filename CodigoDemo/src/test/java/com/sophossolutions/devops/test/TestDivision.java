package com.sophossolutions.devops.test;

import com.sophossolutions.devops.Calculator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TestDivision {

	@Test
	void testDivision() {
		Assertions.assertThat(Calculator.divide(10, 5)).isEqualTo(2);
		Assertions.assertThat(Calculator.divide(10, 3)).isEqualTo(3);
	}

	@Test
	void testDivisionByZero() {
		Assertions.assertThatThrownBy(() -> Calculator.divide(10, 0)).isInstanceOf(ArithmeticException.class);
	}

}
