package manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Customers {
	@Id
	private int cid;
	private String cname;
	private long cno;
	@ManyToMany(mappedBy = "li1")
	List<Products> li;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public long getCno() {
		return cno;
	}

	public void setCno(long cno) {
		this.cno = cno;
	}

	public List<Products> getLi() {
		return li;
	}

	public void setLi(List<Products> li) {
		this.li = li;
	}

}
