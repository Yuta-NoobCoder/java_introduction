public class Car
{
    int num;
    double gas;
    double kyori;

    public void show()
    {
        System.out.println("\n----車の情報を表示します----");
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("ガソリン残量は" + gas + "Lです。");
        System.out.println("走行距離は" + kyori + "kmです。");
        System.out.println("----------------------------\n");
    }

    public void kyuyu(double amount)
    {
        gas += amount;
    }

    public void drive(double distance)
    {
        gas -= distance / 15.0; //1Lで15km走行可能
        kyori += distance;
    }
}