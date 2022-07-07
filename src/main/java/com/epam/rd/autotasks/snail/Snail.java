package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int h = input.nextInt();
        if (a>=h) {
            System.out.println(1);
        } else if (a<=b){
            System.out.println("Impossible");
        } else {
            System.out.println((h-a)/(a-b)+1);
        }
    }
}
