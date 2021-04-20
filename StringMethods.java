public class StringMethods
{
    public static void main(String srgs[])
    {
        String name1="ekta";
        String name2="ekta";
        String name3=new String("ekta");
        String name4=new String("ekta").intern();

        System.out.println("name1-hascode-"+(name1.hashCode()));
        System.out.println("name2-hascode-"+(name2.hashCode()));
        System.out.println("name3-hascode-"+(name3.hashCode()));
        System.out.println("name4-hascode-"+(name4.hashCode()));

        System.out.println("(name1.equals(name2)) values--->"+(name1.equals(name2)));
        System.out.println("(name1.equals(name3)) values--->"+(name1.equals(name3)));

        System.out.println("(name1==name2)reference--->"+(name1==name2));
        System.out.println("(name1==name3)reference--->"+(name1==name3));
        System.out.println("(name1==name4)reference--->"+(name1==name4));


    }
    
}