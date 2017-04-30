package com.icodejava.research.nlp.database;

public interface Tables {
	
	String ARTICLES="ARTICLES";
	String WEBSITES="WEBSITES";
	String SENTENCES_REFERENCED="SENTENCES";
	String WORDS_REFRENCED="WORDS";
	
	/*
	CREATE TABLE `WORDS_UNREFERENCED` (
		`ID`	integer PRIMARY KEY AUTOINCREMENT,
		`WORD`	text NOT NULL,
		`ROOT_WORD`	TEXT,
		`ROOT_WORD_EXTRACTED`	CHAR(1),
		`IS_COMPOUND_WORD`	TEXT,
		`VERIFIED`	CHAR(1),
		`NEEDS_CLEANING`	TEXT,
		`WORD_ROMANIZED`	text,
		`WORD_ROMANIZED_COMMON`	TEXT,
		`PART_OF_SPEECH`	TEXT,
		`CLASSIFICATION_1`	TEXT,
		`CLASSIFICATION_2`	TEXT,
		`CLASSIFICATION_3`	TEXT,
		`CLASSIFICATION_4`	TEXT,
		`CLASSIFICATION_5`	TEXT,
		`CREATED_DATE`	NUMERIC,
		`UPDATED_DATE`	NUMERIC
	);
	 */
	String WORDS_UNREFERENCED="WORDS_UNREFERENCED";
	
	
	/*
    CREATE TABLE `SENTENCE_UNREFERENCED` (
        `ID`    integer PRIMARY KEY AUTOINCREMENT,
        `SENTENCE`  text NOT NULL,
        `NGRAM_EXTRACTED`   CHAR(1),
        `VERIFIED`  CHAR(1),
        `NEEDS_CLEANING`    TEXT,
        `WORDS_COUNT`   INTEGER,
        `ROMANIZED_ISO` TEXT,
        `ROMANIZED_STANDARD`    TEXT,
        `CREATED_DATE`  NUMERIC,
        `UPDATED_DATE`  NUMERIC
    );
	 */
	String SENTENCES_UNREFERENCED="SENTENCE_UNREFERENCED";
	
	
	
	/*
		CREATE TABLE `NGRAM` (
			`ID`	integer NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
			`WORDS`	text NOT NULL,
			`NGRAM_TYPE`	TEXT,
			`ROMANIZED_ISO`	text,
			`ROMANIZED_STANDARD`	TEXT,
			`VERIFIED`	CHAR(1),
			`FREQUENCY`	integer,
			`CREATED_DATE`	NUMERIC,
			`UPDATED_DATE`	NUMERIC
		);
	*/
	String NGRAM="NGRAM";
	
	String TAGS="TAGS";
}
