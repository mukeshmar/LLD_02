package live.mukeshtechlab.singleton.eager;

public class DBConnection {
    private static final DBConnection instance = new DBConnection();
    private String url;
    private String userName;
    private int password;

    // Private Constructor
    private DBConnection(){

    }
    // Method to get Instance
    public static DBConnection getInstance(){
        return instance;
    }
}
