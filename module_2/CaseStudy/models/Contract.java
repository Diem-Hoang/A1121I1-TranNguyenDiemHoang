package CaseStudy.models;

public class Contract {
    private String contractNumber;
    private String idBooking;
    private int deposit;
    private int totalPaymentAmount;
    private String idCustomer;

    public Contract(){

    }
    public Contract(String contractNumber, String idBooking, int deposit, int totalPaymentAmount, String idCustomer){
        this.contractNumber = contractNumber;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.totalPaymentAmount = totalPaymentAmount;
        this.idCustomer =idCustomer;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(int totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }
}
