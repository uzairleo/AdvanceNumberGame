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
    }

    static void menu()
   {
       System.out.println("\t\tStart the NUmber Game");
       System.out.println("Enter level(a,b or c) of Game to play");
       starLine(42);
       System.out.println("(a)Normal \t\t (b)Medium\t\t(c)Hard");
       starLine(42);
   }
   static int randNum(int gRange)

   {
       int rNumber=(int)((Math.random()*gRange)+1);
       return rNumber;
   }
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
   }

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


    }
}
//class Main
//    {
//        public static void main(String uzairleo[]) {
//
//
//        int randnumber = (int) ((Math.random() * 100) + 1);
//        boolean haswongame = false;
//        int guessnumber;
//        char choice='n';
//        do {
//            System.out.println("This is Number Game u have to guess a number btw 1to100");
//            Scanner input = new Scanner(System.in);
//            for (int i = 10; i > 0; i--) {
//                System.out.println("you have" + i + " guesses left " + "\n");
//
//                guessnumber = input.nextInt();
//                if (randnumber > guessnumber) {
//                    System.out.println("Its greater than " + guessnumber);
//                }
//                if (randnumber < guessnumber) {
//                    System.out.println("Its less than " + guessnumber );
//
//                }
//                if (randnumber == guessnumber) {
//                    haswongame = true;
//                    break;
//                }
//            }//loop+
//            if (haswongame) {
//                System.out.println("Congrat u won the game");
//                System.out.println("your guess number is finally equal to random number ==" + randnumber + "\n");
//
//            } else {
//                System.out.println("Sorry you lose the game ");
//
//            }
//
//            System.out.println("If u want to play Again press y other wise press N to terminate");
//            choice=input.next().charAt(0);
//        }while (choice=='y');
//    }
//}

//public class Main{
//    public static void main(String[] args){
//        int randno=(int )(Math.random()*100)+1;
//        int uuserno=0;
//        Scanner input=new Scanner(System.in);
//        int i=5;
//        do {
//            System.out.println("plz guess a number btw 1-100");
//            uuserno=input.nextInt();
//            if(randno<uuserno) {
//               System.out.println("The random number is smaller than "+ uuserno);
//            }if (randno>uuserno) {
//            System.out.println("The random number is larger than "+uuserno);
//            }if (randno==uuserno)
//            {
//
//                System.out.println("Hurrah u find that\nrandom no equal to guess number");
//              System.out.println("random no:"+randno+" \tusernumber :"+uuserno);
//
//            }
//        }while(randno!=uuserno);
//    }
//}



//package oop.java;
//import java.util.Scanner;
//class Main{
//    public static void main(String args[]){
//
//        int arr[]={11,22,30,99,100};
//
//        Scanner input=new Scanner( System.in);
//
//        int item=input.nextInt();
//        int loc;
//        int BEG = 0;
//        int END= 4;
//        int MID=BEG+END/2;
//        while ((BEG<=END)&&(arr[MID]!=item)){
//            if (item<arr[MID]){
//                END=MID-1;
//
//            }else
//            {
//                BEG=MID+1;
//            }
//            MID=(BEG+END)/2;
//        }
//        if (arr[MID]==item){
//            loc=MID;
//
//        }else{
//            loc=0;
//        }
//        System.out.println("The item is present on location === "+loc);
//    }
//}
//
//
////package  oop.java;
////import java.util.Scanner;
////
////
////class  Main{
////    public static  void main(String arg[])
////    {
////        char opt='y';
////        Scanner input=new Scanner(System.in);
////        int x=0;
////        int sum=0;
////        while(x>=0){
////            System.out.println("Enter a number u want to calculate its sum factorial ");
////            x=input.nextInt();
////            sum=sum+x;
//////            System.out.println("if u want to continue press y/n");
//////            opt=input.next().charAt(0);
////
////            System.out.println("The Result is == "+sum);
////
////
////        }
////    }
////
////}
////
////
//////package oop.java;
//////
//////import java.io.File;
//////import java.io.FileNotFoundException;
//////import java.util.Scanner;
//////import java.lang.String;
//////public class Main {
//////    static void openFile(String s)throws Exception
//////    {
//////        File file= new File("somefile.txt");
//////    }
//////
//////    public static void main(String[] args) throws Exception{
//////
//////        float a,b, result;
//////        char option;
//////        Scanner cin=new Scanner(System.in);
//////        do {
//////            a=cin.nextInt();
//////            b=cin.nextInt();
//////            if (b==0)
//////            {
//////                try {
//////                    float c = a / b;
//////                }
//////                catch (ArithmeticException e)
//////                {
//////                    System.out.println(e);
//////                }
//////            }else
//////            {
//////                result=a/b;
//////                System.out.println("The Division of two number is == "+result);
//////            }if(b==0){System.out.println("Sorry divide by zero not allowed");}
//////            System.out.println("If u want to continue division press y/N");
//////            option=cin.next().charAt(0);
//////            try {
//////                openFile("somefile.txt");
//////            }catch (FileNotFoundException e)
//////             {
//////                System.out.println("File not found sorry");
//////            }
//////        }while (option=='y');
//////        }
//////
//////}
