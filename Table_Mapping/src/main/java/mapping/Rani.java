package mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Rani {
	@Id
	private int rani_id;
	private String name;
	private int age;
	

	public int getId() {
		return rani_id;
	}
	public void setId(int id) {
		this.rani_id = id;
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
