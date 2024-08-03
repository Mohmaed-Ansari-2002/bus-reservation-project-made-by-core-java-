package first;
import java.util.*; 
class some implements  Runnable{
	  public void run()  {
		for(int i=1;i<=5;i++) {
			
		
		System.out.println(i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
	}
	}
	
}
public class AccDmeo {

	public static void main(String[] args) throws InterruptedException {
		//System.out.println("hello");
		some b1=new some();
		Thread t1=new Thread(b1);
		t1.start();
		
		some b2=new some()
		{
			public void run() {
				for(int i=0;i<5;i++) {
					
					
					System.out.println("hello1.1");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {}
				}
				}
				
			};
			
			Thread t2=new Thread(b2);
			t2.start();
			
			Thread t3=new Thread(){ public void run() {

				for(int i=0;i<5;i++) {
					
					
					System.out.println("hello2");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {}
				}}
				};t3.start();System.out.println("end");
				
			}
			
		}



