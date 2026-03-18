// Bank Account

class Bank {
    
    private String name;
    private int accBalance = 0;
    private int amt = 0;

    public Bank(String name,long accNumber){
        this.name = name;
    }

    public void credit(int amt){
        if(amt>0){
            this.amt = amt;
            accBalance+=this.amt;
            System.out.println("Hello "+this.name+" ! Amount "+this.amt+"$ Credited Successfully in your account");
        }

        else{
            System.out.println("Invalid Amount !");
        }
    }

    public int getBalance(){
        return accBalance;
    }

    public void debit(int amt){
        if (accBalance>=amt){
            this.amt = amt;
            accBalance-=this.amt;
            System.out.println("Hello "+this.name+" , Amount debited successfully");
        }

        else{
            System.out.println("Amount limit exceed");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Creating Bank
        Bank user1 = new Bank("Manoj",19731299011L);
        user1.credit(7500);
        System.out.println(user1.getBalance());
        user1.debit(2100);
    }
}
