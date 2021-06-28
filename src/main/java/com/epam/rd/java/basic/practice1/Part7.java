package com.epam.rd.java.basic.practice1;

public class Part7 {

    public static void main(String[] args) {
        String arrow = " ==> ";
        System.out.println("A"+arrow+str2int("A")+ arrow+int2str(str2int("A")));
        System.out.println("B"+arrow+str2int("B")+ arrow+int2str(str2int("B")));
        System.out.println("Z"+arrow+str2int("Z")+ arrow+int2str(str2int("Z")));
        System.out.println("AA"+arrow+str2int("AA")+ arrow+int2str(str2int("AA")));
        System.out.println("AZ"+arrow+str2int("AZ")+ arrow+int2str(str2int("AZ")));
        System.out.println("BA"+arrow+str2int("BA")+ arrow+int2str(str2int("BA")));
        System.out.println("ZZ"+arrow+str2int("ZZ")+ arrow+int2str(str2int("ZZ")));
        System.out.println("AAA"+arrow+str2int("AAA")+ arrow+int2str(str2int("AAA")));
    }

    public static int str2int(String number) {
        int count = number.length();
        int sum=0;
        char[] numberch =number.toCharArray();
        for(char chr:numberch){
           count--;
           sum += ((int)chr-64)*Math.pow(26,count);
        }
        return sum;
    }

    public static String int2str(int number) {
        StringBuilder column = new StringBuilder();
        while (number > 0) {
            int rem = number % 26;
            if (rem == 0) {
                column.append("Z");
                number = (number / 26) - 1;
            }
            else {
                column.append((char)((rem - 1) + 'A'));
                number = number / 26;
            }
        }
        return column.reverse().toString();
    }

    public static String rightColumn(String number) {
        int temp =str2int(number);
        return int2str(++temp);
    }
}
