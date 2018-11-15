package test3_programs;

public class ImplelemtAQueue {
	public static void main(String[] args) {
		Queue myq = new Queue();

		myq.enQueue(1);
		
		System.out.println("myq.top = " + myq.top);
		System.out.println("myq.tail = " + myq.tail);

		System.out.println("myq.top.next = " + myq.top.next);
		System.out.println("myq.tail.next = " + myq.tail.next);
		myq.enQueue(2);

		System.out.println("myq.top = " + myq.top);
		System.out.println("myq.tail = " + myq.tail);

		System.out.println("myq.top.next = " + myq.top.next);
		System.out.println("myq.tail.next = " + myq.tail.next);

		myq.enQueue(3);
		myq.enQueue(4);
		myq.enQueue(5);

		myq.displayAllNodes();

		myq.peek();

		myq.deQueue();
		myq.deQueue();

		myq.displayAllNodes();

	}

}
