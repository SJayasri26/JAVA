package org.array;

public class Array {
	public static void main(String[]args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=50;
		a[3]=30;
		a[4]=40;
		for(int b:a)
			System.out.println(b);
		for(int i=0;i<4;i++) {
			System.out.println(a[i]);
		}
	}
}
