import java.util.Scanner;
public class RandomNumberGuesser {

	public static void main(String[] args) {
		
 Scanner keyboard = new Scanner (System.in);
  String answer;
  int high = 100;
  int low = 1;
 do {
   int win =  RNG.rand();
   System.out.print("Enter your first guess: ");
   int num = keyboard.nextInt();
    RNG.inputValidation(num, low, high);
   while (num != win) {
	   
   if (num < win) {
	   System.out.println("Number of guess is "+ RNG.getCount());
	   System.out.println("Your Guess is too low");
	   System.out.print("Enter your next guess between "+ num + " and 100: ");
	    num = keyboard.nextInt();
	    RNG.inputValidation(num, low, high);
   }
   
   else if (num > win) {
	   System.out.println("Number of guess is "+ RNG.getCount());
	   System.out.println("Your Guess is too high");
	   System.out.println ("Enter your next guess between 0 and "+ num+": ");
	    num = keyboard.nextInt();
	    RNG.inputValidation(num, low, high);
   }
	    }
   
   if (num == win) {
	   System.out.println("Your  guess is correct, Congratulation");
   }
   		keyboard.nextLine();
   
      System.out.println (" Do you want to try again: ");
       answer = keyboard.nextLine();
       			
       			RNG.resetCount();
 } while (answer.equals("yes"));
  
   if (answer.equals ("no")) {
	   System.out.println (" Good bye!!");
   System.exit(0);
   
   }
      
	}

}
