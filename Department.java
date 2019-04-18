package inu;

public class Department {
	private int departmentId;
	
	
	public Department(int departmentId) {
		this.departmentId = departmentId;
	}
	
	@Override
	public String toString() {
		return String.valueOf(departmentId);
	}

}
