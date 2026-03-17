package es.uah.matcomp.mp.e1.ejerciciosclases.dos_cinco;

public class Account {
    private final int id;
    private final Customer customer;
    private double balance;

    public Account(int id,Customer customer,double balance){
        this.id=id;
        this.customer=customer;
        this.balance=balance;
    }
    public Account(int id,Customer customer){
        this.id=id;
        this.customer=customer;
        this.balance=0;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString(){
        return customer.toString()+" balance=$"+String.format("%.2f", balance);
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public void deposit(double amount){
        this.balance+=amount;
    }
    public void withdraw(double amount){
        if (balance >= amount){
            balance-=amount;
        }
        else {
            System.out.println("amount withdrawn exceeds the current balance");
        }
    }
}
