package maccess;

public class Employee {

	public String eId,eName,eDesg;
	public int bSal;
	public float totSal;
	public Employee(String eId, String eName, String eDesg, int bSal) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eDesg = eDesg;
		this.bSal = bSal;
		totSal=bSal+(0.93F*bSal)+(0/63F*bSal);
	}//end of constructor
	
	public String toString() {
		return eId+"\t"+eName+"\t"+eDesg+"\t"+bSal+"\t"+totSal;
	}//end of toString method
	
}//end of class
