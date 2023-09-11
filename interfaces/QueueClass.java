package interfaces;

import java.util.*;

public class QueueClass {
    public static void main (String[] args) throws InterruptedException {
        int time = Integer.parseInt(args[0]);
        Queue<Integer> q = new LinkedList<Integer>();

        for(int i=0; i<time; i++){
            q.add(i);
        }
        Queue<Integer> sortedQueue = new PriorityQueue<>(q);

        while( !q.isEmpty() ){
            System.out.println(q.remove());
            Thread.currentThread();
            Thread.sleep(1000);
        }

        List<Integer> res = new ArrayList<Integer>();
        System.out.println(sortedQueue);

        while( !sortedQueue.isEmpty() ){
            res.add(sortedQueue.remove());
        }

        System.out.println(res);

        return;
    }
}
