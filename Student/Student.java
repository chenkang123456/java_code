package Student;

public class Student {
	private int Ssno;
	private String Sname;
	private String Ssex;
	public Student(int ssno, String sname, String ssex) {
		this.Ssno = ssno;
		this.Sname = sname;
		this.Ssex = ssex;
	}
	public int getSsno() {
		return this.Ssno;
	}
	public void setSsno(int ssno) {
		this.Ssno = ssno;
	}
	public String getSname() {
		return this.Sname;
	}
	public void setSname(String sname) {
		this.Sname = sname;
	}
	public String getSsex() {
		return this.Ssex;
	}
	public void setSsex(String ssex) {
		this.Ssex = ssex;
	}
	

}
