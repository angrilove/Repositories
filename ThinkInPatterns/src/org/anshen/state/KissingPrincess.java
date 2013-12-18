package org.anshen.state;

import org.junit.Before;
import org.junit.Test;

class Creature {
	private interface State {
		String response();
	}
	
	private class Frog implements State {
		
		@Override
		public String response() {
			return "Ribbet!";
		}
	}
	
	private class Prince implements State {

		@Override
		public String response() {
			return "Darling!";
		}
		
	}
	
	private State state = new Frog();
	
	public void greet() {
		System.out.println(state.response());
	}
	
	public void kiss() {
		state = new Prince();
	}
}

public class KissingPrincess {
	Creature crt = null;
	@Before
	public void setup() {
		crt = new Creature();
	}
	
	@Test
	public void test() {
		crt.greet();
		crt.kiss();
		crt.greet();
	}
}
