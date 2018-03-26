package com.java.encryption.bcrypt;

import org.mindrot.jbcrypt.BCrypt;

public class Bcrypt {

	public static void main(String[] args) 
	{
		String plainText = "password_test";
		String generatedHash = BCrypt.hashpw(plainText, BCrypt.gensalt(5));
		boolean isMatched = BCrypt.checkpw(plainText, generatedHash);
		
		System.out.println("Plain text - "+plainText);
		System.out.println("Hashed text - "+generatedHash);
		System.out.println("Check hash and original - "+isMatched);
	}

}
