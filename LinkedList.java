public class LinkedList {
    private class Node {
        private int value;
        private Node next;
    
        
    }
    private Node first;
    private Node last;

    public void addLast(int item){
        var node = new Node();
        node.value = item;

        if (isEmpty())
          first = last = node;
        else{
            last.next = node;
            last = node;
        }
           
       
    }

    public void addFirst(int item ){
        var node = new Node ();
        node.value = item;

        if (isEmpty()) 
          first= last = node;

            
        else {
            node.next= first;
            first = node;
            
        }

    }

    private boolean isEmpty(){
        return first == null;
    }

    public int indexOf(int item){
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item ) return index;
            current = current.next;
            index++;
            
        }
        return -1;
        
    }

    public boolean contains(int item){
        return indexOf(item) != - 1;
    }

    public void removeFirst(){
        
    }

   
}
