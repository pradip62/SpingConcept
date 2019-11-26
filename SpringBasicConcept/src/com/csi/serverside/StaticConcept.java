package com.csi.serverside;
public class StaticConcept {
	static int empId=121;
	int empCode=120;
	public static void main(String[] args) {
		System.out.println("Hi");	
		StaticConcept c1 = new StaticConcept();
		System.out.println("WELCOME");
		c1.get();
		c1.net();
		set();
		Dept dd = new Dept();	
	}
	void get() {
		System.out.println("Hello");
		System.out.println("\n empId: "+ empId);
	}
	static void set() {
		System.out.println("Pune");
		//System.out.println(""+ empCode);
	}
	void net() {
		System.out.println("CSI");
	}
	static {
		System.out.println("INSPIRIA MALL");
	}
	static {
		System.out.println("AMANORA MALL");
	}
	static {
		System.out.println("SEASON MALL");
	}
	static class Dept{	
	}

}
