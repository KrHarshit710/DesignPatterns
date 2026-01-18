package MachineCoding.Splitwise.factory;

import MachineCoding.Splitwise.entity.ExpenseType;
import org.springframework.stereotype.Component;

@Component
public class ExpenseValidatorFactory {

    public ExpenseValidator getExpenseValidator(ExpenseType expenseType){
        if(expenseType == ExpenseType.EQUAL)
            return new EqualExpenseValidator();
        else if (expenseType == ExpenseType.EXACT) {
            return new ExactExpenseValidator();
        } else if (expenseType == ExpenseType.PERCENT) {
            return new PercentageExpenseValidator();
        } else
            return null;
    }
}
