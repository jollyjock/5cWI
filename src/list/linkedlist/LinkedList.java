package list.linkedlist;

import list.HTLList;

public class LinkedList implements HTLList {
    private Node root;

    @Override
    public void add(int value) {
        Node n=new Node (value); //neuer knoten wird erstellt
        if (root==null){ //wenn root keinen wert hat
            root=n; //dann wird root zu n dem ersten knoten
        }else{
            Node actual=root;
            while(actual.getNext()!=null){ //solange es nicht null ist nimmt er den nachbarknoten
                actual=actual.getNext();
            }
            actual.setNext(n);
        }

    }

    @Override
    public int get(int index) {
        Node actual=root;  //neuer knoten wird erstellt
        for(int i=0; i < index-1; i++) { //i ist am anfang 0 -> solange i nicht an der angebenen stelle ist, vergrößert sich sich i um eins
            actual=actual.getNext(); //actual nimmt immer den nachbarknoten
        }

        return actual.getValue();
    }

    @Override
    public void remove(int index) {
        Node actual=root; //neuer knoten wird erstellt
        if (index==0){ //wenn der eingegebene wert 0 ist
            root=root.getNext(); // dann wird root der nachbarknoten
            return;
        }
        for (int i=0; i<index-1;i++){ //i ist am anfang 0 -> solange i nicht an der angebenen stelle ist, vergrößert sich sich i um eins
            actual=actual.getNext(); //actual nimmt immer den nachbarknoten
        }
        actual.setNext(actual.getNext().getNext());// rerooting auf den übernächsten knoten z.b:. 1->2->3, 2 wird entfernt, 1->3
    }
}
