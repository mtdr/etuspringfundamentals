package lab.model;

public class ApuBar implements Bar {

    public Squishee sellSquishee(Customer customer) {
        if (customer.isBroke())
            throw new CustomerBrokenException();

        System.out.println("Here is your Squishee");
        return new Squishee("Usual Squishee");
    }
}