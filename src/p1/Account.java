package p1;

public class Account {
    private final String id;
    private final String name;
    private int balance;

    public Account(String i, String n){
        id=i;
        name=n;
        balance=0;
    }
    public Account(String i, String n, int b){
        id=i;
        name=n;
        balance=b;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public void credit(int amount){
        balance+=amount;
    }
    public void debit(int amount){
        if (balance>=amount){
        balance-=amount;}
        else {System.out.println("Amount exceeded balance");
        }
    }
    public void transferTo(Account another, int amount) {
        if (balance >= amount) {
            this.balance-=amount;
            another.balance+=amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
    }
    public String toString(){
        return "Account[id="+id+",name="+name+",balance="+balance+"]";
    }


}
