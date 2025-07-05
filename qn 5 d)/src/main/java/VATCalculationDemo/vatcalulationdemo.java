
package VATCalculationDemo;


public class vatcalulationdemo {

    // Base class
    static class TaxCategory {
        public double calculateVAT(double amount) {
            return 0.0; // Default logic
        }
    }

    // Retailer subclass
    static class Retailer extends TaxCategory {
        @Override
        public double calculateVAT(double amount) {
            return amount * 0.18; // 18% VAT
        }
    }

    // Wholesaler subclass
    static class Wholesaler extends TaxCategory {
        @Override
        public double calculateVAT(double amount) {
            return amount * 0.15; // 15% VAT
        }
    }

    // Importer subclass
    static class Importer extends TaxCategory {
        @Override
        public double calculateVAT(double amount) {
            return amount * 0.10; // 10% VAT
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an array of TaxCategory objects
        TaxCategory[] taxpayers = {
            new Retailer(),
            new Wholesaler(),
            new Importer()
        };

        // Corresponding transaction amounts
        double[] amounts = {100000.0, 200000.0, 300000.0};

        // Loop to calculate and display VAT
        for (int i = 0; i < taxpayers.length; i++) {
            double vat = taxpayers[i].calculateVAT(amounts[i]);
            System.out.println("Transaction Amount: " + amounts[i] +
                               " | VAT: " + vat);
        }
    }
}
