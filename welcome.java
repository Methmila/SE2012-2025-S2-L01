import java.util.Scanner;

public class welcome{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Frist Name: ");
		String name1 = sc.nextLine();
		System.out.println("Enter Your Last Name: ");
		String name2 = sc.nextLine();

		System.out.println("Welcome to Second Year " + name1 +" "+name2);
}}
