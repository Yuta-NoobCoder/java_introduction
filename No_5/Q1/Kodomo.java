public class Kodomo
{
    private String name;
    private int age;

    public Kodomo(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void sayName()
    {
        System.out.println("私の名前は" + name + "です");
    }

    public void sayAge()
    {
        System.out.println("私は" + age + "才です");
    }
}