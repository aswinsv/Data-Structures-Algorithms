class MyLinkedList {
       
        MyLinkedList head;
        int val;
        MyLinkedList nextNode;
    

    /** Initialize your data structure here. */
    public MyLinkedList() {
    }

    public int getVal() {
            return this.val;
        }
    public void setVal(int val) {
            this.val=val;
        }
    public MyLinkedList getnextNode() {
            return this.nextNode;
        }
    public void setnextNode(MyLinkedList nextNode) {
            this.nextNode=nextNode;
        }
    
   
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        MyLinkedList currentNode=head;
        int traversalIndex=0;
        while(traversalIndex < index && currentNode!=null) {
            currentNode=currentNode.getnextNode();
            traversalIndex++;
        }
            if(currentNode!=null)     
            return currentNode.getVal();
            else
            return -1;
      }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        MyLinkedList newNode=new MyLinkedList();
        newNode.setVal(val);
        newNode.setnextNode(head);
        head=newNode;
        //printLinkedList();
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        MyLinkedList temp=new MyLinkedList();
        temp.setVal(val);
        MyLinkedList newNode=head;
        while(newNode!=null) {
            if(newNode.getnextNode()!=null) {
                newNode=newNode.getnextNode();
            }   
            else
                break;
        } 
        if(newNode!=null) {
        newNode.setnextNode(temp);
        temp.setnextNode(null);
        } 
        //printLinkedList();
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        MyLinkedList temp=new MyLinkedList();
        temp.setVal(val);
        if(index==0 && head==null) {
            addAtHead(val);
        }
        else {
        MyLinkedList previousNode=null;
        MyLinkedList currentNode=head;
        int traversalIndex=0;
        while(traversalIndex!=index && currentNode!=null) {
            previousNode=currentNode;
            currentNode=currentNode.getnextNode();
            traversalIndex++;
        }
        if(previousNode!=null) {
        temp.setnextNode(currentNode);
        previousNode.setnextNode(temp);
        } 
             //printLinkedList();
        }    
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
         MyLinkedList previousNode=null;   
         MyLinkedList currentNode=head;
        int traversalIndex=0;
        while(traversalIndex!=index && currentNode!=null) {
            previousNode=currentNode;
            currentNode=currentNode.getnextNode();
            traversalIndex++;
        }
        if(previousNode!=null && currentNode!=null) {
            previousNode.setnextNode(currentNode.getnextNode());
      } 
        //printLinkedList(); 
    }
    /*public void printLinkedList() {
        MyLinkedList temp=head;
        while(temp!=null) {
            System.out.print(temp.getVal()+" ");
            temp=temp.getnextNode();
        }
        System.out.print("\n");
    }*/
}   
    

/**
 * Your MyLinkedList object will be instantiated and cevialled as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */