public class Vector
{
    int x, y;
    String name;

    public void show()
    {
        System.out.println(name + " = (" + x + "," + y + ")");
    } 

    public void add(Vector v)
    {
        x += v.x;
        y += v.y;
    }

    public void sub(Vector v)
    {
        x -= v.x;
        y -= v.y;
    }

    public int product(Vector v)
    {
        return x * v.x + y * v.y;
    }
}