package com.company;

import java.io.*;

class Analyzer {
	static final int[] LETTER_COUNT = new int[ 26 ];

	static void startNewCount() {
		for( int i = 0; i < LETTER_COUNT.length; i++ )
			LETTER_COUNT[ i ] = 0;
	}

	int[] analyze( char[] line ) {
		int[] letterMarks = new int[ 26 ];
		for( int j = 0; j < letterMarks.length; j++ )
			letterMarks[ j ] = 0;

		for( char aChar : line ) {
			if( aChar >= 'A' && aChar <= 'Z' ) {
				if( letterMarks[ aChar - 'A' ] == 0 )
					LETTER_COUNT[ aChar - 'A' ]++;
				letterMarks[ aChar - 'A' ] = 1;
			} else if( aChar == ' ' )
				for( int j = 0; j < letterMarks.length; j++ )
					letterMarks[ j ] = 0;
		}

		return LETTER_COUNT;
	}
}