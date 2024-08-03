package busReserv;
import java.util.*;
public class bus {
 private int BusNo;
 private boolean ac;
 private String DriverName;
 private String from;
 private String to;
 private int capacity;
String date;
bus(int no,boolean ac,String DName,String from,String to,int cap,String date){
	this.BusNo=no;
	this.ac=ac;
	this.DriverName=DName;
	this.from=from;
	this.to=to;
	this.capacity=cap;
	this.date=date;
}
public int getBusNo() {
	return BusNo;
}
public void setBusNo(int a) {
	 BusNo=a;
 }
public boolean getac() {
		return ac;
 }
 public void setac(boolean a) {
 	 ac=a;
  }
 public String getDriverName() {
		return DriverName;
	}
	public void setDriverName(String Dname) {
		 DriverName=Dname;
	 }
	public String getFrom() {
		return from;
	}
	public void setfrom(String a) {
		 from=a;
	 }
	public String getto() { 
		return to;
	}
	public void setto(String a) {
		 to=a;
	 }
	
	public int getcapacity() {
		return capacity;
	}
	public void setcapacity(int a) {
		 capacity=a;
	 }
	 void displayBusInfo() {
		 System.out.println("busno "+ BusNo +" ac "+ac+" driver name "+DriverName+" from "+ from + " to "+to+" capacity "+capacity);
		
	 }
	public String getDate() {
		// TODO Auto-generated method stub
		return date;
	}
}




