package com.company;

import java.io.*;
import java.util.Scanner;

public class ReaderWriter {

	public static void process( String inputName, String outputName ) throws IOException {

		File file = new File( inputName );
		Scanner sc = new Scanner( file );
		PrintWriter printWriter = new PrintWriter( outputName, "UTF-8" );
		Analyzer.startNewCount();

		while( sc.hasNext() )
			new Analyzer().analyze( sc.next().toCharArray() );

		for( int i = 0; i < 26; i++ ) {
			if( Analyzer.LETTER_COUNT[ i ] > 0 ) {
				printWriter.print( ( char ) ( 'A' + i ) );
				printWriter.print( "=" );
				printWriter.println( Analyzer.LETTER_COUNT[ i ] );
			}
		}
		printWriter.close();
	}

	public static void printWords( String fileName, int wordCount, int max, int min ) throws IOException {

		PrintWriter printWriter = new PrintWriter( fileName, "UTF-8" );
		for( int i = 0; i < wordCount; i++ ) {
			printWriter.print( ( Generator.generate( max, min ) ) );
			printWriter.print( " " );
		}
		printWriter.close();
	}

}