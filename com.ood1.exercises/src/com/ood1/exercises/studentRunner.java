package com.ood1.exercises;

import java.util.ArrayList;

public class studentRunner {

	public static void main(String[] args) {
		StudentMarks stu = new StudentMarks("Neelam", 120, 96, 97);
		StudentMarks stu1 = new StudentMarks("Nazrin", 121, 95, 90);
		StudentMarks stu2 = new StudentMarks("Kenneth", 122, 20, 40);
		
		ArrayList<StudentMarks> studentList = new ArrayList<>();
		studentList.add(stu);
		studentList.add(stu1);
		studentList.add(stu2);
		
		for (StudentMarks student: studentList) {
			student.calculateTotalandGrade();
			System.out.println(student.toString());
		}
		
	}

}
