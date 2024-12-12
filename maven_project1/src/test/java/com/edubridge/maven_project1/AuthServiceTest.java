package com.edubridge.maven_project1;

import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AuthServiceTest {
	private static AuthService auth;

	@BeforeAll
	public static void setUp() {
		auth = new AuthService();
	}

	@Test
	public void testAuthenticateWithValidData() {
		boolean actual = auth.authenticate("admin", "admin123");
		assertTrue(actual);
	}

	@Test
	public void testAuthenticateWithInValidData() {
		boolean actual = auth.authenticate("admin", "admin");
		assertFalse(actual);
	}
}