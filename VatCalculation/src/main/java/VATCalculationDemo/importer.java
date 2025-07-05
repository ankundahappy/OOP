/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VATCalculationDemo;


class Importer extends vatcalulationdemo.TaxCategory {
        @Override
        public double calculateVAT(double amount) {
            return amount * 0.10;
        }
    }