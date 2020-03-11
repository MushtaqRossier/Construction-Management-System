package task7;

public class Project {
	
	//Attributes
	private int projectNumber;
	private String projectName;
	private String projectType;
	private String address;
	private int erfNumber;
	private String amountDue;
	private String amountPaid;
	private String dueDate;
	
	// Getters and setters methods
	public String getAmountPaid() {
		return amountPaid;
	}


	public void setAmountPaid(String amountPaid) {
		this.amountPaid = amountPaid;
	}


	public String getDueDate() {
		return dueDate;
	}


	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	public Project(int projectNumber, String projectName, String projectType, String address, int erfNumber,
			String amountDue, String amountPaid, String dueDate) {
		super();
		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.projectType = projectType;
		this.address = address;
		this.erfNumber = erfNumber;
		this.amountDue = amountDue;
		setAmountPaid(amountPaid);
		setDueDate(dueDate);
	
	}

	// Converts all variables to strings and outputs in a formal manner
	public String toString ()
	{
		String output = "Project number: " + projectNumber;
		output += "\nProject name: " + projectName;
		output += "\nProject type: " + projectType;
		output += "\nAddress: " + address;
		output += "\nERF number: " + erfNumber;
		output += "\nTotal amount due: " + amountDue;
		output += "\nTotal amount paid to date: " + getAmountPaid();
		output += "\n Due date of the project: " + getDueDate();
		return output;
	}
	
	
	
	
	
	
	

}

