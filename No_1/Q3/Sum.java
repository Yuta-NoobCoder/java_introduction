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