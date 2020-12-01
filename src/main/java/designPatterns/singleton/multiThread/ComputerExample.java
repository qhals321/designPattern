package designPatterns.singleton.multiThread;

public class ComputerExample {
    private static final int THREAD_NUM = 5;
    public static void main(String[] args) {
        UserThread[] userThreads = new UserThread[THREAD_NUM];
        for (int i = 0; i < THREAD_NUM; i++) {
            userThreads[i] = new UserThread(String.valueOf(i));
            userThreads[i].start();
        }
    }
}
