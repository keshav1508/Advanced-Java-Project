package orm.student.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
@Id
private int sid;
private String name;


public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int sid, String name) {
	super();
	this.sid = sid;
	this.name = name;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
