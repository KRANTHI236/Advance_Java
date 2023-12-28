package manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;

@Entity
public class Products {
	@Id
	private int pid;
	private String pname;
	private int price;
	@ManyToMany
	List<Customers> li1;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<Customers> getLi1() {
		return li1;
	}

	public void setLi1(List<Customers> li1) {
		this.li1 = li1;
	}

}
