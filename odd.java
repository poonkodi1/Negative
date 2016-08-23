import java.util.Scanner;
public class odd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("enter values");
		a=s.nextInt();
		if(a%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}

	}

}
