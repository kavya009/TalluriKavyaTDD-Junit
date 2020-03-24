package Epam.Remove_A_From_String;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class removeAfromString {
	remove rA;
	@BeforeEach
	public void setUp() {
		rA = new remove();
	}
	
	@Test
	void testFirstTwo() {
		assertEquals("CD", rA.removeA("AACD"));
	}
	@Test
	void testFirstA() {
		assertEquals("BCD", rA.removeA("ABCD"));
	}
	@Test
	void testSecondA() {
		assertEquals("BCD", rA.removeA("BACD"));
	}
	@Test
	void testNoA() {
		assertEquals("BBAA", rA.removeA("BBAA"));
	}
	@Test
	void testEmpty() {
		assertEquals("", rA.removeA(""));
	}
	@Test
	void testOnly1() {
		assertEquals("", rA.removeA("A"));
	}
	@Test
	void testOnly2() {
		assertEquals("", rA.removeA("AA"));
	}

}
