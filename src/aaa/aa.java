package aaa;

import java.math.BigDecimal;
import java.util.Scanner;

public class aa {

	 public static void main(String[] args) {

		 long num = f(20);
		 System.out.println(num);
		 int i = f2(num);
		 System.out.println(i);
	}
	 static long f(int n){
		 if(n==0) {
			 return 1;
		 }else {
			 return n*f(n-1);
		 }
		
		
	 }
	 static int f2(long num){
			int i =0;
			while(num%10==0) {
				i++;
				num =num/10;
			}
			return i;
		}

}
