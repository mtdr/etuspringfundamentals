package lab.model;

import org.springframework.stereotype.Component;

@Component("bar")
public class ApuBar implements Bar {

    public Squishee sellSquishee(Customer customer) {
        if (customer.isBroke())
            throw new CustomerBrokenException();

        System.out.println("Here is your Squishee");
        return new Squishee("Usual Squishee");
    }
}