package first;
import java.util.*;
class department{
	int id;
	String DepName;
	department(int a,String s){
		this.id=a;
		this.DepName=s;
	}
	department(department a){
		this.id=a.id;
		this.DepName=a.DepName;
	}
	void display() {
		System.out.println("dep id:"+id);
		System.out.println("depname:"+DepName);
	}
	
}
class student1 implements Cloneable
{
	int id;
    String Name;
    department dep;
    student1(int i,String N,department d){
    	id=i;
    	Name=N;
    	dep=d;
    }
    void display() {
    	System.out.println("stu id: "+  id);
    	System.out.println("stu name :" +Name); 
		dep.display();	
		}
     protected Object clone() throws CloneNotSupportedException {
    	  student1 cloned = (student1) super.clone();
          cloned.dep = new department(this.dep); // Deep copy of department
          return cloned;
     }
    
    
    student1(student1 a){
    id=a.id;
    this.Name=a.Name;
    this.dep=new department(a.dep);
    
    }
}


public class clonesample {
public static void main(String []args) {
	department dept=new department(1,"physics");
	
	student1 s1=new student1(1,"mohamed",dept);
	student1 s2=new student1(s1);
	dept.DepName="maths";
	s1.display();
	s2.display();
	student1 s3=new student1(s1);
	s3.display();
	
}
}
