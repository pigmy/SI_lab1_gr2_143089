package test;

import java.util.*;

class Student {
	String index;
	String firstName;
	String lastName;
	ArrayList<Integer> grades= new ArrayList<Integer>();

	//TODO constructor
	public Student(String index, String firstName, String lastName) {
		this.index= index;
		this.firstName= firstName;
		this.lastName= lastName	;
	}
	
	//TODO seters & getters
	public void setGrade(int grade) {
		this.grades.add(grade);
	}
	
	public ArrayList<Integer> getGrades() {
		return this.grades;
	}
	
	public String getIndex() {
		return this.index;
	}
	
	public String getName() {
		String name= this.firstName + " " + this.lastName;
		return name;
	}
	
	public double getAverage() {
		//TODO
		int sum= 0;
		for (int i = 0; i < grades.size(); i++) {
			sum+= grades.get(i);
		}
		double avg= sum/grades.size();
		return avg;
	}

	public int ECTSCredits() {
		//TODO
		int ects= grades.size()*6;
		return ects;
	}
}
