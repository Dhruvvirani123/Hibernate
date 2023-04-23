package ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Student {
	@Id
	private int id;
	private String studentname;
	@ManyToMany
	private List<Teacher> teachers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentname=" + studentname + ", teachers=" + teachers + "]";
	}
}