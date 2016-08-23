import java.util.Scanner;
public class NEGATIVE {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int n;
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter the values of n");
		 n=s.nextInt();
		 if(n>0)
		 {
			 System.out.println("positive");
		 }
		 else if(n<=0)
		 {
			 System.out.println("negative");
		 }

	}

}
