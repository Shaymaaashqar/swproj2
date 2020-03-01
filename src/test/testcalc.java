package test;


import java.calc;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
class testcalc {

	@Test
	void test() {
		calc obj = new calc();
		int f ; 
		f = obj.add(4,2);
		assertTrue(f==6);
		//fail("Not yet implemented");
	}

}
