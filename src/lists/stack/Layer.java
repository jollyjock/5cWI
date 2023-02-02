package lists.stack;

public class Layer {
    private int value;
    private Layer next;

    public Layer(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Layer getAbove() {
        return next;
    }

    public void setAbove(Layer next) {
        this.next = next;
    }
}
