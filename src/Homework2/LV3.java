package Homework2;

import java.util.Random;
import java.util.Scanner;

public class LV3 {
    static Oder oder1;
    static Oder oder2;

    static int Number = 13;
    static int ColourNumber = 4;

    public static void main(String[] args) {
        Poker poker = new Poker();
        String[] number1 = new String[Number];
        for (int i = 0; i < Number - 4; i++) {
            number1[i] = String.valueOf(i + 2);
        }
        char[] number2 = {'J', 'Q', 'K', 'A'};
        for (int i = 9; i < 13; i++) {
            number1[i] = String.valueOf(number2[i - 9]);
        }
        int count = 0;
        String[] Colour = {"spades", "clubs", "hearts", "diamonds"};
        String[] Poker = new String[Number * ColourNumber + 2];
        for (int i = 0; i < number1.length; i++) {
            for (int j = 0; j < Colour.length; j++) {
                Poker[count] = Colour[j] + number1[i];
                count++;

            }

        }
        Poker[Number * ColourNumber] = "BingKing";
        Poker[Number * ColourNumber + 1] = "LowKing";
        for (int i = 0; i < Poker.length; i++) {
            System.out.print(Poker[i] + " ");
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }

        }

        System.out.println();
        System.out.println();
        String Mid;
        int record;
        for (int i = 0; i < Poker.length; i++) {
            record = (int) (Math.random() * 54);
            Mid = Poker[i];
            Poker[i] = Poker[record];
            Poker[record] = Mid;
        }
        for (int i = 0; i < Poker.length; i++) {
            System.out.print(Poker[i] + " ");
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.println("请输入玩家1的抽牌数：");
        int a = in.nextInt();
        System.out.println("请输入玩家1的抽牌顺序：(输入1或者2)");
        int b = in.nextInt();
        System.out.println("请输入玩家2的抽牌数：");
        int c = in.nextInt();
        if (c + a > 54 || c + a < 0 || (b != 1 && b != 2)) {
            System.out.println("抽牌张数大于了总牌数或没有输入符合格式的抽牌顺序，请重新输入。");

        } else {
            if (b == 1) {
                oder1 = Oder.FIRST;
                oder2 = Oder.SECOND;
            } else if (b == 2) {
                oder1 = Oder.SECOND;
                oder2 = Oder.FIRST;
            }

            Player[] players = new Player[2];
            players[0] = new Player(a, oder1);
            players[1] = new Player(c, oder2);
            System.out.println("玩家1的手牌：为");
            for (int i = 0; i < a; i++) {
                System.out.print(Poker[i]+"  ");
                if ((i + 1) % 4 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
            System.out.println();
            System.out.println("玩家2的手牌：为");
            for (int i = a; i < Poker.length; i++) {
                System.out.print(Poker[i]+"  ");
                if ((i -a+ 1) % 4 == 0) {
                    System.out.println();
                }

            }
        }
    }
}

enum Oder {
    FIRST, SECOND;
}

class Player {
    int cardNumber;
    Oder oder;

    Player(int cardNumber, Oder oder) {
        this.cardNumber = cardNumber;
        this.oder = oder;

    }

}