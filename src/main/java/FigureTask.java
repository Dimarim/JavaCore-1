package main.java;

import java.util.Scanner;

public class FigureTask {
    /**Write a program to display the pattern
     * like a pyramid using asterisk and each
     * row contain an odd number of asterisks.
       *
      ***
     *****
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height piramid");
        int height = sc.nextInt(), k = 0;

        for(int i = 1; i <= height; ++i, k = 0)
        {
            for(int space = 1; space <= height - i; ++space)
            {
                System.out.print("  ");
            }

            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
}

