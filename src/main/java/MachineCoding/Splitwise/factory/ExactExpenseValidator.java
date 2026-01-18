package MachineCoding.Splitwise.factory;

import java.util.List;

public class ExactExpenseValidator implements ExpenseValidator{
    @Override
    public boolean validateExpense(Double amount, List<Double> expenseShare) {
        return expenseShare.stream().reduce(Double::sum).orElse(0.0).equals(amount);
    }
}
