package Pojos;

public class Nurse 
{
	private long nurseId;
	private String nurseName;
	
	public Nurse() 
	{
		super();
	}

	public Nurse(long nurseId, String nurseName) 
	{
		super();
		this.nurseId = nurseId;
		this.nurseName = nurseName;
	}

	public long getNurseId() 
	{
		return nurseId;
	}

	public void setNurseId(long nurseId) 
	{
		this.nurseId = nurseId;
	}

	public String getNurseName() 
	{
		return nurseName;
	}

	public void setNurseName(String nurseName) 
	{
		this.nurseName = nurseName;
	}
}