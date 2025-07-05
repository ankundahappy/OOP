/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lwigs.transactionrecord;




public class TransactionRecord {
    private String buyerTIN;
    private String sellerTIN;
    private double invoiceAmount;
    private String transactionTimestamp;

    public TransactionRecord(String buyerTIN, String sellerTIN, double invoiceAmount, String transactionTimestamp) {
        this.buyerTIN = buyerTIN;
        this.sellerTIN = sellerTIN;
        setInvoiceAmount(invoiceAmount);
        this.transactionTimestamp = transactionTimestamp;
    }

    public String getBuyerTIN() {
        return buyerTIN;
    }

    public void setBuyerTIN(String buyerTIN) {
        this.buyerTIN = buyerTIN;
    }

    public String getSellerTIN() {
        return sellerTIN;
    }

    public void setSellerTIN(String sellerTIN) {
        this.sellerTIN = sellerTIN;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(double invoiceAmount) {
        if (invoiceAmount > 0) {
            this.invoiceAmount = invoiceAmount;
        } else {
            throw new IllegalArgumentException("Invoice amount must be positive.");
        }
    }

    public String getTransactionTimestamp() {
        return transactionTimestamp;
    }

    public void setTransactionTimestamp(String transactionTimestamp) {
        this.transactionTimestamp = transactionTimestamp;
    }

    // 🔽 MAIN METHOD FOR TESTING
    public static void main(String[] args) {
        TransactionRecord tr = new TransactionRecord("TIN001", "TIN999", 150000.0, "2025-07-05T15:00:00Z");
        System.out.println("Buyer TIN: " + tr.getBuyerTIN());
        System.out.println("Seller TIN: " + tr.getSellerTIN());
        System.out.println("Amount: UGX " + tr.getInvoiceAmount());
        System.out.println("Timestamp: " + tr.getTransactionTimestamp());
    }
}


