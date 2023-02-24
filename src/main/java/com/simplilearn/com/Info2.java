package com.simplilearn.com;

public class Info2 {

private int ID;
private String teacherName;
private String teacherPhone;
private String teacherAddress;
private String className;
public Info2(String teacherName, String teacherPhone, String teacherAddress, String className) {
	super();
	this.teacherName = teacherName;
	this.teacherPhone = teacherPhone;
	this.teacherAddress = teacherAddress;
	this.className = className;

}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getTeacherName() {
	return teacherName;
}
public void setTeacherName(String teacherName) {
	this.teacherName = teacherName;
}
public String getTeacherPhone() {
	return teacherPhone;
}
public void setTeacherPhone(String teacherPhone) {
	this.teacherPhone = teacherPhone;
}
public String getTeacherAddress() {
	return teacherAddress;
}
public void setTeacherAddress(String teacherAddress) {
	this.teacherAddress = teacherAddress;
}
public String getClassName() {
	return className;
}
public void setClassName(String className) {
	this.className = className;
}
public Info2() {
	super();
	// TODO Auto-generated constructor stub
}



}