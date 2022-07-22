import java.util.Scanner;
public class PrimeNumbersBetween {
	static boolean isPrime(int n) {
		if(n==1) return false;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		for(int i=10;i<99;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
}
