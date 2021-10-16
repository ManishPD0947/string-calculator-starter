package calculator;

class StringCalculator {
	private final static String delimeter = ",|\n";
    
	public int add(String input) {
        String [] numArray=input.split(delimeter);
		
        if(input.isEmpty())return 0;//return 0 if string is empty
		
        if(numArray.length==1) return Integer.parseInt(input);//if single number is present returns integer value
		
        else return addAllNumbers(numArray);// if multiple numbers are present, sum of all the numbers are returned
		
	}

	//Method to find sum of all the numbers in a string
	private int addAllNumbers(String[] num) {
		int sum=0;
	  
    	for( int i = 0; i <= num.length - 1; i++)
    	{
    		 sum = sum+Integer.parseInt(num[i]);
    	}
    	return sum;
	}

}