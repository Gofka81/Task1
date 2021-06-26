package com.epam.rd.java.basic.practice1;

public class Part4 {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.print(N_S_D(num1,num2));
    }
    public static int N_S_D(int a, int b){
        while (b != 0){
            if(a == 0)
                return b;
            if (a > b)
                a%=b;
            else
                b%=a;
        }
        return a;
    }
}
