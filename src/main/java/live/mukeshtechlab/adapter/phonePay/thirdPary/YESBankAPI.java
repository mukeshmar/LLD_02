package live.mukeshtechlab.adapter.phonePay.thirdPary;

public class YESBankAPI {
    public void makePayment(int paymentAmount, String from , String to){
        System.out.println("Yes bank is transferring Payment from " + from + " to " + to + " and Amount: " + paymentAmount);
    }
}
