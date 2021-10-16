package calculator;

import java.util.ArrayList;
import java.util.List;

class StringCalculator {
	
	public int add(String input) throws Exception {
		int sum=0;
		int flag=0;
		List<Integer>negativeNumbers=new ArrayList<>();									//List for storing negative values
		String [] numArray=input.split("[*,\n;/%&^#@]+");
        
        
        if("".equals(input)||input==null)return 0;													//return 0 if string is empty
		
        if(numArray.length==1) return Integer.parseInt(input);							//if single number is present returns integer value
		
		
		for( int i = 0; i <= numArray.length - 1; i++)
    	{
    		if(Integer.parseInt(numArray[i])<0) {
    			flag=1;
    			negativeNumbers.add(Integer.parseInt(numArray[i]));							//Adding negative values in a list for printing in exception message
    		}
    		 if(flag!=1) {
    			 sum = sum+Integer.parseInt(numArray[i]);
    		 }
    	}
		
	    if(flag==1) {
	    	throw new Exception("negatives not allowed "+negativeNumbers);	//check for multiple negative values and show them as exception message
	    }
    	
	    return sum;
	}
	
	public static void main(String[] args) {
		StringCalculator stringCalculator=new StringCalculator();
		try {
			System.out.println("Output : "+stringCalculator.add("-4**-5,\n6"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}