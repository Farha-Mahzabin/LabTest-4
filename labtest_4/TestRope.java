package labtest_4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRope {

	@Test
	void test() {
		RopeProp rp = new RopeProp(1);
		double res = rp.getVelocity();
		
		assertEquals(10.0, res);
	}

}
