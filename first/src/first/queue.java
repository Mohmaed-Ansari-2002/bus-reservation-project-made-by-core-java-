package first;

	class queue{
		int a[]=new int[10];
		int front;
		int rear;
		
		queue() {
			front=-1;
			rear=-1;}
		 public void enqueue(int i) {
				   if(rear>9) {
					   System.out.println("queue is full");
				   }
				   System.out.println("que is inserted");
				   a[++rear]=i;
				   if (front == -1) {
			            front = 0;
			        }
				   
				 
			 } public int dequeue() {
				 if(front==-1 && rear==-1) {
					 System.out.println("queu is empty");
					
				 }
		  int item = a[front++];
	        System.out.println("Element " + item + " dequeued");
	        return item;
	        
	        
			    
			    }
			 
			 int peak() {
				 return a[front];
			 }
		
	}

