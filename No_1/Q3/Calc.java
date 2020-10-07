// 卯木 優大
// u316025
//課題1 (3) Calc

public class Calc 
{
    public static void main(String args[]) 
    {
        Sum sum = new Sum();
        Ave ave = new Ave();

        System.out.println("10から100までの総和は" + sum.sum(10, 100) + "です");
        System.out.println("150から100までの総和は" + sum.sum(150, 100) + "です");
        System.out.println("10から100までの平均値は" + ave.ave(10, 100) + "です");
        System.out.println("500から400までの平均値は" + ave.ave(500, 400) + "です");
    }
}