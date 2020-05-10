import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class jUnitTestingvTest {

	@Test
	void test() {
		jUnitTestingv jUnit = new jUnitTestingv();
		int result=jUnit.addNumbers(100, 200);
		assertEquals(300, result);
	}

}
