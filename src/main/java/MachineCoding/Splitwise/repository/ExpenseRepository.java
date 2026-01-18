package MachineCoding.Splitwise.repository;

import MachineCoding.Splitwise.entity.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ExpenseRepository {
    private Map<String, Expense> expenses;


    private UserRepository userRepository;

    @Autowired
    public ExpenseRepository(UserRepository userRepository) {
        this.expenses = new HashMap<>();
        this.userRepository = userRepository;
    }

    public void addExpense(Expense expense){
        expenses.put(expense.getExpenseId(), expense);
        userRepository.addLendingRelationshipForEachUser(expense);
    }

    public void deleteExpense(Expense expense){

    }
}
