package com.viva.sample;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest{
	@Test
	public void doThing() {
		assertTrue(2+3==5);
	}
	@Test
	public void doNotThing() {
		assertTrue(2+3==6);
	}
}
