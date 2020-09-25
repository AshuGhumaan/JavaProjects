import java.util.ArrayList;

//Version 1

public class combination {
	
public  combination(String text) {
		
		ArrayList<String> Combination = new ArrayList<String>();
		
		int length = text.length(); // 2
		int minValue = 0; // 0
		int maxValue = length-1; // 1
		String maxValueCombo ="";
		
		String Num="";
		
		//Array of characters of input string
		char[] stringCharacters = text.toCharArray();
		
		
		
		ArrayList<String> NumCombination = new ArrayList<String>();
		
		for(int i=0; i<length; i++) {
			
			maxValueCombo =maxValueCombo+maxValue;
		
			}
		
		maxValue = Integer.parseInt(maxValueCombo);
		int[] arrayOfNum = new int[maxValue+1];
		
		System.out.println("\nString: "+text);
		
		
		for(int j=minValue; j<arrayOfNum.length; j++) {
			arrayOfNum[j]=j;
			
		}
		
		
		for(int z=0; z<arrayOfNum.length; z++) {
			
			Num = String.valueOf(z);
			
			if(Num.length()!=length) {
				int diff = length-Num.length();
				for(int q=0; q<diff; q++) {
					Num = "0"+Num;
				}
				NumCombination.add(Num);
			}
			
			else if(Num.length()==length) {
				NumCombination.add(Num);
				
			}
			
		}
		
		
		
		int Counter = 0;
		
		String individual_S="";
		char individualchar;
		// Removing invalid sequences from list
		for(int r=0; r<NumCombination.size(); r++) {
			
			
			
			individual_S = NumCombination.get(r);
			for(int s=0; s<length; s++) {
				
				individualchar = individual_S.charAt(s);
				int numericValue = Character.getNumericValue(individualchar);
				
				if(numericValue>=length) {
					Counter++;
					
				}
			}
			
			if(Counter>0) {
				
				NumCombination.remove(r);
				r--; // Otherwise it will miss next element
				
				
			}
			
			Counter = 0;
			
		}
		
		int NumOfElements = length;
		int NumOfCombinations=0;
		
		;
		// To print list contents
		for(int p =0; p<NumCombination.size(); p++) {
			
			NumOfCombinations++;
		}
		
		System.out.println("Number of Elements: "+NumOfElements+"\tNumber of Combinations: "+NumOfCombinations+"\n\n");
		
		String charSeq="";
		int lineBreaker = 0;
		
		for(int p =0; p<NumCombination.size(); p++) {
			
			//Array: Combination
			
			for(int zz=0; zz<length; zz++) {
				String numValue = NumCombination.get(p);
				char singleChar = numValue.charAt(zz);
				int charposition = Character.getNumericValue(singleChar);
				charSeq = charSeq+stringCharacters[charposition];
			}
			
			Combination.add(charSeq);
			charSeq="";
			
			System.out.print(Combination.get(p)+" ");
			
			
			lineBreaker++;
			if(lineBreaker==10) {
				System.out.println();
				lineBreaker =0;
			}
		}
	}

}



