package list.stack;

import list.HTLStack;
import list.linkedlist.Node;

public class Stack implements HTLStack {
    private Layer top;

    @Override
    public void push(int value) {
        Layer l = new Layer (value);
        if (top==null){
            top=l;
        }else{
            Layer actual=top;
            while(actual.getAbove()!=null){
                actual=actual.getAbove();
            }
            actual.setNext(l);
        }

    }


    @Override
    public void peak(int index) {
    }

    @Override
    public void pop(int index) {
    }
}
