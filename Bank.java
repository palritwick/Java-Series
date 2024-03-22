// package bank;
class Account{
    public String name;
    protected String email;
    private String password;

    // getter & setter function is used to access private modifiers
    public String getPassword(){
        return this.password;
    } 
    public void setPassword(String pass){
        this.password = pass;
    }
}
public class Bank {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.name = "Apna College";
        acc1.email = "apnacollege@gmail.com";
        // acc1.password = "apna123";
        // private variable not accessable by anyother class 
        acc1.setPassword("apna123");
        System.out.println(acc1.getPassword());

    }
}
