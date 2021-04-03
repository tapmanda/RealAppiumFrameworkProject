package com.Appium.Test;

public class DemoStr {

	public static void main(String[] args) {
		String email = "tapas.mandal@capgemini.com";
		String[] fullname = email.split("@");
		String[] fname = fullname[0].split("\\.");
		System.out.println(fname[0]+" "+fname[1]);
		System.out.println(fullname[1]);
		
		String name="tapas mandal";
		String[] firstname = name.split(" ");
		 char f = firstname[0].toUpperCase().charAt(0);
		
		char[] ch= {'j','a','v','a','t','p','o','i','n','t'};
		//String s=new String(ch);
		
		String s1="Tapas";
		String s2="Tapas";
		String s3=new String("Tapas");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	
		
		int numver=1234567;
		String s=String.valueOf(numver);
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res=res+s.charAt(i);
		}
		System.out.println(Integer.parseInt(res));
		
		
		String fullnames="TAPAS";
		StringBuffer sa=new StringBuffer(fullnames);
		System.out.println(sa.reverse());
		//===============Using For Loop==============
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		
		//=============Without for loop===================
		GetNumber(1, 10);
		System.out.println("=========================");
	int	x=40;
	int	y=30;
		
		y=x-y;
		x=x-y;
		y=x+y;
		
		System.out.println("x :="+x);
		System.out.println("y :="+y);
		
	}
	
	public static void GetNumber(int startNumber,int lastNumber) {
		
		while(startNumber<=lastNumber)
		{
			System.out.println(startNumber);
			startNumber++;
		}
		
		System.out.println("*************************************");
		
		int arr[]= {1,2,3,4};
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
	}
}