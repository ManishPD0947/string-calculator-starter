package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {
	
    @Test
    public void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
    public void whenMoreThanTwoNumbersAreUsed_ReturnValueIsTheSum() {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(16,stringCalculator.add("3,3,10"));
    }
    @Test
    public void handleNewLinesBetweenNumbers_ReturnValueIsTheSum() {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(9,stringCalculator.add("2\n4,3"));
    }
    
}
