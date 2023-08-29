import java.util.Random;
import java.util.Scanner;

public class BUILD_1 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        Random rand =new Random();
        String play ="yes";
        while (play.equals("yes")){
            int pc = rand.nextInt(0,100);
            System.out.println("enter the number between 1-100");
            int user = 0;
            while (user!=pc){
                user=sc.nextInt();
                if (user>pc){
                    System.out.println("enter a smaller number");
                }
                else {
                    System.out.println("enter a bigger number");
                }
            }
            System.out.printf("Congratulation you guess it right the number was %d \n",pc);
            System.out.println("do you want to play again \nyes/no");
            play= sc.next();
        }
        System.out.println("Thanks for playing have a nice day XO");
    }
}
