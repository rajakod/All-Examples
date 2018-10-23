package practice4;

public class DefinedMethods {
 
		public static void main(String[] args) {

			String course = "java";
			
			System.out.println(course);
			System.out.println(course.charAt(0));  
			
			
			System.out.println(course.toLowerCase());  
			
			System.out.println(course.toUpperCase());  
			
			System.out.println(course.indexOf('a'));
			
			String course2 = "spring";
			System.out.println(course.concat(course2));    
			
			System.out.println(course.length()); 
			
			System.out.println(course == course2); 
			System.out.println(course.equals(course2));  
			
			String x = "Script";
			System.out.println(x);  
			System.out.println(x.trim()); 
			
		}

	}
