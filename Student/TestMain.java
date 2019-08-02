package Student;
import java.util.Scanner;
public class TestMain {
	public static void main(String[] args) {
		StudentDB stu=new StudentDB();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("*********************************************");
		System.out.println(" 1.添加学生信息"
								+ "\n 2.删除学生信息"
								+ "\n 3.修改学生信息"
								+ "\n 4.查询学生信息"
								+ "\n 5.浏览学生信息"
								+ "\n 6.退出");
		System.out.println("*********************************************");
		
		System.out.println("请输入你的选择:");
		int num=sc.nextInt();
		boolean isb=false;
		while(isb){
			switch(num){
			case 1:
				System.out.println("请输入学号");
				int Ssno=sc.nextInt();
				System.out.println("请输入姓名");
				String Sname=sc.next();
				System.out.println("请输入性别");
				String Ssex=sc.nextLine();
				Student s = new Student(Ssno, Sname,Ssex);
				boolean b = stu.addStudent(s);
				if (b) {
					System.out.println("添加成功");
				} else {
					System.out.println("添加失败");
				}
				break;
			case 2:	
				System.out.println("请输入要删除学生学号");
				int Ssno1=sc.nextInt();
				boolean db = stu.deleteStudent(Ssno1);
				if (db) {
					System.out.println("删除成功");
				} else {
					System.out.println("删除失败");
				}
				break;
			case 3:
				System.out.println("请输入要修改学生学号");
				int Ssno2=sc.nextInt();
				System.out.println("请输入姓名");
				String Sname2=sc.nextLine();
				System.out.println("请输入性别");
				String Ssex2=sc.nextLine();
				
				Student s1 = new Student(Ssno2, Sname2,Ssex2);
				boolean b1 = stu.updateStudent(s1);
				if (b1) {
					System.out.println("修改成功");
				} else {
					System.out.println("修改失败");
				}
				break;
			case 4:
				System.out.println("请输入要查询学生学号");
				int Ssno3=sc.nextInt();
				boolean db1 = stu.deleteStudent(Ssno3);
				if (db1) {
					System.out.println("查询成功");
				} else {
					System.out.println("查询失败");
				}
				break;
			case 5:
				stu.showAll();
				break;
			case 6:
				isb = false;
				break;
			default:
				System.out.println("输入有误");
			}	
		}
	}
}
