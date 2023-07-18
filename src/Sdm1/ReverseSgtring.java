package Sdm1;

import java.util.Scanner;

public class ReverseSgtring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2="";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your String");
		str1=sc.nextLine();
		
		int length=str1.length();
		
		for(int i=length-1;i>=0;i--) {
			str2=str2+str1.charAt(i);
		}
		
System.out.println("Reverse of String"    +str2);
	}
	

}
