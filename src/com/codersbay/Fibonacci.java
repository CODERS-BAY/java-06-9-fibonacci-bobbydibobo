package com.codersbay;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

       /* Simple solution:

        System.out.println("Choose the spot you want to know the fibonacci number from, yo.");
        int spot = scan.nextInt();

        int[] fibonacciArray = new int[spot];

        for (int i = 0; i < fibonacciArray.length; i++){
            if (i==0){
                fibonacciArray[i] = 0;
            } else if (i==1){
                fibonacciArray[i] = 1;
            } else if (i==spot-1) {
                fibonacciArray[i] = fibonacciArray[i-2]+fibonacciArray[i-1];
                System.out.print(fibonacciArray[i]);
            } else{
                fibonacciArray[i] = fibonacciArray[i-2]+fibonacciArray[i-1];
            }

        }
      */

        Scanner scan = new Scanner(System.in);

        System.out.println("Choose the spot you want to know the fibonacci number from, yo.");
        int spot = scan.nextInt()-1;

        fibonacciReursive(spot);

        System.out.println(fibonacciReursive(spot));

    }

    public static long fibonacciReursive(int counter){

        if (counter == 0){
            return 0;
        } else if (counter == 1){
            return 1;
        }

        long result = fibonacciReursive(counter -1) + fibonacciReursive(counter -2);

        return result;
    }


}
