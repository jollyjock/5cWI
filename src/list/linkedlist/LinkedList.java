package list.linkedlist;

import list.HTLList;

public class LinkedList implements HTLList {
    private Node root;

    @Override
    public void add(int value) {
        Node n = new Node (value);
        if (root==null){
            root = n;
        }else{
            Node actual = root;
            while(n.getNext()!=null){
                actual = actual.getNext();
            }
            actual.setNext(n);
        }

    }

    @Override
    public void get(int index) {

    }

    @Override
    public void remove(int index) {

    }
}
