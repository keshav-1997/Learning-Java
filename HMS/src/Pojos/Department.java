package Pojos;

public class Department 
{
	private int deptID;
	private String deptName;
	private Doctor doctor;
	
	public Department() 
	{
		super();
	}

	public Department(int deptID, String deptName, Doctor doctor) 
	{
		super();
		this.deptID = deptID;
		this.deptName = deptName;
		this.doctor = doctor;
	}

	public int getDeptID() 
	{
		return deptID;
	}

	public void setDeptID(int deptID) 
	{
		this.deptID = deptID;
	}

	public String getDeptName() 
	{
		return deptName;
	}

	public void setDeptName(String deptName) 
	{
		this.deptName = deptName;
	}

	public Doctor getDoctor() 
	{
		return doctor;
	}

	public void setDoctor(Doctor doctor) 
	{
		this.doctor = doctor;
	}	
}