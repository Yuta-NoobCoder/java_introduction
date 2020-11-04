import java.util.Hashtable;

public class MyBank {
  public static void main(String[] args) {

    Hashtable<String, Account> bank = new Hashtable<String, Account>();

    //口座を生成
    bank.put("一郎", new Account("一郎"));
    bank.put("三郎", new Account("三郎"));
    bank.put("太郎", new Account("太郎"));
    bank.put("花子", new Account("花子"));

    //預金処理
    (bank.get("三郎")).deposit(1000);
    (bank.get("花子")).deposit(5000);
    (bank.get("三郎")).deposit(3000);
    (bank.get("花子")).deposit(2000);

    System.out.println("一郎の口座の残高：" + (bank.get("一郎")).showBalance());
    System.out.println("三郎の口座の残高：" + (bank.get("三郎")).showBalance());
    System.out.println("太郎の口座の残高：" + (bank.get("太郎")).showBalance());
    System.out.println("花子の口座の残高：" + (bank.get("花子")).showBalance());
  }
}