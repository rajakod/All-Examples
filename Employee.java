package practice;

public class Employee {

		private int emplId;
		private String emplName;
		private int salary;
		private char gender;
		
		Employee(){
			
		}
		
		Employee(int emplId, String emplName, int salary, char gender){
			this.emplId = emplId;
			this.emplName = emplName;
			this.salary = salary;
			this.gender = gender;
		}
		
		public static void main(String[] args) {
			
			Employee emp = new Employee();
			
			emp.setEmplId(10);
			emp.setEmplName("harsha");
			emp.setSalary(8500);
			emp.setGender('M');
			
			System.out.println(emp.getEmplId());
			System.out.println(emp.getEmplName());
			System.out.println(emp.getSalary());
			System.out.println(emp.getGender());
			
			Employee emp2 = new Employee();
			emp2.setEmplId(45);
			emp2.setEmplName("hasini");
			emp2.setSalary(9000);
			emp2.setGender('F');
			
			System.out.println(emp2.getEmplId());
			System.out.println(emp2.getEmplName());
			System.out.println(emp2.getSalary());
			System.out.println(emp2.getGender());
			
		}
		
		public int getEmplId() {
			return emplId;
		}
		public void setEmplId(int emplId) {
			this.emplId = emplId;
		}
		public String getEmplName() {
			return emplName;
		}
		public void setEmplName(String emplName) {
			this.emplName = emplName;
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

		@Override
		public String toString() {
			return "Employee [emplId=" + emplId + ", emplName=" + emplName
					+ ", salary=" + salary + ", gender=" + gender + "]";
		}
		
		
		
	}
