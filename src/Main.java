/**
 * Created by Carol on 12/29/15.
 */
public class Main implements Runnable{
    @Override
    public void run() {
        View mainWindow = new View();
        mainWindow.createAndShowGUI();
    }

    public static void main(String[] args) {
        Thread results = new Thread(new Main());
        results.start();
    }
}
