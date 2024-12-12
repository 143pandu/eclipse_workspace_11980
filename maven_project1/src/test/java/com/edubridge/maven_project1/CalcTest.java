package com.edubridge.maven_project1;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



//import com.edubridge.maven_project1.Calc;


public class CalcTest {
	private Calc  c = null;
	@BeforeEach
	public void setup() {
		c = new Calc();
		System.out.println("BeforeEach");
		
	}
	
	@AfterEach
	public void tearup() {
		c =new Calc();
		System.out.println("AfterEach");
		
	}
	
	@Test
	public void testFindSquare() {
		Calc c = new Calc();
		int actual = c.findSquare(10);
		int expected = 100;
		
		Assertions.assertEquals(expected,actual);
		
}
	
	@Test
	public void testFindCube( ) {
		Calc c = new Calc();
		int actual = c.findCube(10);
		int expected = 1000;
		
		Assertions.assertEquals(expected, actual);
		
	}
	

	

}