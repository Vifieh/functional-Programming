package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "87865");
        //normal java function
    greetCustomer(maria);
    greetCustomerV2(maria, true);

    //Consumer functional interface it takes one argument and returns nothing(like void)
    greetCustomerConsumer.accept(maria);

        //BiConsumer functional interface it takes two argument and returns nothing(like void)
        greetCustomerConsumerV2.accept(maria, false);
    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello "+ customer.customerName +
            " Thanks for registering phone number "+ customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello "+ customer.customerName +
                    " Thanks for registering phone number "+
                    (showPhoneNumber ? customer.customerPhoneNumber : "************"));


    static void greetCustomer(Customer customer) {
        System.out.println("Hello "+ customer.customerName +
                " Thanks for registering phone number "+ customer.customerPhoneNumber);
    }
    static void greetCustomerV2(Customer customer, Boolean showPhoneNumber) {
        System.out.println("Hello "+ customer.customerName +
                " Thanks for registering phone number "+
                (showPhoneNumber ? customer.customerPhoneNumber : "************"));

    }
    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
