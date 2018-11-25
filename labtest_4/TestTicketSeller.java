package labtest_4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestTicketSeller {
	@Test
	void test() 
	{
		TicketSeller ts = new TicketSeller(100);
		int res = ts.getTotalBuyers();
		assertEquals(1, res);
	}
}
