package live.mukeshtechlab.adapter.phonePay.thirdPary;

public class ICICIBankAPI {
    public void createPayment(String to, String from, int amount){
        System.out.println("ICICI bank is transferring Payment from " + from + " to " + to + " and Amount: " + amount);
    }
}
