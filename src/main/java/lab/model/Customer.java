package lab.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer implements Person {
    String name;
    boolean broke;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void sayHello(Person person) {
    }
}
