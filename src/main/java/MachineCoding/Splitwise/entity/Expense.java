package MachineCoding.Splitwise.entity;


import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
public class Expense {
    private String expenseId;
    private String paidBy;
    private List<String> participants;
    private List<Double> expenseShare;
    private Double amount;
    private ExpenseType expenseType;

}
