import java.util.Scanner;

public class marks{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the NUmber of Student :");
		int n = sc.nextInt();

		int numSd = n;
		int numsub = 3;

		String[] Subject={"Mathamatics","physics","Chemistry"};

		double[][] marks= new double[numSd][numsub];

		System.out.println("      ----Menu---- ");
		System.out.println(" 1.ADD");
		System.out.println(" 2.Update");
		System.out.println(" 3.Avarage");
		System.out.println(" 4.Total marks");
		System.out.println(" 5.Avarage of Subject");

		System.out.println("\n Enter your Choise");
		int x = sc.nextInt();

		switch(x){
		 case 1:	
			//for(int i = 0 ; i < numSd;i++){
	   		//	System.out.printf(" Enter "+i+" Student ID: ");
			//	marks[i] = sc.nextint();
		 case 2:
		 case 3:
		 case 4:
		 case 5:
		}
	}
}
