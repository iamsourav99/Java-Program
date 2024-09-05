import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTEst {

	@Test
	public void test() {
		ReverseString str=new ReverseString();
		assertEquals(str.reverseString("java"), "avaj");
	}

}
