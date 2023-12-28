package mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Design {
	@Id
	private int d_no;
	private String d_name;
	@OneToOne
	Mehandi m1;
	public int getD_no() {
		return d_no;
	}
	public void setD_no(int d_no) {
		this.d_no = d_no;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public Mehandi getM1() {
		return m1;
	}
	public void setM1(Mehandi m1) {
		this.m1 = m1;
	}
	

}
