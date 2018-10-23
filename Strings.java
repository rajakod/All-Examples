package practice4;

public class Strings {

		public static void main(String[] args) {

			String course1 = "core";
			String course2 = "raja";
			String course3 = "kbr"; 
			
			System.out.println(course1 == course2);  
			System.out.println(course2 == course3); 
			System.out.println(course3 == course1);  
			
			course1="raja"; 
			course2="kbr";
			course3 = "core";
			
			System.out.println(course1 == course2);   
			System.out.println(course2 == course3);  
			System.out.println(course3 == course1); 
			
		}
		
	}
