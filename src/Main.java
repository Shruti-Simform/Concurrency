import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService executors = Executors.newScheduledThreadPool(1);
        for (int i = 1; i <= 5; i++) {
            Task task = new Task(i);
            executors.schedule(task, 2, TimeUnit.SECONDS);
        }
        executors.shutdown();
    }
}