package Homework2;



public class Poker {
 static int Number=13;
static  int ColourNumber=4;

    public static void main(String[] args) {
        Poker poker=new Poker();
        String [] number1 =new String[Number];
        for (int i = 0; i <Number-4 ; i++) {
            number1[i]= String.valueOf(i+2);
        }
char [] number2={'J','Q','K','A'};
        for (int i = 9; i <13 ; i++) {
            number1[i]= String.valueOf(number2[i-9]);
        }
//        for (int i = 0; i <number1.length ; i++) {
//            System.out.println(number1[i]);
//        }

    String [] Colour={ "spades","clubs","hearts","diamonds"};
        for (int i = 0; i <number1.length ; i++) {
            for (int j = 0; j <Colour.length; j++) {

                System.out.print(Colour[j]+number1[i]+" ");
            if(j==3){
                System.out.println();
            }
            }

        }
        System.out.println("BigKing"+" "+"LowKing");

    }
        }



