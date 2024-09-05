package com.sourav.learnig;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalTest {

	@Test
	public void test() {
		Cal c =new Cal();
		int result=c.devide(10,5);
		int expectedResult=2;
		assertEquals(expectedResult, result);
		
	}

}
