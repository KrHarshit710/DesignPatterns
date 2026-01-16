package Behavioral.StrategyPattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class CreditCardPayment implements PaymentStrategy{

    private String cardNumber;
    private String cvv;
    private Date dateOfExpiry;
    private String cardHolderName;

    @Override
    public void pay(int amount) {
        System.out.println("Payment done with Credit Card");
    }
}
