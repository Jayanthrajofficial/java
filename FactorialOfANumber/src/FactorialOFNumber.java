import java.util.Scanner;

public class FactorialOFNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scan.nextInt();
		scan.close();
		int sum = 1;
		for(int i =1;i<=n;i++)
		{
			sum = sum*i;
		}
		System.out.println(sum);
	}
}
