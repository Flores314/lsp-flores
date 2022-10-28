package org.howard.edu.lsp.midterm.problem2;

/**
 * Jonathan Flores
 * @author jonhi
 *
 */

public class Person 
{
	private String name;
	private int age;
	private String socialSecurityNumber;
	
	public Person(String name,  String socialSecurityNumber, int age) 
	{
		// initialize private variables
		this.name = name;
		this.age = age;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public String toString() 
	{	
		Integer num = age;
		String ageStr = num.toString();
		String output = this.name + " is " + ageStr + " years old. SSN: " + this.socialSecurityNumber;
		return output;
	}

	public boolean equals(Object o) 
	{
		
		if (o instanceof Person) 
		{
			Person o1 = (Person) o;
			if (o1.socialSecurityNumber.equals(this.socialSecurityNumber)) 
			{	
				return true;
			}			
		}
		return false;	
	}
}