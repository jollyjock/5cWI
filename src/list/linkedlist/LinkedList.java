package list.linkedlist;

import list.HTLList;

public class LinkedList implements HTLList {
    private Node root;

    @Override
    public void add(int value) {
        Node n = new Node (value); //neuer datensatz wird erstellt
        if (root==null){ //root wird als der nullte knoten festgelegt
            root = n; //root wird zu n umgetauft
        }else{
            Node actual = root;
            while(n.getNext()!=null){ //solange es nicht null ist nimmt er den nachbarknoten
                actual = actual.getNext();
            }
            actual.setNext(n);
        }

    }

    @Override
    public int get(int index) {
        Node actual = root;  // node mit dem namen actual wird zu ersten knoten der liste also 0
        for(int i = 0; i < index; i++) { // i ist am anfang 0 -> solange i nicht an der angebenen stelle ist, vergrößert sich sich i um eins
            actual = actual.getNext(); // actual nimmt immer den nachbar knoten
        }

        return actual.getValue();
    }

    @Override
    public void remove(int index) {
    }
}
