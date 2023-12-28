package manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Emp1 {
@Id
	private int eno;
	private String ename;
	private int esal;
	@ManyToOne
	private Dept1 d;

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsal() {
		return esal;
	}

	public void setEsal(int esal) {
		this.esal = esal;
	}

	public Dept1 getD() {
		return d;
	}

	public void setD(Dept1 d) {
		this.d = d;
	}

}
