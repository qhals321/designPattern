package designPatterns.singleton.multiThread;

import designPatterns.singleton.Computer;

public class UserThread extends Thread{
    public UserThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        Computer computer = Computer.getComputer();
        System.out.println(currentThread().getName() + " : " + computer);
    }
}
