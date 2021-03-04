import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPrime {
	@Test
	public void test() {
		Prime p = new Prime();
		boolean op=p.isPrime(15);
//		System.out.println(output);
		assertEquals(false, op);
	}
	

}
