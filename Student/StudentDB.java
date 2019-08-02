package Student;
public class StudentDB {
	public boolean addStudent(Student stu){
		boolean b=false;
		if(stu!=null){
			if(DB.index<DB.stu.length){
				int Ssno=stu.getSsno();
				if(!selectStudent(Ssno)){
					DB.stu[DB.index++]=stu;
				}
			}
		}
		return b;
	}
	public boolean deleteStudent(int Ssno){
		boolean b=false;
		if(selectStudent(Ssno)){
			for(int i=0;i<DB.index;i++){
				if(DB.stu[i].getSsno()==Ssno){
					DB.stu[i]=DB.stu[--DB.index];
					DB.stu[DB.index]=null;
					b=true;
				}				
			}
		}
		return b;
	}
	public boolean updateStudent(Student stu){
		boolean b=false;
		if(stu!=null){
				int Ssno=stu.getSsno();
				if(!selectStudent(Ssno)){
					for(int i=0;i<DB.index;i++){
						if(DB.stu[i].getSsno()==Ssno){
							DB.stu[i]=stu;
							b=true;
						}
					}
				}
			}
		return b;
	}
	public boolean selectStudent(int Ssno){
		boolean b=false;
		for(Student t:DB.stu){
			if(t!=null){
				if(t.getSsno()==Ssno){
					b=true;
				}
			}
		}
		return b;
	}
	public void showAll(){
		for(int i=0;i<DB.index;i++){
			System.out.println("学号:\t"+DB.stu[i].getSsno()+"姓名:\t"+DB.stu[i].getSname()+"性别:\t"+DB.stu[i].getSsex());
		}
	}
}
