package first;


public class queueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
queue q1=new queue();
;

	
q1.enqueue(1);
q1.enqueue(1);
q1.enqueue(2);
q1.enqueue(3);q1.enqueue(1);q1.enqueue(1);q1.enqueue(1);q1.enqueue(4);
System.out.println(q1.dequeue());	
System.out.println(q1.dequeue());	

System.out.println(q1.dequeue());	
System.out.println(q1.dequeue());	
System.out.println(q1.dequeue());	
System.out.println(q1.dequeue());	
System.out.println(q1.peak());	


	}

}
