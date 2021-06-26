package com.epam.rd.java.basic.practice1;

public class Part6 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean check;
        int m=0;
        for(int i=2;m<n;i++){
            check = true;
            for(int j=2; j<i; j++){
                if(i%j==0){
                    check = false;
                    break;
                }
            }
            if(check) {
                if(i!=2)
                    System.out.print(" " );
                System.out.print(i);
                m++;
            }
        }
    }
	
}
