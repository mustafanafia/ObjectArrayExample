//-------------------------------------------------
//   Student Class - Used as an example in class
//-------------------------------------------------

public class Student
{
	private String sID;
	private String lastName;
	private	String firstName;
	private String major;
	private double gpa;

//--------------------------------------------------
//    Constructor for the Student class
//--------------------------------------------------

	public Student (String sID, String lastName, String firstName, String major, double gpa)
	{
		this.sID = sID;
		this.lastName = lastName;
		this.firstName = firstName;
		this.major = major;

		if (gpa >= 0.0 && gpa <= 4.0)
			this.gpa = gpa;
		else
			gpa = 0.0;

	}

//--------------------------------------------------
//    Accessors for the Student class
//--------------------------------------------------

	public String getStudentID()
	{	return sID;	}

	public String getLastName()
	{	return lastName;	}

	public String getFirstName()
	{	return firstName;	}

	public String getMajor()
	{	return major;	}

	public double getGPA()
	{	return gpa;	}

//--------------------------------------------------
//    Mutators for the Student class
//--------------------------------------------------

	public void setStudentID(String sID)
	{	this.sID = sID;	}

	public void setLastName(String lastName)
	{	this.lastName = lastName;	}

	public void setFirstName(String firstName)
	{	this.firstName = firstName;	}

	public void setMajor(String major)
	{	this.major = major;	}

	public void setGPA(double gpa)
	{	if (gpa >= 0.0 && gpa <= 4.0)
			this.gpa = gpa;	}


	public String toString ()
	{ return firstName + " " + lastName + " Major: " + major; }

}