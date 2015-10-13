import java.util.Scanner;

class backwardsQuiz {

	public static void main(String args[]){
	
	int a;
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter a number to count backwards from");
	a = in.nextInt();
	
	for(int count = a; count >= 0; count--) {
			System.out.print( count + ",");
		}
	}
}