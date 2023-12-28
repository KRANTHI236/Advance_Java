package manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dept1 {
	@Id
	private int dno;
	private String dname;

	private String loc;

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

}
