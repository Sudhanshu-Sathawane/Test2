import java.util.Scanner;
public class Color {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a alphabet : ");
	char ch=sc.next().charAt(0);
	switch(ch) {
	case 'R':
		System.out.println("Red");
		break;
	case 'G':
		System.out.println("Green");
		break;
	case 'O':
		System.out.println("Orange");
		break;
	case 'B':
		System.out.println("Blue");
		break;
	case 'Y':
		System.out.println("Yellow");
		break;
	case 'W':
		System.out.println("White");
		break;
	default:
		System.out.println("Invalid Code");
	}
}
}
