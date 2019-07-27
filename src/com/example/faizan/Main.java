package com.example.faizan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double venom = Math.random();
        int [] sum = new int [10];
        sum [1]=(int)(venom*100);
        sum [2]=(int)(venom*100);
        sum [3]=(int)(venom*100);
        sum [4]=(int)(venom*100);
        sum [5]=(int)(venom*100);
        sum [6]=(int)(venom*100);
        sum [7]=(int)(venom*100);
        sum [8]=(int)(venom*100);
        sum [9]=(int)(venom*100);
        sum [0]=(int)(venom*100);
        int w;
        int z;
        z=0;
        int y=0;
        for (int i=0;i<10;i++){
            w=sum[y];
            if (w>z) {z = w; }
            y++;
        }System.out.println("Max Value : "+z);
    }
}
