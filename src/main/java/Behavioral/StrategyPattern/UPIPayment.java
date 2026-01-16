package Behavioral.StrategyPattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@AllArgsConstructor
@Slf4j
public class UPIPayment implements PaymentStrategy {
    private String upiId;
    private String pin;
    @Override
    public void pay(int amount) {
        log.info("{} Rupee Paid , UPI {} ", amount, upiId);
    }
}
