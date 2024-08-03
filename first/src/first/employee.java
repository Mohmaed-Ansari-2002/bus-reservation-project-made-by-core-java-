package first;

import java.util.Date;

public class employee {//base class or parent class or super class
	
		private int salary;
		private String name;
		Date date;

		public int getsalary() {//accesor
			return salary;
			
		}
		public void setsalary(int s) {// mutator
			salary= s;
		}
		public String getname() {
			return name;
			
		}
		public void setname(String Sname ) {
			name=Sname;
			
		}
		public Date getdate() {
			return date;
		}
		public void setdate(Date d) {
			date=d;
		}employee(int s,String n,Date d){
			salary=s;
			name=n;
			date=d;}
		  public int getbonus(int percent) {
			 return salary*percent/100;
		  }
		 
   void displayEmp(int percent) 
   { int bonus=getbonus(percent);
	   System.out.println("Emp NAMe is "+ getname()+"\n That emp salry "+getsalary()+"\n join date of that emp "+getdate()+"\n afte geting bonus salry emp :"+(getsalary()+bonus) );
	   
   }
   
   void displayEmp(){
	   int bonus;
	   System.out.println("Emp NAMe is "+ getname()+"\n That emp salry "+getsalary()+"\n join date of that emp "+getdate()+"\n afte geting bonus salry emp :"+getsalary() );

   }

	
}
class manager extends employee{//child class or derived class or sub class
	int bonus;
	 manager(int s, String n, Date d,int b) {
		super(s, n, d);
		// TODO Auto-generated constructor stub
		 bonus=b;
	}
	 
	  
	 manager(int s, String n, Date d) {
			super(s, n, d);} 
	public int getsalary() {//method overriding
		return super.getsalary()+bonus;
	 }
	void displayEmp() {
		super.displayEmp(bonus);
	}
}
