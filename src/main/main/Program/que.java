package main.Program;
import java.util.PriorityQueue;
public class que {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for(int i=0;i>0;i--){
            queue.add(i);
            System.out.println("Queue size is"+queue.size());
            System.out.println("head of queue is"+queue.peek());
            queue.poll();
            System.out.println("queue size after poll is"+queue.size());
            System.out.println("head of the queue is"+queue.peek());


        }
    }
}
