package live.mukeshtechlab.singleton.multithreaded;

public class DBConnector implements Runnable {

    @Override
    public void run() {
        DBConnection dbConnection = DBConnection.getInstance();
        System.out.println(Thread.currentThread().getName() + " -> DBConnection Instance: " + System.identityHashCode(dbConnection));
    }
}