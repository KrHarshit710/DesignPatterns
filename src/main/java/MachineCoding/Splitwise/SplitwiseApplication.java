package MachineCoding.Splitwise;

import MachineCoding.Splitwise.entity.ExpenseType;
import MachineCoding.Splitwise.entity.User;
import MachineCoding.Splitwise.factory.ExpenseValidatorFactory;
import MachineCoding.Splitwise.repository.ExpenseRepository;
import MachineCoding.Splitwise.repository.UserRepository;
import MachineCoding.Splitwise.service.SplitwiseService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SplitwiseApplication {
    public static void main(String[] args) {
        SpringApplication.run(SplitwiseApplication.class, args);
        SplitwiseService splitwiseService = new SplitwiseService();
        User harshit = splitwiseService.addUser("Harshit", "harshit@gmail.com", "12345");
        User pawan = splitwiseService.addUser("Pawan", "pawan@gmail.com", "654321");
        User siman = splitwiseService.addUser("Siman", "siman@gmail.com", "12345");
        User aditya = splitwiseService.addUser("Aditya", "aditya@gmail.com", "321");

        splitwiseService.addExpense("Harshit", List.of("Harshit","Pawan","Siman"), ExpenseType.EQUAL, 100.0, null);
        splitwiseService.showLendingReport("Harshit");
    }
}
