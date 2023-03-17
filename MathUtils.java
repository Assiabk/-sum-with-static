package Github_Projects;

import java.util.Scanner;

public class MathUtils {
public static int  sum(int a,int b) {
	return a+b;
}
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a:");
		int a=scan.nextInt();
		System.out.println("enter b:");
		int b=scan.nextInt();
		System.out.println("the result is:"+sum(a, b));
	}

}
