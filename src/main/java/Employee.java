public class Employee {
	
	private int empno;
	private String enom;
	private String ecognom;
	private String eemail;
	private String etel;
	private String hiredate;
	private String etreball;
	private float sal;
	private float comm;
	private int mgr;
	private int dpt;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEnom() {
		return enom;
	}
	public void setEnom(String enom) {
		this.enom = enom;
	}
	public String getEcognom() {
		return ecognom;
	}
	public void setEcognom(String ecognom) {
		this.ecognom = ecognom;
	}
	public String getEemail() {
		return eemail;
	}
	public void setEemail(String eemail) {
		this.eemail = eemail;
	}
	public String getEtel() {
		return etel;
	}
	public void setEtel(String etel) {
		this.etel = etel;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public String getEtreball() {
		return etreball;
	}
	public void setEtreball(String string) {
		this.etreball = string;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public float getComm() {
		return comm;
	}
	public void setComm(float comm) {
		this.comm = comm;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public int getDpt() {
		return dpt;
	}
	public void setDpt(int dpt) {
		this.dpt = dpt;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", enom=" + enom + ", ecognom=" + ecognom + ", eemail=" + eemail + ", etel="
				+ etel + ", hiredate=" + hiredate + ", etreball=" + etreball + ", sal=" + sal + ", comm=" + comm
				+ ", mgr=" + mgr + ", dpt=" + dpt + "]";
	}

	
	
}
