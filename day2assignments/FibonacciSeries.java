package day2assignments;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		{
			//Without Array
			int first_number = 0;
			int second_number = 1 ;
			System.out.println(" \n "+first_number+" \n "+second_number);
			for (int i=2;i<=8;i++)
			{
				int sum = first_number+second_number;
				System.out.println(" "+sum); //sum=2 //1=0 //2=1
				first_number=second_number;
					
				second_number=sum;
				
			}
			
		}
		
		//With Array
		int[] a = new int[8];
		a[0]=0; //0 1 1 2 3 5
		a[1]=1;
		
		for (int i =2;i<a.length;i++)
		{
			
//			a[i+2]=a[i]+a[i+1];
			
			a[i]=a[i-1]+a[i-2];
//			System.out.print(a[i]);
			
	}
		for (int i : a) {
			
			System.out.print(" " +i);
			
		}
	
	}
	
}
