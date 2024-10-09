package live.mukeshtechlab.adapter.phonePay;

import live.mukeshtechlab.adapter.phonePay.thirdPary.YESBankAPI;

public class YESBankAdaptor implements BankAPI {
    private YESBankAPI yesBankAPI = new YESBankAPI();

    @Override
    public void sendMoney(String from, String to, int amount) {
        yesBankAPI.makePayment(amount, from, to);
    }
}
