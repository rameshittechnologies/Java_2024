package com.javatpoint.Spring_boot_example_sts;
/*
 * Inheritance is a opps concept
 * how to imple--> using extends keyword
 * types: single,multileve, multiple, hirachle
 * getting properties from super to subcalss [child class]
 * multiple inheritanc deosnt support in java
 * we can acchive through interface
 * 
 * 
 */
public class SuperClassInheritance {

	int empnumber;
	String name;
	SuperClassInheritance(int empnumber,String name){
		this.empnumber=empnumber;
		this.name=name;
	}
	
	void overridingMethod() {
		System.out.println("overridingMethod in parent class"  + this.empnumber +   "name" + this.name);
	}
}
