package com.company;

import junit.framework.TestSuite;
import org.junit.*;

import java.io.IOException;

public class AnalyzerTest extends TestSuite {

	@Test
	public void test() {
		Analyzer analyzer = new Analyzer();
		Analyzer.startNewCount();
		int[] result = new int[ 26 ];
		try {
			String input = "ALA MA KOTA KOT MA ALE";
			result = analyzer.analyze( input.toCharArray() );
		} catch( IOException e ) {
			e.printStackTrace();
		}
		Assert.assertEquals( 5, result[ 0 ] );
	}
}