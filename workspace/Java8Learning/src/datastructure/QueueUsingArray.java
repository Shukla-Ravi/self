/**
 * 
 */
package datastructure;

/**
 * @author ravishukla
 *
 */
public class QueueUsingArray {

	int capcity, front, rear, queue[];


	public QueueUsingArray(int size) {
		capcity=size;
		front=0;
		rear=-1;
		queue = new int [capcity];
	}


	private void addToQueue(int data)
	{
		if(capcity == front)
		{
			System.out.println("Queue is full");	
		}
		else
		{
			queue[front++] = data;
			System.out.println(data + " - Added to the queue = " + front );
		}
	}

	private void deQueue()
	{
		if(front == 0)
			System.out.println("Queue is empty");
		else
		{
			front--;
			int data = queue [++rear];
			queue[rear] = 0;
			System.out.println(data + " is Dequeue " + rear);
			
		}
		if(capcity-1 == rear)
			rear=-1;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingArray qu = new QueueUsingArray(5);
		qu.addToQueue(10);
		qu.addToQueue(104);
		qu.addToQueue(109);
		qu.addToQueue(110);
		qu.addToQueue(3);
		qu.addToQueue(111);
		qu.addToQueue(121);
		qu.deQueue();
		qu.deQueue();
		qu.deQueue();
		qu.deQueue();
		qu.deQueue();
		qu.deQueue();
		qu.deQueue();
		qu.deQueue();
		qu.deQueue();
		qu.addToQueue(114);
		qu.addToQueue(123);
		qu.addToQueue(119);
		qu.addToQueue(129);
		qu.addToQueue(124);
		qu.addToQueue(125);
		qu.deQueue();
		qu.deQueue();
		qu.addToQueue(134);
		qu.addToQueue(135);
		qu.deQueue();
		qu.deQueue();
	}

}
