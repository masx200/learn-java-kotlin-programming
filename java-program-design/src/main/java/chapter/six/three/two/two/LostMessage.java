package chapter.six.three.two.two;


public class LostMessage {
    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.w();
            } finally {
                lm.Dispose();
            }
        } catch (Exception e) {
            System.err.println(e);
        }

    }

    void w() throws ImportantException {
        throw new ImportantException();
    }

    void Dispose() throws NormalException {
        throw new NormalException();
    }
}
