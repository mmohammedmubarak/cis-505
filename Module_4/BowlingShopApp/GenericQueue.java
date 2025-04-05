/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */
package Module_4.BowlingShopApp;

import java.util.LinkedList;

public class GenericQueue<E> {
    private LinkedList<E> list = new LinkedList<E>();
    public void enqueue(E item){
        list.addFirst(item);
    }
    public E dequeue(){
       return list.removeFirst();
    }
    public int size(){
        return list.size();
    }
}
