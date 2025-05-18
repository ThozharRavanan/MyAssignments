package day2assignments;

public class Palindrome {
	
	public static void main(String[] args) {
		
//		int input = 54321;
		int input = 121;
		int output =0;
		int rem=0;

		for(int i=input;i>0;i/=10)
		{
		rem=(i%10);
		output = output * 10+rem;
		}
		if(input==output)
		{
		System.out.println("Given number is a Palindrome :"+output);
		}
		else
		{
		System.out.println("Not a Palindrome");
		}
		}
	}


