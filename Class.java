package practice;

public class Class {
		
		private String name;
		private String course;
		private int salary;
		private char gender;
		private static String organization;
		
		
		void display() {
			System.out.println(name);
		}
		
		static void m1(){
			System.out.println(organization);
		}
		
		public static void main(String[] args) {
			
			Class.setOrganization("cisco company");
			
			
			Class obj = new Class();
			
			
			obj.setName("raja");
			obj.setCourse("java");
			obj.setSalary(5000);
			obj.setGender('M');
			
			System.out.println(obj.getName());
			System.out.println(obj.getCourse());
			System.out.println(obj.getSalary());
			System.out.println(obj.getGender());
			
			Class obj2 = new Class();
			  obj2.setName("raju");
			  obj2.setCourse("html");
			  obj2.setGender('M');
			  obj2.setSalary(8000);
			  
			  System.out.println(obj.getOrganization());
			  System.out.println(obj2.getOrganization());
			
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}

		public String getOrganization() {
			return organization;
		}

		public static void setOrganization(String organization) {
			Class.organization = organization;
		}
}
