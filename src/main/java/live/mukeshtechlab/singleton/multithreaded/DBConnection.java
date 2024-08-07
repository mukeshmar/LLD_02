package live.mukeshtechlab.singleton.multithreaded;

public class DBConnection {
    private static DBConnection instance;
    private String url; 
    private String userName; 
    private String password;
    
    private DBConnection(){

    }
    
    public static DBConnection getInstance(){
        if(instance == null){
            synchronized (DBConnection.class){
                if(instance == null) {
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }
    
}
