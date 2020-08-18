class TestEmployee {
	float salary;
	
	public TestEmployee(float sal) {
		salary = sal;
	}
	
	public void printSal() {
		System.out.println("Salary : " + salary);
		{
		TestEmployee test = new TestEmployee(salary);  
		System.out.println("Enter the Employee details");
	}
	}