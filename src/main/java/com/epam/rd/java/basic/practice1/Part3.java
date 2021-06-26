package com.epam.rd.java.basic.practice1;

public class Part3 {

    public static void main(String[] args) {
        for(String arg: args){
            if(!arg.equals(args[0]))
                System.out.print(" ");
            System.out.print(arg);
        }
    }
	
}
