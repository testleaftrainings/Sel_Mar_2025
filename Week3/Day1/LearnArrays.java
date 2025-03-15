package week3.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		
		/*
		 * Arrays--->collection of items of same datatype
		 * declarations--->1)Array literal--->based on data
		 *                  2)array instanstiation--->based on size
		 * Array index out of bound exception
		 */
		
		//Array literal:syntax:D.T vN[]={values}
		
		int [] marks= {87,91,92,98,78};//index starts with 0
		
		//length of an array
		int length = marks.length;
		System.out.println(length );//length starts from 1
		
		//iterate all values
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
					
		}
		
		//sort an array
		Arrays.sort(marks);//78,87,91,92,98
		System.out.println("after sorting:"+marks[1]);
		
		//max value
		System.out.println(marks[length-1]);
		
		//Array instanstiation
		
		int marks1[]=new int[4];
		
		marks1[0]=65;
		marks1[1]=78;
		System.out.println(marks1[2]);
	}

}
