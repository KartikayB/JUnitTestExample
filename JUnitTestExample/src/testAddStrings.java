import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnitTestingv jUnitString = new jUnitTestingv();
		String result=jUnitString.addStrings("capstone", "project");
		assertEquals("capstoneproject", result);
	}

}
