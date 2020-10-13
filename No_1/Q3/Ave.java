// 卯木 優大
// u316025
//課題1 (3) Ave
//-------------使用環境---------------//
// Name : DESKTOP-KRHTRIO(自作PC)
//  CPU : Xeon E3-1285v3
//  RAM : 16GB
//  GPU : NVidia Geforce GTX 1060 6GB
// OS : Ubuntu 20.04 LTS on Windows 10(WSL)
// java : openjdk version "1.8.0_265"
// javac : javac 1.8.0_265

public class Ave
{
    public float ave(int x, int y) {
        
        Add add = new Add();
        Div div = new Div();
        
        //最初の要素 + 最後の要素 / 2 
        return (div.div(add.add(x , y), 2));

    }
}