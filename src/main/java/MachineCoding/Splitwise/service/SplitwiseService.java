package MachineCoding.Splitwise.service;

import MachineCoding.Splitwise.entity.Expense;
import MachineCoding.Splitwise.entity.ExpenseType;
import MachineCoding.Splitwise.entity.User;
import MachineCoding.Splitwise.factory.ExpenseValidatorFactory;
import MachineCoding.Splitwise.repository.ExpenseRepository;
import MachineCoding.Splitwise.repository.UserRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class SplitwiseService {
    @Autowired
    private ExpenseValidatorFactory expenseValidatorFactory;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ExpenseRepository expenseRepository;

//    public SplitwiseService(ExpenseValidatorFactory expenseValidatorFactory, UserRepository userRepository, ExpenseRepository expenseRepository) {
//        this.expenseValidatorFactory = expenseValidatorFactory;
//        this.userRepository = userRepository;
//        this.expenseRepository = expenseRepository;
//    }

    public User addUser(String name, String emailId, String mobileNo){
        User user = User.builder()
                .name(name)
                .emailId(emailId)
                .mobileNo(mobileNo).build();

        return userRepository.addUser(user);
    }

    public void addExpense(@NonNull String paidBy, @NonNull List<String> splitBetween, @NonNull ExpenseType expenseType,
                           @NonNull Double amount, List<Double> splitShare){
        if(expenseValidatorFactory.getExpenseValidator(expenseType).validateExpense(amount, splitShare)){
            System.out.println("Enter values correctly !!!");
            return;
        }

        if(expenseType == ExpenseType.EQUAL)
            splitShare = spitAmountEqually(amount, splitBetween.size());

        Expense expense = Expense.builder()
                .expenseId(UUID.randomUUID().toString())
                .paidBy(paidBy)
                .participants(splitBetween)
                .expenseType(expenseType)
                .expenseShare(splitShare)
                .build( );
        expenseRepository.addExpense(expense);
    }

    public void showLendingReport(String name) {
        userRepository.showUserLendingHistory(name);
    }

    private List<Double> spitAmountEqually(@NonNull Double amount, int people) {
        Double equalShare = amount / people;
        List<Double> splitShare = new ArrayList<>();
        for(int i=0; i<people; i++){
            splitShare.add(equalShare);
        }
        if(equalShare * people != amount)
            splitShare.set(0, amount - (equalShare * (people - 1)));

        return splitShare;
    }
}
