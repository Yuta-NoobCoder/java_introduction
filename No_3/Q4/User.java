public class User
{
    public static void main(String[] args)
    {
        int product; 

        Vector v1 = new Vector();
        v1.name = "v1";
        v1.x = 3;
        v1.y = 4;
        v1.show();

        Vector v2 = new Vector();
        v2.name = "v2";
        v2.x = 5;
        v2.y = 2;
        v2.show();

        v1.add(v2); //加算
        v1.show();

        product = v1.product(v2); //内積
        v1.show();

        Vector v3 = new Vector();
        v3.name = "v3";
        v3.x = -3;
        v3.y = 4;
        v3.show();

        product = v1.product(v2);
        if(product == 0) System.out.println(v1.name + "と" + v2.name + "は直交しています");
        else System.out.println(v1.name + "と" + v2.name + "は直交していません");

        product = v1.product(v3);
        if(product == 0) System.out.println(v1.name + "と" + v3.name + "は直交しています");
        else System.out.println(v1.name + "と" + v3.name + "は直交していません");





    }
}