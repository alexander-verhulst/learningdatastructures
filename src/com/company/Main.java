package com.company;

public class Main {

    public static void main(String[] args) {

        int x = 3;
        int y = x;
        System.out.println("old value of y" + y);

        x = 5;
        System.out.println("new value of y" + y);

        int[][] myNumbers = { {1, 2, 3, 4},
                              {5, 6, 7},
                              {8, 9, 10}
        };

        int a = myNumbers[0][0]; // 1
        int b = myNumbers[0][1]; // 2
        int c = myNumbers[0][2]; // 3
        int d = myNumbers[0][3]; // 4

        int f = myNumbers[1][0]; //5
        int e = myNumbers[1][1]; // 6
        int g = myNumbers[1][2]; // 7

        int h = myNumbers[2][0]; //8
        int i = myNumbers[2][1]; //9
        int j = myNumbers[2][2]; //10


        System.out.println("First array");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d );

        System.out.println("Second array");
        System.out.println(f);
        System.out.println(e);
        System.out.println(g);

        System.out.println("Third array");

        int test = 12;

        System.out.println(test + 12);





    }
}

/*
Data Types
Abstract Data Types
 */
