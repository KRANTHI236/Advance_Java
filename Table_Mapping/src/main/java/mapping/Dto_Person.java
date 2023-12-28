package mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Dto_Person {
	@Id
	private String name;
	private int age;
	private String Dob;
	@OneToOne
	private Dto_Person_Wife dpw;

	public Dto_Person_Wife getDpw() {
		return dpw;
	}

	public void setDpw(Dto_Person_Wife dpw) {
		this.dpw = dpw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return Dob;
	}

	public void setDob(String dob) {
		Dob = dob;
	}

	public Long getAadhar() {
		return Aadhar;
	}

	public void setAadhar(Long aadhar) {
		Aadhar = aadhar;
	}

	Long Aadhar;

}
