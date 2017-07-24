package lru.cache.simulator;

import java.awt.Panel;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author HishamAhmed
 */
class Node{
    Node prev;
    Node next;
    int pageNo;
    public Node(int pageNo){
        this.prev = null;
        this.next = null;
        this.pageNo = pageNo;
    }
}

class Queue{
    Node front, rear;
    int TotalFrames, count;
    public Queue(int NoOfFrames){
        this.front = null;
        this.rear = null;
        this.count = 0;
        this.TotalFrames = NoOfFrames;
    }
    public boolean isEmpty(){
        return this.rear == null;
    }
    public boolean isFull(){
        return this.count == this.TotalFrames;            
    }
    public Node dequeue(int val, int NoOfFrames){
        Node current = null;
        if(isEmpty()){
            return current;
        }
        if(this.front == this.rear){
            this.front = null;
        }
        if(val == 0){   //MRU
            current = this.front;
            this.front = front.next;
        }
        if(val == 1){   //LRU
            this.rear = this.rear.prev;
            if(this.rear != null){
                current = this.rear.next;
                this.rear.next = null;
            }
        }
/*        if(val == 2){   //RANDOM
            Random gen = new Random();
            int value = gen.nextInt(NoOfFrames+1)+1;
            current = this.front;
            for(int i=0;i<value;i++){
                current = current.next;
            }
            if(current != this.front)
                current.prev.next = current.next;
            else
                this.front = this.front.next;
        }       */
        this.count--;
        return current;
    }
    public void Enqueue(Hash h, int pageNo,int val,int NoOfFrames){
        if(isFull()){
            if(val == 0){
                System.out.println("Deleting "+ this.rear.pageNo + " from cache");
                h.QueArray[this.rear.pageNo] = null;
            }
            if(val == 1){
                System.out.println("Deleting "+ this.front.pageNo + " from cache");
                h.QueArray[this.front.pageNo] = null;
            }
            dequeue(val, NoOfFrames);
    /*        if(val == 2){
                h.QueArray[node.pageNo] = null;
                System.out.println("Deleting "+ node.pageNo + " from cache"); 
            }            */
        }
        Node temp = new Node(pageNo);
        temp.next = this.front;
        if(isEmpty()){
            this.rear = this.front = temp;
        }
        else{
            this.front.prev = temp;
            this.front = temp;
        }
        h.QueArray[pageNo] = temp;
        this.count++;
    }
    public String printQueue(){
        Node temp = this.front;
        String data = "";
        System.out.print("Current Cache: ");
        for(int i=0;i<this.count;i++){
            System.out.print(temp.pageNo + " ");
            data += temp.pageNo + "|";
            temp = temp.next;
        }
        System.out.println("");
        return data;
    }
    public void deleteQueue(){
        this.front = this.rear = null;
    }
}

class Hash{
    int capacity;
    Node[] QueArray;
    public Hash(int capacity){
        this.capacity = capacity;
        this.QueArray = new Node[capacity];
        for (int i=0;i<this.capacity;i++){
            this.QueArray[i] = null;
        }
    } 
}

public class LRUCacheSimulator {
    public Boolean getPage(Queue q, Hash h,int pageNumber,int value,int NoofFrames){
        Node reqPage = h.QueArray[pageNumber];
        if(reqPage == null){
            System.out.println("MISS!!!");
            q.Enqueue(h, pageNumber, value, NoofFrames);
            return false;
        }
        else
        {
            System.out.println("HIT!!!!");
             if (reqPage != q.front){
                reqPage.prev.next = reqPage.next;
                if (reqPage.next != null)
                  reqPage.next.prev = reqPage.prev;
                if (reqPage == q.rear)
                {
                   q.rear = reqPage.prev;
                   q.rear.next = null;
                }
                reqPage.next = q.front;
                reqPage.prev = null;
                q.front.prev = reqPage;
                q.front = reqPage;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                JFrame frame = new JFrame("LRU Cache Simulator");
                frame.setSize(500,450);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                JPanel panel = new JPanel();
                frame.add(panel);
                frame.setSize(415,415);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}