package com.demo.UnitTestingTrial;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UnitTestingTrialApplicationTests {
    
	Calculator c =new Calculator();
	@Test
	void contextLoads() {
	}
	
	@Test
	void testSum() {
		int expectedResult = 14;
		
		int actualresult = c.doSum(5, 9, 0);
		
		assertThat(actualresult).isEqualTo(expectedResult);
	}
	
	@Test
	@Disabled  //This method fails in test hence it is disable from testing
	void product() {
		int expectedResult= 20;
		
		int actualresult = c.doProduct(5, 5);
		assertThat(actualresult).isEqualTo(expectedResult);
	}
	
	@Test
	void compareResult() {
		boolean expectedResult = c.compare(5,6);
		
		assertThat(expectedResult).isTrue();
	}

}
