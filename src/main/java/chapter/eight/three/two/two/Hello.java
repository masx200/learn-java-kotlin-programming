package chapter.eight.three.two.two;

class Hello implements Runnable {
    int i = 0;
    private boolean timeToQuit = false;

    //标志没有被设置前,将每隔10 ms 输出两行hello
    public void run() {
        while (!timeToQuit) {
            System.out.println("Hello" + i++);
            try {
                if (i % 2 == 0) Thread.sleep(10);
            } catch (Exception e) {
            }
        }
    }

    public void stopRunning() {
        timeToQuit = true;
    }
}
