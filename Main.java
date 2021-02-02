package com.company;

public class Main {

    public static void main(String[] args) {
	int a=1;
	int b=1;
	int c;
	int d;
	int max=20;

	System.out.println(a);
	System.out.println(b);
	for(d=2;d<max;d++)
    {
        c=a+b;
        System.out.println(" " + c);
        a=b;
        b=c;

    }
    }
}
