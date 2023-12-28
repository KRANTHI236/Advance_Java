package mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mehandi {
	@Id
	private int no;
	private String m_name;
	@OneToOne
	Design d;
	public Design getD() {
		return d;
	}
	public void setD(Design d) {
		this.d = d;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	

}
