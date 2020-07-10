package com.himanshu.magic;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

class AppTest2 {

	@Test
	void test10() throws FileNotFoundException {
		App pp1 = new App();
		int exp = 1;
		int act=App.result();
		assertEquals(exp, act);
	}
	@Test
	void test1() throws FileNotFoundException {
		App pp1 = new App();
		int exp = 0;
		int act=App.result();
		assertEquals(exp, act);
	}
	@Test
	void test2() throws FileNotFoundException {
		App pp1 = new App();
		int exp = (Integer) null;
		int act=App.result();
		assertEquals(exp, act);
	}
	@Test
	void test3() throws FileNotFoundException {
		App pp1 = new App();
		int exp = (int)0/0;
		int act=App.result();
		assertEquals(exp, act);
	}
	@Test
	void test4() throws FileNotFoundException {
		App pp1 = new App();
		int exp = (Integer) 1/0;
		int act=App.result();
		assertEquals(exp, act);
	}
	@Test
	void test5() throws FileNotFoundException {
		App pp1 = new App();
		int exp = (Integer) 1/0;
		int act=App.result();
		assertEquals(exp, act);
	}
	@Test
	void test6() throws FileNotFoundException {
		App pp1 = new App();
		int exp = (Integer) 1/0;
		int act=App.result();
		assertEquals(exp, act);
	}
	@Test
	void test7() throws FileNotFoundException {
		App pp1 = new App();
		int exp = (Integer) -1;
		int act=App.result();
		assertEquals(exp, act);
	}
	@Test
	void test8() throws FileNotFoundException {
		App pp1 = new App();
		int exp = (int) 0.00/1;
		int act=App.result();
		assertEquals(exp, act);
	}
	@Test
	void test9() throws FileNotFoundException {
		App pp1 = new App();
		int exp = (int) Math.ceil(0/0);
		int act=App.result();
		assertEquals(exp, act);
	}
	
	

}
