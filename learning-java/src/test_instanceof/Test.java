package test_instanceof;

import org.junit.Assert;

class Test {

	@org.junit.jupiter.api.Test
	void testInstanceof() {
		A d = new C();
		A c = new D();
		Assert.assertTrue(d instanceof A && c instanceof A);
		Assert.assertTrue(d instanceof C && c instanceof D);
		Assert.assertFalse(c instanceof C && d instanceof D);
	}

}
