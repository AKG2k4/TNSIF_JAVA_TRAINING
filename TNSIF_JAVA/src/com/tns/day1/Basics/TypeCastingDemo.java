package com.tns.day1.Basics;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implicit type-casting
				byte b=10;
				int i=b;
				
				System.out.println(b+"\n"+i);
				
				//explicit type-casting
				float f1=34.56f;
				int f2=(int)f1;
				
				System.out.println("\n"+f1+"\n"+f2);
				
				int i1=25;
				long l1=i1;
				
				System.out.println("\n"+i1+"\n"+l1);
				
				double d1=3.6555829;
				float f3=(float)d1;
				
				System.out.println(d1+"\n"+f3);
				
				char[] sent= {'h','e','l','l','o',' ','w','o','r','l','d'};
				String sentence2=new String(sent);
				System.out.println("\n"+sentence2);

	}

}
