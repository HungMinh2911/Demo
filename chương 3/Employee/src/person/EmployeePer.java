package person;
import java.util.*;
public class EmployeePer extends Person {
	protected String employeeID;
	protected String dateHired;
	public EmployeePer() {
		super();
	}
	public EmployeePer(String name, int age, char gender, String employeeID, String dateHired) {
		super(name, age, gender);
		this.employeeID = employeeID;
		this.dateHired = dateHired;
	}
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getDateHired() {
		return dateHired;
	}
	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	@Override
	public String toString() {
		return super.toString() + ", Employee [employeeID=" + employeeID + ", dateHired=" + dateHired + "]";
	}
	public void nhap()
	{
		Scanner sc= new Scanner(System.in);
		super.nhap();
		System.err.print("Ma nhan vien: ");
		this.employeeID=sc.nextLine();
		System.out.print("Ngay vao lam: ");
		this.dateHired=sc.nextLine();
	}
	
}
