//Name : Muhammad Uzair
//classno: 181006
//BSSE(3rd Semester)
//SECTION B
package oop.java;
import java.util.Scanner;
import java.lang.Math;

//using procedural method
public  class  Main{

    static void starLine(int starLimit)
    {
        for (int i=0;i<starLimit;i++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }//starLine

    static void menu()
   {
       System.out.println("\t\tStart the NUmber Game");
       System.out.println("Enter level(a,b or c) of Game to play");
       starLine(42);
       System.out.println("(a)Normal \t\t (b)Medium\t\t(c)Hard");
       starLine(42);
   }//menu
   static int randNum(int gRange)

   {
       int rNumber=(int)((Math.random()*gRange)+1);
       return rNumber;
   }//randNum
   static void setLevelOfGame(int guessLimit,int guessRange){
       int randNumber=randNum(guessRange);
       boolean hasWon=false;
       int guessNumber=0;
       Scanner input=new Scanner(System.in);

       System.out.println(" Here you  have to Guess a number btw 1-"+guessRange);
       for (int i=guessLimit;i>0;i--)
       {

           System.out.println("you have "+i+" guesses left");
            guessNumber=input.nextInt();
            if(randNumber>guessNumber)
            {
                System.out.println("Its Greater than "+guessNumber);
            }
            if (randNumber<guessNumber)
            {
                System.out.println("Its less than "+guessNumber);

            }
            if (randNumber==guessNumber)
            {
                hasWon=true;
                break;
            }
       }
       if(hasWon)
       {
           starLine(40);
           System.out.println("Congrats you won the Game:):)");
           System.out.println("your Guess number :"+guessNumber+"=="+"random number:"+randNumber);
            starLine(40);
       }
       else
       {
           starLine(50);
           System.out.println("You lose try again :( :( ");
           System.out.println("your Guess number :"+guessNumber+" != "+"random number:"+randNumber);
           System.out.println("its look like you are Noob");
           System.out.println("Select Normal level to increase ur chances to win :)");
           starLine(50);
       }
   }//setGameLevel

    public static void main(String leo[])
    {
     char choice;
     char option;
        Scanner input = new Scanner(System.in);
       do {
           menu();

           choice = input.next().charAt(0);
           switch (choice) {
               case 'a':
               case 'A':
                   setLevelOfGame(15,100);
                   break;
               case 'b':
               case 'B':
                   setLevelOfGame(10,200);
                   break;
               case 'c':
               case 'C':
                   setLevelOfGame(5,300);
                   break;
               default:
                   System.out.println("Invalid entry ");
           }
           System.out.println("if u want to play again press Y & N to exit");
           option=input.next().charAt(0);
           starLine(40);
       } while (option=='y');


    }//main
}//class

