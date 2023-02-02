package AlgoDat.lists.stack;

import AlgoDat.lists.HTLStack;

public class Stack implements HTLStack {
    private Layer top;

    @Override
    public void push(int value) {
        Layer l = new Layer(value);
        if (top != null) {
            l.setAbove(top);
        }
        top = l;

    }

    @Override
    public int peek() {
        return top.getValue();
    }

    @Override
    public void pop() {
        top = top.getAbove();
    }
}

