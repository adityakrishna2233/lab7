package junittestingpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class addstrings {

	@Test
	public void test() {
		addnumbers junitString = new addnumbers();
		String result =junitString.addstrings("bala", "aditya");
		assertEquals("balaaditya",result);
		
		
	}

}
