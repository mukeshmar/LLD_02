package live.mukeshtechlab.singleton.eager;

public class Client {
    public static void main(String[] args) {
        DBConnection db1 = DBConnection.getInstance();
        DBConnection db2 = DBConnection.getInstance();
        DBConnection db3 = DBConnection.getInstance();
        DBConnection db4 = DBConnection.getInstance();

        System.out.println(System.identityHashCode(db1));
        System.out.println(System.identityHashCode(db2));
        System.out.println(System.identityHashCode(db3));
        System.out.println(System.identityHashCode(db4));
    }
}
