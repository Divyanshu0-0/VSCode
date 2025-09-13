class process1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("P1: " + i);
        }
    }
}

class process2 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) { // Removed the semicolon and properly structured the loop
            System.out.println("P2: " + i);
        }
    }
}

public class Multi { // Fixed class name
    public static void main(String args[]) {
        process1 P1 = new process1();
        process2 P2 = new process2();
        P1.start();
        P2.start();
    }
}
