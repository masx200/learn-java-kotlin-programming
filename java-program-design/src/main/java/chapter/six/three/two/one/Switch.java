package chapter.six.three.two.one;

public class Switch {
    boolean state = false;

    boolean read() {
        return state;
    }

    public void on() {
        state = true;
    }

    public void off() {
        state = false;
    }
}
