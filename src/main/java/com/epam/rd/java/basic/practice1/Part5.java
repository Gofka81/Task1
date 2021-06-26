package com.epam.rd.java.basic.practice1;

public class Part5 {

    public static void main(String[] args) {
        int sum=0;
        for (String arg : args)
            for (char ch : arg.toCharArray())
                sum += Character.getNumericValue(ch);
        System.out.print(sum);
    }
	
}
