package MachineCoding.Splitwise.factory;

import java.util.List;

public interface ExpenseValidator {
    boolean validateExpense(Double amount, List<Double> expenseShare);
}
