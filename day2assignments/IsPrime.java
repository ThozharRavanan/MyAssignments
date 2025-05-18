package day2assignments;


public class IsPrime {
	public static void main(String[] args) {
		int n = 4;
		boolean isTheNumberPrime = true;
		for(int i=2;i<n;i++)
		{
			
	 if((n%i)==0){
		 isTheNumberPrime=false;
		 break;
	 }
		}
	 
	 if(isTheNumberPrime == false)
	 {
		 System.out.print("The Given number is "+n+" is not prime");
	 }
	 else
	 {
	 System.out.println("The Given number is "+n+" is  prime");
	}


	
	}
}
