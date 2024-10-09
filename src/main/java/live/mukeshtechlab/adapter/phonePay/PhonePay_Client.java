package live.mukeshtechlab.adapter.phonePay;

public class PhonePay_Client {
    public static void main(String[] args) {

        BankAPI bankAPI = new ICICIBankAdaptor();
        bankAPI.sendMoney("Mukesh", "Saumya", 1000);

    }
}
