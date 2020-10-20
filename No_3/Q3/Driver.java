public class Driver
{
    public static void main(String[] args)
    {
        //ナンバー5555の車を初期化
        Car car1 = new Car();
        car1.num = 5555;
        car1.gas = 0;
        car1.kyori = 0;
        //ナンバー9999の車を初期化
        Car car2 = new Car();
        car2.num = 9999;
        car2.gas = 0;
        car2.kyori = 0;
        //給油
        car1.kyuyu(10.0);
        car2.kyuyu(8.0);
        //運転(car1)
        if(car1.drive(100) == -1) 
        {
            System.out.println("ガス欠で途中で止まりました");
        } 
        else System.out.println("100km走行できました");
        car1.show();

        //運転(car2)
        if(car2.drive(150) == -1)
        {
            System.out.println("ガス欠で途中で止まりました");
        }
        else System.out.println("150km走行できました");
        car2.show();

        //給油・運転(car2)
        car2.kyuyu(20.0);
        
        if(car2.drive(200) == -1) 
        {
            System.out.println("ガス欠で途中で止まりました");
        }
        else System.out.println("200km走行できました");        
        car2.show();
    }
}