package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordStrengthCheckerTest {

	@Test
	public void testcheckLower() {
		PasswordStrengthChecker lwr = new PasswordStrengthChecker();
		assertEquals(true, lwr.lower("abcdefgh"));

	}

	@Test
	public void testcheckUpper() {
		PasswordStrengthChecker upr = new PasswordStrengthChecker();
		assertEquals(true, upr.upper("ABCDEFGH"));
	}

	@Test
	public void testdigit() {
		PasswordStrengthChecker dig = new PasswordStrengthChecker();
		assertEquals(true, dig.digit("12345"));
	}

	@Test
	public void testSpecialChar() {
		PasswordStrengthChecker sc = new PasswordStrengthChecker();
		assertEquals(true, sc.specialCharacter("!@#$%&*"));
	}
}