package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*int[][] Dio = new int[10][10];
        int i = 10;
        int c=12;
        int j;
        int t;
        for ( j=0 ; j >= i; j=j+1) {
            for ( t = 0; j >= i; t=t+1)
                Dio[j][t] = c=c+c;
            System.out.println(c);
        }*/
   int Array[]= new int[10];
        Scanner myCA= new Scanner(System.in);
   int i =10;
   for(int j=0;i>=j;j++){
      System.out.println("Dammi un czabolo");
       i= myCA.nextInt();

   }

        for(int j=0;i>=j;j++){
            System.out.println(Array[j]);

        }


    }
}

