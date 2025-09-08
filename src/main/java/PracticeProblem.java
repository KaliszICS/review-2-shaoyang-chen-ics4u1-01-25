import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
		System.out.print("In: ");
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        System.out.println(string1);
	}

	public static void q2() {
		//Write question 2 code here
		System.out.print("In: ");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println(number1/number2);
        System.out.println(number1%number2);
	}

	public static void q3() {
		//Write question 3 code here
		System.out.print("In: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s + " was the text you wrote");
	}

	public static void q4() {
		//Write question 4 code here
		System.out.print("In: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = n * 5;
        System.out.println(n);
	}

	public static void q5() {
		//Write question 5 code here
		System.out.print("In: ");
        Scanner sc = new Scanner(System.in);
        boolean b1 = sc.nextBoolean();
        System.out.println(b1 + " is a boolean");
		
	}

	public static void q6() {
		//Write question 6 code here
		System.out.print("In: ");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        num = num - 3.2;
        System.out.println(num);
		
	}

}
