// 卯木 優大
// u316025
//課題1 (3) Ave

public class Ave
{
    public float ave(int x, int y) {
        
        Add add = new Add();
        Div div = new Div();
        
        //最初の要素 + 最後の要素 / 2 
        return (div.div(add.add(x , y), 2));

    }
}