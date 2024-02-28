package com.PracticeDemos;

public class ClassDemo {

	public static void main(String[] args) {
		Program p=new Program("Java","Problem solving","Laptop");
		p.realWorldPrg();
		Program p1=new Program("Python","Analysis","Mobile");
		p1.industrialPrg();
		
	}

}
class Program{
	String language;
	String skills;
	String resource;
	
	void realWorldPrg() {
		System.out.println("Making Normal people life easy using "+language+" Language");
	}
	void industrialPrg() {
		System.out.println("Using softwares for idustrial benifits which is possible only "+skills+" skills");
	}
	void medicalPrg() {
		System.out.println("Using software in medical field");
	}
	public Program(String language, String skills, String resource) {
		super();
		this.language = language;
		this.skills = skills;
		this.resource = resource;
	}
	
}
