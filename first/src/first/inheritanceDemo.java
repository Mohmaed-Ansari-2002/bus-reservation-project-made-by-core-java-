package first;
import java.util.*;
import java.time.*;
public class inheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   LocalDateTime localDate = LocalDateTime.of(2002, 1, 28,10,30);
Date specificdate=Date.from(localDate.atZone(ZoneId.systemDefault()).toInstant());
	
//LocalDateTime localDate1 = LocalDateTime.of(2002, 1, 28,10,30);
employee e1=new employee(50000,"mohamed",specificdate);
employee e2=new employee(50000,"mohamed",specificdate);
e1.displayEmp(10);
manager m1 =new manager(50000,"mohamed",specificdate);
manager m2 =new manager(50000,"mohamed",specificdate,1000);
m2.displayEmp(10);

System.out.println(m2.getsalary());

System.out.println(e1.equals(e2));
	}

}
