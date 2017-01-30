package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReaderWriter {

	public static void readNPrint( String inputName, String outputName ) throws IOException {

		PrintWriter printWriter = new PrintWriter( outputName, "UTF-8" );
		BufferedReader bufferedReader = new BufferedReader( new FileReader( inputName ) );
		Analyzer.startNewCount();

		String word = bufferedReader.readLine();
		while( word != null ) {
			new Analyzer().analyze( word.toCharArray() );
			word = bufferedReader.readLine();
		}

		for( int i = 0; i < 26; i++ ) {
			if( Analyzer.LETTER_COUNT[ i ] > 0 ) {
				printWriter.print( ( char ) ( 'A' + i ) );
				printWriter.print( "=" );
				printWriter.println( Analyzer.LETTER_COUNT[ i ] );
			}
		}
		printWriter.close();
	}

}