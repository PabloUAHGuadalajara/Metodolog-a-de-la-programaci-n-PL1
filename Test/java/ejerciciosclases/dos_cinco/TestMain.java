package ejerciciosclases.dos_cinco;

public class TestMain {
    public static void main(String[] args) {
        // Test Customer class
        Customer c1 = new Customer(55,"Pepe",'m');
        System.out.println(c1); // Customer's toString()
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("gender is: " + c1.getGender());
        // Test Account class
        Account a1 = new Account(101, c1);
        System.out.println(a1);
        Account a2 = new Account(101, c1, 999.9);
        System.out.println(a2);
        a2.setBalance(888.8);
        System.out.println(a2);
        System.out.println("id is: " + a2.getId());
        System.out.println("customer is: " + a2.getCustomer()); // Customer's toString()
        System.out.println("balance is: " + a2.getBalance());
        System.out.println("customer's name is: " + a2.getCustomerName());
        a2.deposit(111.19);
        System.out.println(a2);
        a2.withdraw(1000);
        System.out.println(a2);
        a2.withdraw(888);
        System.out.println(a2);
    }
}