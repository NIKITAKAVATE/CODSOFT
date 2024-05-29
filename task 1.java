import java.util.Scanner;
public class NUMBERGAME
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chance = 8;
        int finals = 0;
        boolean playAgain = true;
        System.out.println("Welcome to Numbergame!");
        System.out.println("You have " + chance + " chances to win the game");
        while (playAgain) {
            int rand = getRandNo(1, 100);
            boolean guess = false;
            for (int i = 0; i < chance; i++) {
                System.out.println("Chance " + (i + 1) + ", enter your guess:");
                int user = sc.nextInt();
                if (user == rand) {
                    guess = true;
                    finals += 1;
                    System.out.println("You won!Game");
                    break;
                } else if (user > rand) {
                    System.out.println("Too high");
                } else
                {
                    System.out.println("Too low");
                }
            }
            if (!guess) {

                System.out.println("Sorry, you lost. The number was " + rand);
            }
            System.out.println("Do you want to play again? (y/n)");
            String playAgainInput = sc.next();
            playAgain = playAgainInput.equalsIgnoreCase("y");
        }
        System.out.println("That's it, hope you enjoyed it!");
        System.out.println("Here is your score: " + finals);
        sc.close();
    }


    public static int getRandNo(int min, int max)
    {
        return (int)(Math.random() * (max - min + 1) + min);
    }
}





