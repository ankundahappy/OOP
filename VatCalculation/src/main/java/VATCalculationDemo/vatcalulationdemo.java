
package VATCalculationDemo;


public class vatcalulationdemo {

    
    static class TaxCategory {
        public double calculateVAT(double amount) {
            return 0.0; 
        }
    }

    public static void main(String[] args) {
    
        TaxCategory[] taxpayers = {
            new Retailer(),
            new Wholesaler(),
            new Importer()
        };

        
        double[] amounts = {100000.0, 200000.0, 300000.0};

    
        for (int i = 0; i < taxpayers.length; i++) {
            double vat = taxpayers[i].calculateVAT(amounts[i]);
            System.out.println("Transaction Amount: " + amounts[i] +
                               " | VAT: " + vat);
        }
    }
}
