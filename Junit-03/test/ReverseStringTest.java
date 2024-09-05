import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	ReverseString str=new ReverseString();
	@Test
	void test() { // name can be anything 
		
		assertEquals("avaj",str.reverseString("java"));
	}
	// we can write multiple test case methods ;
	// for that we should use @test annotation 
	@Test
	void testAnother() {
		assertEquals("tsubor si avaj",str.reverseString("java is robust"));
	}
}
