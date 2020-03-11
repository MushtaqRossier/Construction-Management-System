package task7;

public class Person {
	
	// Attributes
	private String personType;
	private String firstName;
	private String secondName;
	private String address;
	private String cellNumber;
	private String email;
	
	// Getters and setters method
	
	public String getPersonType() {
		return personType;
	}

	public void setPersonType(String personType) {
		this.personType = personType;
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCellNumber() {
		return cellNumber;
	}

	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	// Constructor of getters and setters methods
	public Person(String personType, String firstName, String secondName, String address, String cellNumber, String email) 
	{
		setPersonType(personType);
		setFirstName(firstName);
		setSecondName(secondName);
		setAddress(address);
		setCellNumber(cellNumber);
		setEmail(email);
	}
	
	// Converts all variables to strings and outputs in a formal manner
	public String toString ()
	{
		String output = "Person type: " + getPersonType() + "\n";
		output += "First name of person: " + getFirstName() + "\n";
		output += "Surname of person: " + getSecondName() + "\n";
		output += "Physical address of person: " + getAddress() + "\n";
		output += "Cell number of person: " + getCellNumber() + "\n";
		output += "Email address of person: " + getEmail();
		return output;
		
	}
	
	
}	