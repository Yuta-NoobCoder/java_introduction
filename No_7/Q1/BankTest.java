public class BankTest {
    public static void main(String[] args) {
        
        Bank bank = new Bank();
        int result;

        //--------------------------------openメソッドのテスト--------------------------------//
        //新規口座作成, この時点では重複なし
        System.out.println("・テストケース1");
        if(bank.open("test") == 0) System.out.println("口座名の重複なしで正常です");
        result = bank.showBalance("test");
        if(result == 0) System.out.println("残高0で正常です");
        else System.out.println("返り値" + result + "で異常です");
        
        //重複する口座を作成
        System.out.println("・テストケース2");
        result = bank.open("test");
        if(result == -7) System.out.println("重複する口座(-7)で正常です");
        else System.out.println("返り値" + result + "で異常です");
        
        result = bank.showBalance("test");
        if(result == 0) System.out.println("残高0で正常です");
        else System.out.println("返り値" + result + "で異常です");
        //--------------------------------closeメソッドのテスト--------------------------------//
        
        //正常な解約
        System.out.println("・テストケース3");
        result = bank.close("test");
        if(result == 0) System.out.println("解約成功で正常です");
        else System.out.println("返り値" + result + "で異常です");

        result = bank.showBalance("test");
        if(result == -7) System.out.println("存在しない口座(-7)で正常です");
        else System.out.println("返り値" + result + "で異常です");

        //存在しない口座を解約
        System.out.println("・テストケース4");
        result = bank.close("hoge");
        if(result == -7) System.out.println("存在しない口座(-7)で正常です");
        else System.out.println("返り値" + result + "で異常です");
            
        result = bank.showBalance("hoge");
        if(result == -7) System.out.println("存在しない口座(-7)で正常です");
        else System.out.println("返り値" + result + "で異常です");

        //口座を再生成
        result = bank.open("test");

        //残高のある口座を解約
        System.out.println("・テストケース5");
        bank.deposit("test", 1000);
        result = bank.close("test");
        if(result == -1) System.out.println("残高が0でない口座(-1)で正常です");
        else System.out.println("返り値" + result + "で異常です");

        result = bank.showBalance("test");
        if(result == 1000) System.out.println("残高1000で正常です");
        else System.out.println("返り値" + result + "で異常です");

        //--------------------------------depositメソッドのテスト--------------------------------//

        //正常な振り込み
        System.out.println("・テストケース6");
        result = bank.deposit("test", 100);
        if(result == 0) System.out.println("振り込み成功で正常です");
        else System.out.println("返り値" + result + "で異常です");

        result = bank.showBalance("test");
        if(result == 1100) System.out.println("残高1100で正常です");
        else System.out.println("返り値" + result + "で異常です");
        
        //存在しない口座へ振り込み
        System.out.println("・テストケース7");
        result = bank.deposit("hoge", 100);
        if(result == -7) System.out.println("存在しない口座(-7)で正常です");
        else System.out.println("返り値" + result + "で異常です");

        result = bank.showBalance("hoge");
        if(result == -7) System.out.println("存在しない口座(-7)で正常です");
        else System.out.println("返り値" + result + "で異常です");

        //マイナス額の振り込み
        System.out.println("・テストケース8");
        result = bank.deposit("test", -100);
        if(result == -3) System.out.println("マイナス額の振り込み(-3)で正常です");
        else System.out.println("返り値" + result + "で異常です");

        result = bank.showBalance("test");
        if(result == 1100) System.out.println("残高1100で正常です");
        else System.out.println("返り値" + result + "で異常です");

        //存在しない口座へのマイナス振り込み
        System.out.println("・テストケース9");
        result = bank.deposit("hoge", -100);
        if(result == -7) System.out.println("存在しない口座(-7)で正常です");
        else System.out.println("返り値" + result + "で異常です");

        result = bank.showBalance("hoge");
        if(result == -7) System.out.println("存在しない口座(-7)で正常です");
        else System.out.println("返り値" + result + "で異常です");

        //--------------------------------withdrawメソッドのテスト--------------------------------//

        //正常な引き出し
        System.out.println("・テストケース10");
        result = bank.withdraw("test", 100); //この時点での残高1000円
        if(result == 0) System.out.println("引き出し成功で正常です");
        else System.out.println("返り値" + result + "で異常です");

        result = bank.showBalance("test");
        if(result == 1000) System.out.println("残高1000で正常です");
        else System.out.println("返り値" + result + "で異常です");

        //存在しない口座から引き出し
        System.out.println("・テストケース11");
        result = bank.withdraw("hoge", 100);
        if(result == -7) System.out.println("存在しない口座(-7)で正常です");
        else System.out.println("返り値" + result + "で異常です");

        result = bank.showBalance("hoge");
        if(result == -7) System.out.println("存在しない口座(-7)で正常です");
        else System.out.println("返り値" + result + "で異常です");

        //マイナス額の引き出し
        System.out.println("・テストケース12");
        result = bank.withdraw("test", -100);
        if(result == -3) System.out.println("マイナス額の引き出し(-3)で正常です");
        else System.out.println("返り値" + result + "で異常です");

        result = bank.showBalance("test");
        if(result == 1000) System.out.println("残高1000で正常です");
        else System.out.println("返り値" + result + "で異常です");

        //残高以上の引き出し
        System.out.println("・テストケース13");
        result = bank.withdraw("test", 1001);
        if(result == -1) System.out.println("残高以上の引き出し(-1)で正常です");
        else System.out.println("返り値" + result + "で異常です");
        
        result = bank.showBalance("test");
        if(result == 1000) System.out.println("残高1000で正常です");
        else System.out.println("返り値" + result + "で異常です");

        //存在しない口座からマイナス額の引き出し
        System.out.println("・テストケース14");
        result = bank.withdraw("hoge", -100);
        if(result == -7) System.out.println("存在しない口座(-7)で正常です");
        else System.out.println("返り値" + result + "で異常です");

        result = bank.showBalance("hoge");
        if(result == -7) System.out.println("存在しない口座(-7)で正常です");
        else System.out.println("返り値" + result + "で異常です");
        
        //--------------------------------showBalanceメソッドのテスト--------------------------------//
        
        //正常な照会
        System.out.println("・テストケース15");
        result = bank.showBalance("test");
        if(result > 0) System.out.println("残高 : " + result + " で正常です");
        else System.out.println("返り値" + result + "で異常です"); 

        //存在しない口座を照会
        System.out.println("・テストケース16");
        result = bank.showBalance("hoge");
        if(result == -7) System.out.println("存在しない口座(-7)で正常です");
        else System.out.println("返り値" + result + "で異常です"); 
        
    }
}