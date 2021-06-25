package introduction;
import java.util.*;
public class RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("STONE PAPER SCISSORS");
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("SELECT ONE: STONE 0 PAPER 1 SCISSORS 2");
		System.out.println("PRESS 3 TO EXIT");
		System.out.println("--------------------------------------------------------------------------------------------------");
		Random random = new Random();
		int user = 0;
		int u =0;
		int c=0;
		int d=0;
	     do
	     {
		
	     user= s.nextInt();
		
		int computer= random.nextInt(3); 
		
		if(user==computer)
		{   System.out.println("***************");
			System.out.println("DRAW");
			System.out.println("***************");
			System.out.println("Computer's choice :" + computer);
			d++;

		}
		else if (user==0 && computer==2 || user==1 && computer==0 || user==2 && computer==1)
		{	
			System.out.println("***************");
			System.out.println("YOU WIN");
			System.out.println("***************");
			System.out.println("Computer's choice :" + computer);
			u++;
		}
		else if (computer==0 && user==2 || computer==1 && user==0 || computer==2 && user==1)
		{
			System.out.println("***************");
			System.out.println("COMPUTER WINS");
			System.out.println("***************");
			System.out.println("Computer's choice :" + computer);
			c++;

		}
		else if(user>3||user<0) {
			System.out.println("***************");
			System.out.println("INVALID INPUT"); 
			System.out.println("***************");
		}
		}	while( user!=3); 
	    System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("TOTAL ROUNDS :"+(c+u+d)+ " DRAW :"+d+  " USER :"+ u + " COMPUTER :"+ c);
		System.out.println("--------------------------------------------------------------------------------------------------");

	}

}
