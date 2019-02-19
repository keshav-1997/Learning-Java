package Pojos;

public class Patient 
{
	private long patNo;
	private String patName;
	private String patBimari;
	
	public Patient() 
	{
		super();
	}

	public Patient(long patNo, String patName, String patBimari) 
	{
		super();
		this.patNo = patNo;
		this.patName = patName;
		this.patBimari = patBimari;
	}

	public long getPatNo() 
	{
		return patNo;
	}

	public void setPatNo(long patNo) 
	{
		this.patNo = patNo;
	}

	public String getPatName() 
	{
		return patName;
	}

	public void setPatName(String patName) 
	{
		this.patName = patName;
	}

	public String getPatBimari() 
	{
		return patBimari;
	}

	public void setPatBimari(String patBimari) 
	{
		this.patBimari = patBimari;
	}
}