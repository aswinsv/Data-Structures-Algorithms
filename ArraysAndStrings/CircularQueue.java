class MyCircularQueue {

    /** Initialize your data structure here. Set the size of the queue to be k. */
    int[] data;
    int head;
    int tail;
    public MyCircularQueue(int k) {
        data=new int[k];
        head=-1;
        tail=-1;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(head==-1 && tail==-1) {
            head=0;
            tail=0;
            data[tail]=value;
            return true;
        }
        else if(!isFull()) {
            tail=(tail+1)%(data.length);
            data[tail]=value;
            return true;
        }    
        return false;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()) {
            return false;
        }
        else if(head==tail) {
            head=-1;
            tail=-1;
            return true;
        }
        else {
            head=((head+1)%(data.length));
            return true;
        }  
      
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(!isEmpty()) {
            return data[head];
        }
        return -1;
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
       if(!isEmpty()) {
            return data[tail];
        } 
        return -1;
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if(head==-1 && tail==-1) {
            return true;
        }
        return false;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
       if(((tail+1)%(data.length))==head) {
           return true;
       }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */