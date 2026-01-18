package MachineCoding.Splitwise.entity;

import lombok.*;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
public class User {
    private String name;
    private String emailId;
    private String mobileNo;
    private Map<String, Double> lendingMap;
}
