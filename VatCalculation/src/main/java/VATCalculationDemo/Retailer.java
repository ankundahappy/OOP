package VATCalculationDemo;

class Retailer extends vatcalulationdemo.TaxCategory{
        @Override
        public double calculateVAT(double amount) {
            return amount * 0.18;
        }
    }
