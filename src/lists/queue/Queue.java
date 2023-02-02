package lists.queue;

import lists.HTLQueue;

public class Queue implements HTLQueue {
    private Block First;
    private Block Last;

    @Override
    public void enqueue(int value) {
        Block b = new Block(value);
        if (First == null){
            First = b;
            Last=b;
        }else{
            Last.setNext(b);
            Last=b;
        }

    }

    @Override
    public int dequeue() {
        int x= First.getValue();
        First=First.getNext();
        return x;

    }
}
