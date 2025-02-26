import com.teamrocket.Xpay;

public class XpayImpl implements Xpay{
    private String CreditCardNO;
    private String CustomerName;
    private String CardExpMonth;
    private String CardExpYear;
    private short CardCVVNo;
    private double Amount;


    @Override
    public String getCreditCardNo() {
        return this.CreditCardNO;
    }

    @Override
    public String getCustomerName() {
        return this.CustomerName;
    }

    @Override
    public String getCardExpMonth() {
        return this.CardExpMonth;
    }

    @Override
    public String getCardExpYear() {
        return this.CardExpYear;
    }

    @Override
    public short getCardCVVNo() {
        return this.CardCVVNo;
    }

    @Override
    public Double getAmount() {
        return this.Amount;
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.CreditCardNO = CreditCardNO;

    }

    @Override
    public void setCustomerName(String customerName) {
        this.CustomerName = CustomerName;

    }

    @Override
    public void setCardExpMonth(String cardExpMonth) {
        this.CardExpMonth = cardExpMonth;

    }

    @Override
    public void setCardExpYear(String cardExpYear) {
        this.CardExpYear = cardExpYear;
    }

    @Override
    public void setCardCVVNo(Short cardCVVNo) {
        this.CardCVVNo = cardCVVNo;

    }

    @Override
    public void setAmount(Double amount) {
        this.Amount = amount;
    }
}
