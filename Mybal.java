
public class Mybal {
    private int balance;


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getId(String password) {
        return password; // Changed return type to match the method signature
    }

    public void printClassName() {
        System.out.println(this.getClass().getName());
    }
}
  

