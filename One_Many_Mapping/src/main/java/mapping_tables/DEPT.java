package mapping_tables;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class DEPT {
	private int deptno;
	@Id
	private String loc;
	private String dname;
	@OneToMany
	List<EMP>li;

	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public List<EMP> getLi() {
		return li;
	}
	public void setLi(List<EMP> li) {
		this.li = li;
	}
	
}
