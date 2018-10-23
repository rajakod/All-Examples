package practice4;

public class SCP {
		public static void main(String[] args) {

			String course1 = "java";   
			String course2 = "java";   
			String course3 = "html";   
			
			String course4 = new String("java");  
			String course5 = new String("java");  
			String course6 = new String("html");  
			
			System.out.println(course1 == course2);  
			System.out.println(course1 == course3);  
			
			System.out.println(course4 == course5);  
			System.out.println(course4 == course6);  
			
			System.out.println(course1.equals(course2));  
			System.out.println(course1.equals(course3)); 
			
			System.out.println(course4.equals(course5)); 
			System.out.println(course4.equals(course6));  
			
		}

	}
