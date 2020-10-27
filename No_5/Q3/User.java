public class User
{
    public static void main(String[] args)
    {
        int product; 

        Vector v1 = new Vector("v1", 3, 4);
        v1.show();

        Vector v2 = new Vector("v2", 5, 2);
        v2.show();

        v1.add(v2); //加算
        v1.show();

        product = v1.product(v2); //内積
        System.out.println("内積は" + product + "です");
        v1.show();

        Vector v3 = new Vector("v3", -3, 4);
        v3.show();

        product = v1.product(v2);
        if(product == 0) System.out.println("直交しています");
        else System.out.println("直交していません");

        product = v1.product(v3);
        if(product == 0) System.out.println("直交しています");
        else System.out.println("直交していません");
    }
}