package com.company;

import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Test;

public class GeneratorTest extends TestSuite {

	@Test
	public void testLength() {
		char[] word = Generator.generate( 10, 2 );
		Assert.assertTrue( word.length >= 2 && word.length <= 10 );
	}

	@Test
	public void testLetters() {
		char[] word = Generator.generate( 10, 2 );
		for( char letter : word )
			Assert.assertTrue( letter >= 'A' && letter <= 'Z' );
	}
}
