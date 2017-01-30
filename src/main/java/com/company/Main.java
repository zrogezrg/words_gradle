package com.company;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			final String FILE_NAME = "words.txt";
			final String OUTPUT_NAME = "lettersCount.txt";
			final int NUMBER_OF_WORDS = 40000000;
			final int MAX_WORD_LENGTH = 10;
			final int MIN_WORD_LENGTH = 2;
			Generator.generate( FILE_NAME, NUMBER_OF_WORDS, MAX_WORD_LENGTH, MIN_WORD_LENGTH );
			ReaderWriter.readNPrint( FILE_NAME, OUTPUT_NAME );
		} catch( IOException e ) {
			e.printStackTrace();
		}
	}
}