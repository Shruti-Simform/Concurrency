public class Task implements Runnable {
    int id;

    Task(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Task " + id + " is running by " + Thread.currentThread().getName());
        try {
            System.out.println("Processing...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Task " + id + " is completed by " + Thread.currentThread().getName());
    }
}
