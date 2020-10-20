public class Oya2
{
    public static void main(String[] args)
    {
        Kodomo ichiro = new Kodomo();
        Kodomo jiro = new Kodomo();
        ichiro.name = "一郎";
        ichiro.age = 10;
        jiro.name = "二郎";
        jiro.age = 8;
        ichiro.sayName();
        ichiro.sayAge();
        jiro.sayName();
        jiro.sayAge();
    }
}