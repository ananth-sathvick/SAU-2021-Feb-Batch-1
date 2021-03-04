package com.au.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestMain {
	Prime cp= null;
	MockitoService service = new MockitoService(){
		// TODO Auto-generated constructor stub
		public boolean isPrime(int num)
		{
			
		    for (int i = 2; i <= num / 2; ++i) {
		      if (num % i == 0) {
		    	  return false;
		      }
		    }
		    return true;
		  }
			
	};// for testing we need to make a fake object
	@Before
	public void setUp()
	{
		cp=new Prime(service);
	}
	@Test
	public void test() {
		boolean output = cp.perform(13);
		assertEquals(true,output);
	}

}
