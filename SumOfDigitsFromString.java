package week2.day2Assignments;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="234567pr";
		int sum=0;
		
		char c[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				sum=sum+Character.getNumericValue(str.charAt(i));
			}
		}

		System.out.println("sum of digit in the string ="+sum);
	}

}
