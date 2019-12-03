package resources;

import java.security.SecureRandom;

public class Alphanumerics {

	private String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", 
								"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",};

	public String getAlpha() {
		SecureRandom random = new SecureRandom();
		int num = random.nextInt(alpha.length);
		
		return (alpha[num] + num);
	}
}

