
public class Job {
	private String jobID;
	private String job;
	private float min_salary;
	private float max_salary;
	
		
	public String getJobID() {
		return jobID;
	}
	public void setJobID(String jobID) {
		this.jobID = jobID;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public float getMin_salary() {
		return min_salary;
	}
	public void setMin_salary(float min_salary) {
		this.min_salary = min_salary;
	}
	public float getMax_salary() {
		return max_salary;
	}
	public void setMax_salary(float max_salary) {
		this.max_salary = max_salary;
	}
	@Override
	public String toString() {
		return "Job [jobID=" + jobID + ", job=" + job + ", min_salary=" + min_salary + ", max_salary=" + max_salary
				+ "]";
	}
	

}
