package Patterns;

public class Strong {

	public static void main(String[] args) {
	int no=145;
	int copy=no;
	int sum=0;
	
	while (no!=0) {
	 int rem = no%10;
		int fact=1;

		for (int i = rem; i >= 1; i--) {
			fact=fact*i;
		}
			sum=sum+fact;
			no=no%10;
			if (copy==sum) {
				System.out.println("strong no");
			}
			else{
				System.out.println("It is not a strong no");
			}
		}
		
	}

}


