import java.util.*;
class Guesser
{
    int guessNum;
    public int guessNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a valid number to be guessed between 1 to 100 ");
        guessNum=scan.nextInt();
        return guessNum;

    }
}
class Player
{
    int pguessNum;
    public int guessNumber()
    {
        Scanner scan=new Scanner(System.in);
        //System.out.println("Player kindly guess the number");
        pguessNum=scan.nextInt();
        return pguessNum;
    }

}

class Umpire
{

    int flag=0;
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;


    public void collectNumToBeGuessed()
    {
        Guesser g=new Guesser();
        numFromGuesser=g.guessNumber();

    }

    public boolean checkNumber()
    {
            Guesser g=new Guesser();
            numFromGuesser=g.guessNumber();

            if(numFromGuesser>=1 && numFromGuesser<=100)
                return true;

            else
                return false;
    }
    public void collectNumFromPlayer()
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();

        System.out.println("Player 1 kindly guess the number");
        numFromPlayer1=p1.guessNumber();

        System.out.println("Player 2 kindly guess the number");
        numFromPlayer2=p2.guessNumber();

        System.out.println("Player 3 kindly guess the number");
        numFromPlayer3=p3.guessNumber();
    }

    void compare() {


            if (numFromGuesser == numFromPlayer1) {
                if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                    System.out.println("Game tied all three players guessed correctly");
                    flag=1;

                } else if (numFromGuesser == numFromPlayer2) {
                    System.out.println("Player 1 and Player2 won the game");
                    flag=1;

                } else if (numFromGuesser == numFromPlayer3) {
                    System.out.println("Player 1 and Player3 won ");
                    flag=1;

                } else {

                    System.out.println("Player 1 won the game");
                    flag=1;
                }
            } else if (numFromGuesser == numFromPlayer2) {

                if (numFromGuesser == numFromPlayer3) {
                    System.out.println("Player 2 and Player3 won the game");
                    flag=1;

                } else {
                    System.out.println("Player 2 won the game");
                    flag=1;
                }
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 3 won the game");
                flag=1;

            } else {
                System.out.println("Round lost !!");
            }

    }
 }


public class Launchgame {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Umpire u = new Umpire();

        while (!u.checkNumber()) {

           if(u.checkNumber()) {
               break;
           }
           u.collectNumToBeGuessed();
        }

        System.out.println("ROUND 1 :-");
        u.collectNumFromPlayer();
        u.compare();

        if(u.flag==1)
        {
             System.out.println();
             System.out.println("CONGRATULATIONS WINNERS");
             System.out.println("EXITING GAME !! THANKS FOR PLAYING..");
             System.exit(0);
        }
        else {
            System.out.println("ROUND 2 :-");  
            u.collectNumFromPlayer();
            u.compare();

            if(u.flag==0) {
                System.out.println();
                System.out.println("THANKS FOR PLAYING ! BETTER LUCK NEXT TIME ..");
            }
        }
    }
}
