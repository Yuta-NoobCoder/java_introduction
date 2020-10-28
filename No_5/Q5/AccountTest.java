public class AccountTest
{
    public static void main(String[] args)
    {
        int result;

        Account myBank = new Account("Yuta");

        result = myBank.deposit(10000);
        if(result == 0) System.out.println("預金成功で正常です");
        else System.out.println("戻り値が" + result + "で誤りです");

        result = myBank.showBalance();
        if(result == 10000) System.out.println("残高10000円で正常です");
        else System.out.println("残高が" + result + "で誤りです");

        result = myBank.deposit(-1000);
        if(result == -3) System.out.println("不正な金額で正常です");
        else System.out.println("戻り値が" + result + "で誤りです");

        result = myBank.showBalance();
        if(result == 10000) System.out.println("残高10000円で正常です");
        else System.out.println("残高が" + result + "で誤りです");

        result = myBank.withdraw(50000);
        if(result == -1) System.out.println("残高不足で正常です");
        else System.out.println("戻り値が" + result + "で誤りです");

        result = myBank.showBalance();
        if(result == 10000) System.out.println("残高10000円で正常です");
        else System.out.println("残高が" + result + "で誤りです");

        result = myBank.withdraw(-5000);
        if(result == -3) System.out.println("不正な金額で正常です");
        else System.out.println("戻り値が" + result + "で誤りです");

        result = myBank.showBalance();
        if(result == 10000) System.out.println("残高10000円で正常です");
        else System.out.println("残高が" + result + "で誤りです");

        result = myBank.withdraw(5000);
        if(result == 0) System.out.println("引き出し成功で正常です");
        else System.out.println("戻り値が" + result + "で誤りです");

        result = myBank.showBalance();
        if(result == 5000) System.out.println("残高5000円で正常です");
        else System.out.println("残高が" + result + "で誤りです");
    }
}