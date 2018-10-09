    class MyLinkedList {
            MyLinkedList head;
            int val;
            MyLinkedList nextNode;
            MyLinkedList prevNode;
        
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
        public MyLinkedList getprevNode() {
                return this.prevNode;
            }
        public void setprevNode(MyLinkedList prevNode) {
                this.prevNode=prevNode;
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
            if(head!=null) {
                head.setprevNode(newNode);
            }
            head=newNode;
           }
        
        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
             if(head==null) {
                addAtHead(val);
                return;
            }
            MyLinkedList temp=new MyLinkedList();
            temp.setVal(val);
            MyLinkedList current=head;
            while(current!=null && current.getnextNode()!=null) {
                    current=current.getnextNode();
            } 
            if(current!=null) {
                current.setnextNode(temp);
                temp.setprevNode(current);    
                temp.setnextNode(null);
            } 
          }
        
        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {
            if(index==0) {
                addAtHead(val);
                return;
            }
            MyLinkedList temp=new MyLinkedList();
            temp.setVal(val);
            MyLinkedList currentNode=head;
            int traversalIndex=0;
            while(traversalIndex!=index-1 && currentNode!=null) {
                currentNode=currentNode.getnextNode();
                traversalIndex++;
            }
            if(currentNode!=null) {
                temp.setnextNode(currentNode.getnextNode());
                temp.setprevNode(currentNode);
                currentNode.setnextNode(temp);
                if(currentNode.getnextNode()!=null) {
                    currentNode.getnextNode().setprevNode(temp);
                }
               
             } 
          }
        
        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
            MyLinkedList currentNode=head;
            int traversalIndex=0;
            while(traversalIndex!=index && currentNode!=null) {
                currentNode=currentNode.getnextNode();
                traversalIndex++;
            }
            if(currentNode==null) {
                return;
            }
                   
            MyLinkedList nextNode=currentNode.getnextNode();
            MyLinkedList prevNode=currentNode.getnextNode();
            
            if(prevNode!=null) {
                prevNode=nextNode;
            }  
                else {
                    head=next;
                }
            }
     
    }

    /**
     * Your MyLinkedList object will be instantiated and called as such:
     * MyLinkedList obj = new MyLinkedList();
     * int param_1 = obj.get(index);
     * obj.addAtHead(val);
     * obj.addAtTail(val);
     * obj.addAtIndex(index,val);
     * obj.deleteAtIndex(index);
         */