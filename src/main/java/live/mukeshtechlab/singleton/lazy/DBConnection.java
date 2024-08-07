package live.mukeshtechlab.singleton.lazy;

public class DBConnection {
    private static DBConnection instance;
    private String url; 
    private String userName; 
    private String password;
    
    private DBConnection(){
        
    }
    
    public static DBConnection getInstance(){
        if(instance == null){
            instance = new DBConnection(); 
        }
        return instance;
    }
    
}
