package edu.dmacc.codedsm.hw7;

public class SumHundred {

    public static int input(int firstInput, int secondInput, int priorResult){

        return firstInput + secondInput + priorResult;

    }

    public static void output(int finalResult, int iterations){

        System.out.println("The first result greater than 100 was " + finalResult + " and took " + iterations + " iterations to complete.");


    }
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int i = 0;
        int keeper = input(a, b, c);

        while(keeper < 100){

            keeper = input(a, b, keeper);
            i = i + 1;

        }

        output(keeper, i);

        }
    }

