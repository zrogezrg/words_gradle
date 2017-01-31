package com.company;

import junit.framework.TestSuite;
import org.junit.*;

import java.io.IOException;

public class AnalyzerTest extends TestSuite {

	@Test
	public void test() {
		Analyzer analyzer = new Analyzer();
		Analyzer.startNewCount();
		String input = "ALA MA KOTA KOT MA ALE";
		int[] result = analyzer.analyze( input.toCharArray() );
		Assert.assertEquals( 5, result[ 0 ] );
	}
}