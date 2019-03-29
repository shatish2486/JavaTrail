package javaProject;

public class JavaProgram {
	
	public void empid() {
		System.out.println("empID is 12345");
	}
		
	public void empid(int i) {
		
		System.out.println(i);
	}
	
	public void empid(int j, long phno) {
	System.out.println(j+"\n"+phno);
			
	}
	
	public static void main(String[] args) {
		
	JavaProgram ci=new JavaProgram();
			
	ci.empid();
	ci.empid(5);
	ci.empid(0,12345);}

}
