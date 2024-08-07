package live.mukeshtechlab.singleton.multithreaded;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(20);

        for(int i = 1; i<=20; i++){
            executorService.execute(new DBConnector());
        }

        executorService.shutdown();

    }
}
