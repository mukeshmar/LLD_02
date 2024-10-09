package live.mukeshtechlab.adapter.phonePay;

import live.mukeshtechlab.adapter.phonePay.thirdPary.ICICIBankAPI;

public class ICICIBankAdaptor implements BankAPI {
    private ICICIBankAPI iciciBankAPI = new ICICIBankAPI();

    @Override
    public void sendMoney(String from, String to, int amount) {
        iciciBankAPI.createPayment(to, from, amount);
    }
}
