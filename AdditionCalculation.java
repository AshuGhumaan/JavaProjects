
public class AdditionCalculation {

	public static void Addition(String s1, String s2) {
		String Result="";// Calculated Result
		String num1=s1; //First Number
		String num2=s2; // Second Number
		
		int length= (num1.length() - num2.length());
		// If length is +ve then it means than num1 > num2
		// If length is -ve then it means than num2 > num1
		
		if(length>0) {
			// add zeroes at end of the num2 to make its length equal to num1
			for(int i=0; i<length; i++) {
				num2="0"+num2;
			}
		}
		
		if(length<0) {
			// add zeroes at end of the num1 to make its length equal to num2
			for(int i=length; i<0; i++) {
				num1="0"+num1;
			}
		}
		
		
		
		//Calculation Algorithm here!!!!
		// num1.length == num2.length as we have made them equal by adding zeroes!!!
		int carried_Digit=0; // This has value other than zero only if single digits of both numbers sum > 0
		for(int i=num1.length()-1; i>=0; i--) {
			
			
			int num1_lastDigit=Character.getNumericValue(num1.charAt(i)); // Last digit of 1st number
			int num2_lastDigit=Character.getNumericValue(num2.charAt(i)); // Last digit of 2nd number
			
			
			
			int sum = num1_lastDigit + num2_lastDigit + carried_Digit ;
			
			
			carried_Digit=0; // Resetting to zero to prevent it from adding to undesired
			
			if(sum<10) {
				Result = sum+Result;
			}
			
			if(sum>=10) {
				String sum_S=String.valueOf(sum); // Conversion of int into String
				
				int sum_S_lastDigit = Character.getNumericValue(sum_S.charAt(1)); // Last digit of the sum 
				int sum_S_firstDigit = Character.getNumericValue(sum_S.charAt(0));
				carried_Digit=sum_S_firstDigit;
				
				if(i!=0) {
				Result = sum_S_lastDigit + Result;
				}
				
				if(i==0) {
					Result=sum_S+Result;
				}
				
				
			}
			
			
		}
		
		
		
		System.out.println("Num 1: "+s1+"\tLength: "+s1.length()+" characters");
		System.out.println("Num 2: "+s2+"\tLength: "+s2.length()+" characters");
		System.out.println("Addition Result: "+Result+"\tLength: "+Result.length()+" characters\n");
		
	}
	
}
