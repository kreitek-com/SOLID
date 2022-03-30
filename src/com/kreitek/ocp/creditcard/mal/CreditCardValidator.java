package com.kreitek.ocp.creditcard.mal;

import com.kreitek.ocp.creditcard.CreditCardType;

public class CreditCardValidator {

    public void validateCreditCard(CreditCardType creditCardType, String creditCardNumber) {
        switch (creditCardType) {
            case VISA:
                validateVisa(creditCardNumber);
                break;
            case MASTERCARD:
                validateMastercard(creditCardNumber);
                break;
            case AMERICAN_EXPRESS:
                validateAmericanExpress(creditCardNumber);
                break;
        }
    }

    private void validateAmericanExpress(String creditCardNumber) {
        // Valida AMERICAN EXPRESS
    }

    private void validateMastercard(String creditCardNumber) {
        // Valida MASTERCARD
    }

    private void validateVisa(String creditCardNumber) {
        // Valida VISA
    }
}
