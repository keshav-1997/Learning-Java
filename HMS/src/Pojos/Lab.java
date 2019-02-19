package Pojos;

public class Lab 
{
	private int labNo;
	private String labName;
	private Nurse nurse;
	
	public Lab() 
	{
		super();
	}

	public Lab(int labNo, String labName, Nurse nurse) 
	{
		super();
		this.labNo = labNo;
		this.labName = labName;
		this.nurse = nurse;
	}

	public int getLabNo() 
	{
		return labNo;
	}

	public void setLabNo(int labNo) 
	{
		this.labNo = labNo;
	}

	public String getLabName() 
	{
		return labName;
	}

	public void setLabName(String labName) 
	{
		this.labName = labName;
	}

	public Nurse getNurse() 
	{
		return nurse;
	}

	public void setNurse(Nurse nurse) 
	{
		this.nurse = nurse;
	}
}