package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzNumberGameTest {
	
	@Test
	public void should_return_1_when_fizzBuzz_then_input1(){
		//given
		int excepted = 1;
		
		//when 
		String number = FizzBuzzNumberGame.fizzBuzz(excepted);
		
		//then
		Assertions.assertEquals("1",number);
		
	}
	
	@Test
	public void should_return_Fizz_when_fizzBuzz_then_input3(){
		//given
		int excepted = 3;
		
		//when 
		String number = FizzBuzzNumberGame.fizzBuzz(excepted);
		
		//then
		Assertions.assertEquals("Fizz",number);
		
	}
	
	
	@Test
	public void should_return_Buzz_when_fizzBuzz_then_input5(){
		//given
		int input = 5;
		
		//when 
		String number = FizzBuzzNumberGame.fizzBuzz(input);
		
		//then
		Assertions.assertEquals("Buzz",number);
		
	}
	
	@Test
	public void should_return_Whizz_when_fizzBuzz_then_input7() {
		//given
		int input = 7;
		
		//when
		String number = FizzBuzzNumberGame.fizzBuzz(input);
		
		
		//then
		Assertions.assertEquals("Whizz", number);
	}
	
	@Test
	public void should_return_FizzBuzz_when_fizzBuzz_then_input15() {
		 //given
		int input = 15;
		
		//when
		String number = FizzBuzzNumberGame.fizzBuzz(input);
		
		//then
		Assertions.assertEquals("FizzBuzz", number);
	}
	
	@Test
	public void should_return_FizzBuzz_when_fizzBuzz_then_input21() {
		 //given
		int input = 21;
		
		//when
		String number = FizzBuzzNumberGame.fizzBuzz(input);
		
		//then
		Assertions.assertEquals("FizzWhizz", number);
	}
	
	@Test
	public void should_return_FizzBuzz_when_fizzBuzz_then_input35() {
		 //given
		int input = 35;
		
		//when
		String number = FizzBuzzNumberGame.fizzBuzz(input);
		
		//then
		Assertions.assertEquals("BuzzWhizz", number);
	}
	
	
	@Test
	public void should_return_FizzBuzz_when_fizzBuzz_then_input105() {
		 //given
		int input = 105;
		
		//when
		String number = FizzBuzzNumberGame.fizzBuzz(input);
		
		//then
		Assertions.assertEquals("FizzBuzzWhizz", number);
	}
	
	

}