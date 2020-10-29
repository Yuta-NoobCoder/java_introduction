import java.util.Hashtable;

public class MyBank {
  public static void main(String[] args) {
    Hashtable<String, Account> bank = new Hashtable<String, Account>();
    bank.put("一郎", new Account("一郎"));
    bank.put("三郎", new Account("三郎"));
    bank.put("太郎", new Account("太郎"));
    bank.put("花子", new Account("花子"));
    Account account = bank.get("三郎");
    account.deposit(1000);
    account = bank.get("花子");
    account.deposit(5000);
    account = bank.get("三郎");
    account.deposit(3000);
    account = bank.get("花子");
    account.deposit(2000);

    account = bank.get("一郎");
    System.out.println("一郎の口座の残高：" + account.showBalance());
    account = bank.get("三郎");
    System.out.println("三郎の口座の残高：" + account.showBalance());
    account = bank.get("太郎");
    System.out.println("太郎の口座の残高：" + account.showBalance());
    account = bank.get("花子");
    System.out.println("花子の口座の残高：" + account.showBalance());
  }
}