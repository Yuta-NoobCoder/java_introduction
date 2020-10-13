// 卯木 優大
// u316025
//課題1 (3) Sum
//-------------使用環境---------------//
// Name : DESKTOP-KRHTRIO(自作PC)
//  CPU : Xeon E3-1285v3
//  RAM : 16GB
//  GPU : NVidia Geforce GTX 1060 6GB
// OS : Ubuntu 20.04 LTS on Windows 10(WSL)
// java : openjdk version "1.8.0_265"
// javac : javac 1.8.0_265

public class Sum
{
    public float sum(int x, int y) {
        Add add = new Add();
        Sub sub = new Sub();
        Mul mul = new Mul();
        Div div = new Div();
        int n; //数列の長さ
        
        if(x <= y) 
            n = add.add(sub.sub(y ,x), 1); // n = y - x + 1
        else 
            n = add.add(sub.sub(x ,y), 1); // n = x - y + 1
        
        return div.div(mul.mul(n, add.add(x, y)), 2); // 数列の和 Sn = n(x + y) / 2
    }
}