package junittestingpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumbers {

	@Test
	public void test() {
		addnumbers junit = new addnumbers();
		int result=junit.addnumbers(100, 200);
		assertEquals (300,result);
	}

}
