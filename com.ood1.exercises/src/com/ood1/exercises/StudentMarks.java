package com.ood1.exercises;

public class StudentMarks {

	String studentName;
	int studentNumber;
	int marks1,marks2;
	@Override
	public String toString() {
		return "StudentMarks [studentName=" + studentName + ", studentNumber=" + studentNumber + ", marks1=" + marks1
				+ ", marks2=" + marks2 + ", grade=" + grade + ", total=" + total + "]";
	}
	String grade;
    int total;
    
	public StudentMarks(String studentName, int studentNumber, int marks1, int marks2) {
		super();
		this.studentName = studentName;
		this.studentNumber = studentNumber;
		this.marks1 = marks1;
		this.marks2 = marks2;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
    public void calculateTotalandGrade() {
    	total = marks1 + marks2;
    	if (marks1 >= 90 && marks2 >= 90)
    		grade = "Distinction";
    	else if (marks1 >= 75 && marks2 >= 75)
    		grade = "Very Good";
    	else if (marks1 >= 50 && marks2 >= 50)
    		grade = "Fair";
    	else if (marks1 >= 40 && marks2 >= 40)
    		grade = "Poor";
    	else
    		grade = "Fail";
    	
    }
	

}
