package OOPS;

public class Getter_setter {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setName("Krishan");
        b.setBranch("SBI Bansur");
        b.setAccountNumber(362492400);

        System.out.println(b.getAccountNumber());
        System.out.println(b.getBranch());
        System.out.println(b.getName());

        // We cant do
        //b.branch="Bansur";
       // System.out.println(b.branch); beacose branch is private for access this we use getter and setter method
    }
}
class Bank{
    private long account_number;
    private String name;
    private String branch;

    // setters
    void setName(String newName){
        this.name = newName;
    }

    void setBranch(String newBranch){
        this.branch = newBranch;
    }

    void setAccountNumber(int account){
        this.account_number=account;
    }

    // getters

    String getName(){
        return this.name;
    }
    String getBranch(){
        return this.branch;
    }
    long getAccountNumber(){
        return this.account_number;
    } 

}
