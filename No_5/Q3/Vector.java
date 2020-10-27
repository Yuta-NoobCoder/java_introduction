public class Vector
{
    private int x, y;
    private String name;

    public Vector(String myName, int myX, int myY)
    {
        name = myName;
        x = myX;
        y = myY;
    }

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