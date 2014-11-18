package com.charmyin.other;

import org.junit.Test;

public class TestValueAndReference {

	void duplicate (int a, int b, int c)
	{
	 a*=2;
	 b*=2;
	 c*=2;
	}
	
	void doubleString(String a, String b, String c){
		a = a+a;
		b+=b;
		c+=c;
		a="bbbbb";
	}
	
	@Test
	public void main ()
	{
	 int x=1, y=3, z=7;
	 duplicate (x, y, z);
	 System.out.println("x="+x+";y="+y+";z="+z);
	 
	 String a=new String("a"), b="b", c="c";
	 doubleString(a, b, c);
	 System.out.println("a="+a+";b="+b+";c="+c);
	 
	 User user = new User();
	 user.name="name";
	 user.age="23";
	 
	 changeUser(user);
	 System.out.println(user.name+user.age);
	// cout << "x=" << x << ", y=" << y << ", z=" << z;
	}

	void changeUser(User user){
		user.name="nonono";
		user.age="yeyeye";
	}
}

class User{
	public String name ;
	public String age;
	
	
	
	
	
	
	
	
	
	
	
	
}