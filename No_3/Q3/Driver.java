public class Driver
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        Car car2 = new Car();

        double distance;

        //ナンバー5555の車を初期化
        car1.num = 5555;
        car1.gas = 0;
        car1.kyori = 0;
        //ナンバー9999の車を初期化
        car2.num = 9999;
        car2.gas = 0;
        car2.kyori = 0;
        //給油
        car1.kyuyu(10.0);
        car2.kyuyu(8.0);
        //運転(car1)
        distance = 100.0;
        car1.drive(distance);
        if(car1.gas < 0) 
        {
            System.out.println("ガス欠で途中で止まりました");
            car1.gas = 0;
        } 
        else System.out.println(distance + "km走行できました");
        car1.show();

        //運転(car2)
        distance = 150.0;
        car2.drive(distance);
        if(car2.gas < 0)
        {
            System.out.println("ガス欠で途中で止まりました");
            car2.gas = 0.0;
        }
        else System.out.println(distance + "km走行できました");
        car2.show();
        //給油・運転(car2)
        car2.kyuyu(20.0);
        distance = 200.0;
        car2.drive(distance);
        if(car2.gas < 0) 
        {
            System.out.println("ガス欠で途中で止まりました");
            car2.gas = 0;
        }
        else System.out.println(distance + "km走行できました");        
        car2.show();
    }
}