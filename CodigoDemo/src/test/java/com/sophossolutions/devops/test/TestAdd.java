package com.sophossolutions.devops.test;

import com.sophossolutions.devops.Calculator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TestAdd {

	@Test
	void testAdd() {
		Assertions.assertThat(Calculator.add(1, 2)).isEqualTo(3);
	}

}
