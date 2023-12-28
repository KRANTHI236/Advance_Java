package mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Dto_Person_Wife {
@Id
	private String w_name;
	private int w_age;
	private String w_dob;
	private Long w_aadhar;
	@OneToOne
	private Dto_Person dtp;
	
	public Dto_Person getDtp() {
		return dtp;
	}
	public void setDtp(Dto_Person dw) {
		this.dtp = dw;
	}
	public String getW_name() {
		return w_name;
	}
	public void setW_name(String w_name) {
		this.w_name = w_name;
	}
	public int getW_age() {
		return w_age;
	}
	public void setW_age(int w_age) {
		this.w_age = w_age;
	}
	public String getW_dob() {
		return w_dob;
	}
	public void setW_dob(String w_dob) {
		this.w_dob = w_dob;
	}
	public Long getW_aadhar() {
		return w_aadhar;
	}
	public void setW_aadhar(Long w_aadhar) {
		this.w_aadhar = w_aadhar;
	}
	
	
	
	
}
