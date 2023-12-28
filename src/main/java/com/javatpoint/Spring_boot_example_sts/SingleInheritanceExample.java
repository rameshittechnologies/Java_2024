package com.javatpoint.Spring_boot_example_sts;
/*
 * Inheritance is a opps concept
 * how to imple--> using extends keyword
 * types: single,multileve, multiple, hirachle
 * getting properties from super to subcalss [child class]
 * multiple inheritanc deosnt support in java
 * we can acchive through interface
 * code res useabilty
 * 
 */
public class SingleInheritanceExample extends SuperClassInheritance{

	int subempno;
	String subEmpName;
	SingleInheritanceExample(int empnumber, String name) {
		super(empnumber, name);
	}
	
	void overridingMethod() {
		super.overridingMethod();
		System.out.println("overridingMethod in sub class"  + this.subempno +   "name" + this.subEmpName);
	}

	public static void main(String[] args) {
		SingleInheritanceExample obj = new SingleInheritanceExample(100, "Don");
		obj.overridingMethod();
		
		
		
		System.out.println("subclass values are printing"  + obj.subempno +   "name" + obj.subEmpName);
		
		
		System.out.println("Parentclass values are printing"  + obj.empnumber +   "name" + obj.name);
	}
}
