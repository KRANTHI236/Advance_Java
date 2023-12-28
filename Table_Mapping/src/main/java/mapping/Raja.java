package mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Raja {
	@Id
	private int raja_id;
	private String name;
	private int age;
	@OneToOne
	private Rani r;
	
	public int getRaja_id() {
		return raja_id;
	}
	public void setRaja_id(int raja_id) {
		this.raja_id = raja_id;
	}
	public Rani getR() {
		return r;
	}
	public void setR(Rani r) {
		this.r = r;
	}
	public int getId() {
		return raja_id;
	}
	public void setId(int id) {
		this.raja_id = id;
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
	
	

}
