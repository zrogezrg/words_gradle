package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Generator {

	public static void generate( String fileName, int wordCount, int max, int min ) throws IOException {

		PrintWriter printWriter = new PrintWriter( fileName, "UTF-8" );
		Random random = new Random();

		for( int i = 0; i < wordCount; i++ ) {
			int length = random.nextInt( max - min + 1 ) + min;
			for( int j = 0; j < length; j++ ) {
				printWriter.print( ( char )( 'A' + random.nextInt( 26 ) ) );
			}
			printWriter.println();
		}
		printWriter.close();
	}
}