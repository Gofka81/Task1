package com.epam.rd.java.basic.practice1;

public class Part2 {

    public static void main(String[] args) {
        int sum=0;
        for(String number: args){
            sum += Integer.parseInt(number);
        }
        System.out.print(sum);
    }
}
