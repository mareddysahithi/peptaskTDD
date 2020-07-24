package com.peptask.TestDD;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	App str;
	@BeforeEach
	void initialization()
	{
		str = new App(); 
	}

	@Test
	void testNull() {
		assertEquals("",str.remove(""));
	}
	@Test
	void testChar() {
		assertEquals("",str.remove("A"));
		assertEquals("B",str.remove("B"));
	}
	@Test
	void testTwo() {
		assertEquals("",str.remove("AA"));
		assertEquals("B",str.remove("AB"));
		assertEquals("B",str.remove("BA"));
		assertEquals("BB",str.remove("BB"));
	}
	@Test
	void testN() {
		assertEquals("BC",str.remove("AABC"));
		assertEquals("BA",str.remove("ABA"));
		assertEquals("BD",str.remove("BAD"));
		assertEquals("HOME",str.remove("HOME"));
	}

}
