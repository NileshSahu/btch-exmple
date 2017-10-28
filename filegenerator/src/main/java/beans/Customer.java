package beans;

/**
 * Created by Nilesh Sahu on 10/28/2017.
 */
public class Customer {

    private String name = "";
    private Long id;
    private Long accountId;
    private String address = "";
    private String city = "";
    private String pin = "";
    private String bankName = "";
    private String bankCode ="";
    private String accoutType = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getAccoutType() {
        return accoutType;
    }

    public void setAccoutType(String accoutType) {
        this.accoutType = accoutType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("%25s",name) +
                String.format("%25d",id) +
                String.format("%25d",accountId) +
                String.format("%25s",address) +
                String.format("%25s",city) +
                String.format("%25s",pin) +
                String.format("%25s",bankName) +
                String.format("%25s",bankCode) +
                String.format("%25s",accoutType);
    }

    private String description;


}
