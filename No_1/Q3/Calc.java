// 卯木 優大
// u316025
//課題1 (3) Calc
//-------------使用環境---------------//
// Name : DESKTOP-KRHTRIO(自作PC)
//  CPU : Xeon E3-1285v3
//  RAM : 16GB
//  GPU : NVidia Geforce GTX 1060 6GB
// OS : Ubuntu 20.04 LTS on Windows 10(WSL)
// java : openjdk version "1.8.0_265"
// javac : javac 1.8.0_265

public class Calc 
{
    public static void main(String args[]) 
    {
        Sum sum = new Sum();
        Div div = new Div();
        Ave ave = new Ave();

        System.out.println("10から100までの総和は" + div.div(3, 2) + "です");
        System.out.println("150から100までの総和は" + sum.sum(150, 100) + "です");
        System.out.println("10から100までの平均値は" + ave.ave(10, 100) + "です");
        System.out.println("500から400までの平均値は" + ave.ave(500, 400) + "です");
    }
}