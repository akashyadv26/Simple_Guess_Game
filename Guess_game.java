import java.util.*;
    public class Guess_game
    {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String op="Yes";

           // System.out.println(guess);
            while(op.equalsIgnoreCase("yes")) {

                int guess=(int)(Math.random()*6);
                System.out.println("Enter a Number Between (0-5)");
                int inp=sc.nextInt();

                if (inp == guess) {
                    System.out.println("Congrats You Won !!");
                } else {
                    System.out.println("Oops! You Lost The Game");
                    System.out.println("Opponent Number is :- " + guess);
                }
                System.out.println("Do You Want to Continue ? ");
                op = sc.next();
            }


        }
    }
