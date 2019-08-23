package com.thoughtworks.tdd;

public class FizzBuzzNumberGame {
  
//	int input = 0;
	public static String fizzBuzz(int input) {
	
		if(input % 3 == 0) {
			if(input % 5 == 0) {
				if(input % 7 == 0) {
					return "FizzBuzzWhizz";
				}
				return "FizzBuzz";	
			}
			if(input % 7 == 0) {
				return "FizzWhizz";
			}
			return "Fizz";	
		}
		
		if (input % 5 == 0) {
			if(input % 7 == 0) {
				return "BuzzWhizz";
			}
			return "Buzz";
		}
		
		if (input % 7 ==0) {
			return "Whizz";
			
		}else {
			String result = Integer.toString(input);
			return result;
			
		}
		
		
	}

}
