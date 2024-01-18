package codsoft_java;
import java.util.*;
public class NumberGame {
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int target = random.nextInt(100);
        int userinput;
        while(true){
            System.out.println("Guess the number within 1 to 100");
            userinput = scanner.nextInt();
            if(userinput == target){
                System.out.println("You guessed it right");
                break;
            }
            else if (userinput > target){
                System.out.println("Too High! Try again");
            }
            else{
                System.out.println("Too Low! Try again");
            }
        }
    }
}
