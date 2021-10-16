package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {
	
    @Test
    public void empty_string_should_return_0() throws Exception{
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void string_with_single_number_should_return_number_as_int()throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
    public void whenMoreThanTwoNumbersAreUsed_ReturnValueIsTheSum()throws Exception {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(16,stringCalculator.add("3,3,10"));
    }
    @Test
    public void handleNewLinesBetweenNumbers_ReturnValueIsTheSum()throws Exception {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(9,stringCalculator.add("2\n4,3"));
    }
    @Test
    public void multipleDelimiter_ReturnSum() throws Exception {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(15,stringCalculator.add("2//.4#3&6"));
    }
    @Test
    public void  negativeInputReturnsException() throws Exception {
    	StringCalculator stringCalculator = new StringCalculator();
    	//stringCalculator.add("-4");
    	stringCalculator.add("-4,-9");
    }
    
}
