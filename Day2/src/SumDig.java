import java.util.Scanner;
public class SumDig {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0) {
			int last_digit=num%10;
			sum+=last_digit;
			num/=10;
		}
		System.out.println("Sum of the digit is "+sum);
	}
}
