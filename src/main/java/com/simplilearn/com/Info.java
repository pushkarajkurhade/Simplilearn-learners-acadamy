package com.simplilearn.com;

public class Info {

private int ID;	
private String studentName;
private String stPhone;
private String stAddress;
private String courseName;
public Info(String studentName, String stPhone, String stAddress, String courseName) {
	super();
	this.studentName = studentName;
	this.stPhone = stPhone;
	this.stAddress = stAddress;
	this.courseName = courseName;

}


public int getID() {
	return ID;
}


public void setID(int iD) {
	ID = iD;
}


public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStPhone() {
	return stPhone;
}
public void setStPhone(String stPhone) {
	this.stPhone = stPhone;
}
public String getStAddress() {
	return stAddress;
}
public void setStAddress(String stAddress) {
	this.stAddress = stAddress;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public Info() {
	super();
	// TODO Auto-generated constructor stub
}



}

