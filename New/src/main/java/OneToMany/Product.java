package OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Product {
	@Id
	private int id;
	private String pname;
	@OneToMany
	private Seller snmae;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Seller getSnmae() {
		return snmae;
	}
	public void setSnmae(Seller snmae) {
		this.snmae = snmae;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", snmae=" + snmae + "]";
	}
}
