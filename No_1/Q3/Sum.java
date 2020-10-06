public class Sum
{
    public float sum(int x, int y) {
        Add add = new Add();
        Sub sub = new Sub();
        int sum = 0; //合計値

        if(x > y)
        {
            //値を入れ替え
            int tmp = y;
            y = x;
            x = tmp;
        }
            
        for(int i=x; i<=y; i = add.add(i, 1)) // i++ の代わりにAdd.addメソッドを使用
        {
            sum = add.add(sum, i);
        }
        return sum;
    }
}