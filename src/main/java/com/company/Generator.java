package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

class Generator {

	static char[] generate( int max, int min ) {

		Random random = new Random();
		int length = random.nextInt( max - min + 1 ) + min;
		char[] braveNewWord = new char[ length ];
		for( int j = 0; j < length; j++ ) {
			braveNewWord[ j ] = ( char )( 'A' + random.nextInt( 26 ) );
		}
		return braveNewWord;
	}
}