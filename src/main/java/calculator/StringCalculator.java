package calculator;

class StringCalculator {

    public int add(String input) {
        if(input.isEmpty()) {
        	return 0;//return 0 is string is empty
        }
        else {
        	return Integer.parseInt(input);//changing String to integer value and returning integer value
        }
    }

}