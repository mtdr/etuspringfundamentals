package lab.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer implements Person {

    String name;

    boolean broke;

    @Override
    public void sayHello(Person person) {
    }
}
