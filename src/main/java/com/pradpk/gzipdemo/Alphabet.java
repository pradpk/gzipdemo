package com.pradpk.gzipdemo;

public class Alphabet {

    private char character;
    private String word;

    public Alphabet(char character, String word) {
        this.character = character;
        this.word = word;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
