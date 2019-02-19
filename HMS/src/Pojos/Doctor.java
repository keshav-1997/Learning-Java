package Pojos;

public class Doctor 
{
	private long doctID;
	private String doctName;
	private String docSpct;
	private Patient Patient;
	
	public Doctor() 
	{
		super();
	}

	public Doctor(long doctID, String doctName, String docSpct, Patient patient) 
	{
		super();
		this.doctID = doctID;
		this.doctName = doctName;
		this.docSpct = docSpct;
		this.Patient = patient;
	}

	public long getDoctID() 
	{
		return doctID;
	}

	public void setDoctID(long doctID) 
	{
		this.doctID = doctID;
	}

	public String getDoctName() 
	{
		return doctName;
	}

	public void setDoctName(String doctName) 
	{
		this.doctName = doctName;
	}

	public String getDocSpct() 
	{
		return docSpct;
	}

	public void setDocSpct(String docSpct) 
	{
		this.docSpct = docSpct;
	}

	public Patient getPatient() 
	{
		return Patient;
	}

	public void setPatient(Patient patient) 
	{
		Patient = patient;
	}
}