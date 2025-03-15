package week3.day1;

public class LearnStrings {

	public static void main(String[] args) {
		/*
		 * String--->collection of characters
		 * declaration--->1)string Literal
		 *                 2)instantiation
		 */
		
		//syntax:Datatype var.name="values"
		
		String name="Testleaf";
		String name1="TestLeaf";
		
		//syntax:Datatype obj=new D.T("values")
		
		String str=new String("TestLeaf");
		String str1=new String("Testleaf");
		
		//count the no of characters
		 
		int length = name.length();//length starts from 1
		System.out.println(length);
		
		//compare two strings(equals)--->content of the string and case sensitive
		boolean equals = str.equals(name);
		System.out.println(equals);
		
		if (str.equals(str1)) {
			System.out.println("same");
			
		} else {
			System.out.println("not same");

		}
		
		//==---->compares the memory location
		
		if (name==name1) {
			System.out.println("same");
			
		} else {
			System.out.println("not same");

		}
		
		//ignoring case sensitive-->check the content only
		boolean eIgnoreCase = str.equalsIgnoreCase(str1);
		System.out.println(eIgnoreCase);
		
		//to CharArray
		char[] charArray = name.toCharArray();
		System.out.println(charArray);
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
			
		}
		
		//CharAt
		char charAt = str.charAt(4);//storin in a local variable--do ctrl+2 and enter L
		System.out.println(charAt);
		
		////replace
		String s="Testleaf@321";
		String replace = s.replace("T","@");
		System.out.println(replace);
		
		//retreive any values
		
		String replaceAll = s.replaceAll("[^0-9]","");
		System.out.println(replaceAll);
		String replaceAll2 = s.replaceAll("[^a-z]","");
		System.out.println(replaceAll2);
		
		//string to integer
		String sT="1234";
		int sToIneger = Integer.parseInt(sT);
		System.out.println(sToIneger+10);
		
		//split--->a string is splitted into multiple strings
		
		String sT1="Testleaf and Qeagle";
		String[] split = sT1.split("ea");
		System.out.println(split[0]);
		
		String[] split2 = sT1.split("");
		System.out.println(split2[1]);
		
		//substring--->crops a string into small strings
		
		String ss="March";
		String substring = ss.substring(2);
		System.out.println(substring);
		String substring2 = ss.substring(1, 3);
		System.out.println(substring2);
		
		

	}

}
