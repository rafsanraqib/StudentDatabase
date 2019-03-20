
// Student Class
class Student{
	// Attributes for Student
	private static final String iD = "1946";
	private String name;
	private String SSN;
	private String email;
	private String city;
	private String state;
	private String UserID;
	private String phone;
	private String courses = "";
	private double balance;
	
	
	// Constructor
	public Student(String name, String SSN) {
		this.name = name;
		this.SSN = SSN;
		this.email = name + "@gmail.com";
		int random = (int) (Math.random()*10);
		this.UserID = iD + SSN.substring(0,3);
		
		
 }
    // Methods for Student
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		phone = phone;
	}
	
	public void depositMoney(double moneyAmount) {
		this.balance = this.balance + moneyAmount;
	}
	
	public void enroll(String course) {
		this.courses = this.courses + "\n" + course;
	}
	
	public void payTuition(double amount) {
		if (amount > this.balance) {
			System.out.print("Not enough Balance");
		}else {
			this.balance = this.balance - amount;
		}
	}
	
	public void checkBalance() {
		System.out.print("$"+ this.balance);
	}
	
	public String toString() {
		return "\nName: " + this.name + "\n" + "email: " + this.email + "\n" + "UserId: " + UserID + "\n" + this.city + "\n" + this.state;
	}
	
	public String showCourses() {
		return courses;
	}
	
}
