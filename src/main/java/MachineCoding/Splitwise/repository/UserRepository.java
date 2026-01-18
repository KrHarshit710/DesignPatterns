package MachineCoding.Splitwise.repository;

import MachineCoding.Splitwise.entity.Expense;
import MachineCoding.Splitwise.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {
    private Map<String, User> users;

    public UserRepository() {
        this.users = new HashMap<>();
    }

    public User addUser(User user){
        return users.put(user.getName(), user);
    }

    public User deleteUser(User user){
        return users.remove(user.getName());
    }

    public void addLendingRelationshipForEachUser(Expense expense){
        User paidBy = users.get(expense.getPaidBy());
        for(int i=1;i<expense.getParticipants().size();i++){
            Double currentAmountLent = paidBy.getLendingMap().getOrDefault(expense.getParticipants().get(i), 0.0);
            currentAmountLent += expense.getExpenseShare().get(i);
            paidBy.getLendingMap().put(expense.getParticipants().get(i), currentAmountLent);
        }

        for(int i=1;i<expense.getParticipants().size();i++){
            Double currentAmountLent = users.get(expense.getParticipants().get(i)).getLendingMap().getOrDefault(expense.getPaidBy(), 0.0);
            currentAmountLent -= expense.getExpenseShare().get(i);
            users.get(expense.getParticipants().get(i)).getLendingMap().put(expense.getExpenseId(), currentAmountLent);
        }
    }

    public void showUserLendingHistory(String name){
        for(Map.Entry<String,Double> entry : users.get(name).getLendingMap().entrySet()){
            if(entry.getValue() > 0){
                System.out.println(entry.getKey() + " owes "  + name + entry.getValue()  + " rupee ");
            } else {
                System.out.println(name + " owes "  + entry.getKey() + entry.getValue()  + " rupee ");
            }
        }
    }
}
