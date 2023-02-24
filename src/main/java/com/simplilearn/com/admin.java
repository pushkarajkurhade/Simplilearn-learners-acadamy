package com.simplilearn.com;




public class admin {
private int ID;
private String name;
private String password;
public admin(String name, String password) {
	super();
	this.name = name;
	this.password = password;

}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public admin() {
	super();
	// TODO Auto-generated constructor stub
}


}