package mapping_tables;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EMP {
	@Id
	private int eid;
	private String ename;
	private String ejob;
	private int esal;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEjob() {
		return ejob;
	}

	public void setEjob(String ejob) {
		this.ejob = ejob;
	}

	public int getEsal() {
		return esal;
	}

	public void setEsal(int esal) {
		this.esal = esal;
	}

}
