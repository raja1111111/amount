package amount;

import static org.junit.Assert.*;

import org.junit.Test;

public class shopp {

	
	shop cart =new shop();
		@Test
		public void test1() {
			assertTrue(cart.count==0 && cart.price==0);
			
		}
		@Test
		public void test2() {
			cart.addbook(127);
			assertTrue(cart.count==1 && cart.price==127);
			
		}
		@Test
		public void test3() throws Exception {
			cart.addbook(227);
			assertTrue(cart.count==2 && cart.price==227);
			
		}


	}

