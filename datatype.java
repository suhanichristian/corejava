package core;
//Primitive -> byte,short,int,long,float,double,boolean,char
//Non-primitive-> Array,String,class

import java.util.Scanner;

public class datatype {
	public static void main(String[] args) {
		
      int i=10, j=5;
      int k = i+j;
      System.out.println("i+j = " +k);
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a = ");
      int a = sc.nextInt();
      System.out.println("enter b = ");
      int b = sc.nextInt();
      System.out.println(a+b);
      System.out.println("enter long value = ");
      Long l = sc.nextLong();

	}

}