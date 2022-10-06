package com.valtech.training.corejava.day3;

public class Rot13Utility {

	public static char rotate(char c) {
		if (c >= 'a' && c <= 'm') {
			return (char) (c + 13);
		}

		else if (c >= 'A' && c <= 'M') {
			return (char) (c + 13);
		} else if (c == ' ') {
			return (char) (' ');
		} else if (c == '!') {
			return (char) ('!');
		}
		return (char) (c - 13);
	}

}