package test;

import java.util.*;

class Faculty{
	
	String imeFakultet;
	List<Student> list= new List<>();
	
	public Faculty(String ime) {
		this.imeFakultet= ime;
	}
	
	public void addStudent(Student s) {
		list.add(s);
	}
	
	public void removeStudent(Student s) {
		list.remove(s);
	}
	
	public double avgGrade() {
		double sum;
		for (int i = 0; i < list.size(); i++) {
			sum+= list.get(i).getAverage();
		}
		double avg= sum/list.size();
		return avg;
	}
	
	public double avgEcts() {
		int sum;
		for (int i = 0; i < list.size(); i++) {
			sum+= list.get(i).ECTSCredits();
		}
		double avg= sum/list.size();
		return avg;
	}
}