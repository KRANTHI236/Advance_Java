package Person;

public class StoreDetails {

	private String name;
	private long mobile_num;
	private String gmail;
	private int age;
	private String password;
	private String gender;
	private String dob;
	private String address;
	private long altMobile_num;
	private String altGmail;

	public StoreDetails() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile_num() {
		return mobile_num;
	}

	public void setMobile_num(long mobile_num) {
		this.mobile_num = mobile_num;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public String getPassword() {
		return password;
	}

	public String getPass1() {
		String s = getPassword();
		String emp = "";
		if (s != null) {
			for (int i = 0; i < s.length(); i++) {
				emp = emp + "*";
			}
		}
		return emp;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getAltMobile_num() {
		return altMobile_num;
	}

	public void setAltMobile_num(long altMobile_num) {
		this.altMobile_num = altMobile_num;
	}

	public String getAltGmail() {
		return altGmail;
	}

	public void setAltGmail(String altGmail) {
		this.altGmail = altGmail;
	}

	public void displayDetails() {
		System.out.println("your name               :" + getName());
		System.out.println("your mobile num         :" + getMobile_num());
		System.out.println("your gmail              :" + getGmail());
		System.out.println("your password           :" + getPass1());
		System.out.println("your gender             :" + getGender());
		System.out.println("your date of birth      :" + getDob());
		System.out.println("your address            :" + getAddress());
		System.out.println("your alternative number :" + getAltMobile_num());
		System.out.println("your alternative gmail  :" + getAltGmail());

	}

}
