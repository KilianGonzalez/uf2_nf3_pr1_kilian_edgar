
public class Department {
	
	private int deptno;
	private String dname;
	private int mgr;
	private int Location;
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public int getLocation() {
		return Location;
	}
	public void setLocation(int location) {
		Location = location;
	}
	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", dname=" + dname + ", mgr=" + mgr + ", Location=" + Location + "]";
	}
	
	

}
