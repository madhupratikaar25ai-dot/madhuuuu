import java.time.Duration;
public class day15 {
    static void main() throws InterruptedException {
        Runnable chefTask = () -> {
            String[] items = {"Burger", "Dosa", "tea"};
            for (int i = 0; i < items.length; i++) {
                System.out.println("Cooking Item: " + items[i]);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread chefThread = new Thread(chefTask,"chef thread");
        chefThread.start();
                chefThread.join();
                }
            }

