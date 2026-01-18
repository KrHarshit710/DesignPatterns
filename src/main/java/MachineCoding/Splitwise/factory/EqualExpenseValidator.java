package MachineCoding.Splitwise.factory;

import java.util.List;

public class EqualExpenseValidator implements ExpenseValidator{
    @Override
    public boolean validateExpense(Double amount, List<Double> expenseShare) {
        return true;
    }
}
