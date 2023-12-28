package com.javatpoint.Spring_boot_example_sts;

public class Exception {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.javatpoint.Spring_boot_example_sts.Exception");// here we getting ClassNotFoundException
		try {
		String s="DathuGowd";
		System.out.println(Integer.parseInt(s)); //here we getting NumberForamateException
		String s1=null;
		System.out.println(s1.length()); //here we get NullPointer Exception
		
		int i=96/0;
		System.out.println(i); // here we get ArithmeticException
		int arr[]= {1,3,5,7};
		System.out.println(arr[8]); // here we getting ArrayIndexOutOfBoundsException
		}
		catch(NullPointerException n) {
			System.out.println(n);
			
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
			
		}
		catch(ArithmeticException m) {
			System.out.println(m);
			
		}
		catch(NumberFormatException e) {
			System.out.println(e);
			
		}
		System.out.println("All Exception are cleared");
		System.out.println("Execute the remaining Code");
		System.out.println("I love My India after 12 years we are enter into the finals");

	}

}
