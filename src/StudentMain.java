import java.util.Scanner;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Studentmarks sobj=new Studentmarks();
		
		System.out.println(" Enter Student Id ");
		sobj.setStudId(sc.nextInt());
		
		System.out.println(" Enter Student Name");
		sobj.setStudName(sc.next());
		
		System.out.println("Enter student Roll no");
		sobj.setStudRoll(sc.nextInt());
		
		System.out.println(" Enter Physics marks ");
		sobj.setPhysics(sc.nextFloat());
		
		System.out.println(" Enter Chemistry marks ");
		sobj.setChemistry(sc.nextFloat());
		
		System.out.println(" Enter Maths marks ");
		sobj.setMaths(sc.nextFloat());
		
		System.out.println("Student Id:"+sobj.getStudId());
		System.out.println("Student Name:"+sobj.getStudName());
		System.out.println("Student Roll no:"+sobj.getStudRoll());
		System.out.println("Physics marks:"+sobj.getPhysics());
		System.out.println("Chemistry marks"+sobj.getChemistry());
		System.out.println("Maths marks"+sobj.getMaths());
		
		float total=sobj.getPhysics()+sobj.getChemistry()+sobj.getMaths();
		float percent=(total/300)*100;
		
	    sobj.setTotal(total);
	    sobj.setPercent(percent);
	    
	    System.out.println("Total marks are:"+sobj.getTotal());
	    System.out.println("Percent:"+sobj.getPercent());
	    
	    
	    
	    
		
		
		
		
		
	}

}
