package com.kreitek.ocp.creditcard.bien;

import com.kreitek.ocp.creditcard.CreditCardType;

import java.util.HashMap;
import java.util.Map;

public class CreditCardValidator {

    private final Map<CreditCardType, CreditCardNumberValidator> validators;

    public CreditCardValidator(Map<CreditCardType, CreditCardNumberValidator> validators) {
        this.validators = validators;
    }

    public void validateCreditCard(CreditCardType creditCardType, String creditCardNumber) {
        CreditCardNumberValidator validator = validators.get(creditCardType);
        validator.validate(creditCardNumber);
    }

}