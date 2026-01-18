package MachineCoding.Splitwise.factory;

import java.util.List;

public class PercentageExpenseValidator implements ExpenseValidator{
    @Override
    public boolean validateExpense(Double amount, List<Double> expenseShare) {
        return expenseShare.stream().reduce(Double::sum).orElse(0.0).equals(100.0);
    }
}
