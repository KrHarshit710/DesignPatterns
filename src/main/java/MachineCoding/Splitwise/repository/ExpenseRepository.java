package MachineCoding.Splitwise.repository;

import MachineCoding.Splitwise.entity.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ExpenseRepository {
    private Map<String, Expense> expenses;

    @Autowired
    private UserRepository userRepository;

    public ExpenseRepository() {
        this.expenses = new HashMap<>();
    }

    public void addExpense(Expense expense){
        expenses.put(expense.getExpenseId(), expense);
        userRepository.addLendingRelationshipForEachUser(expense);
    }

    public void deleteExpense(Expense expense){

    }
}
