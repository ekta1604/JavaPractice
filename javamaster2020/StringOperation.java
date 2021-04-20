public class StringOperation
{
    public static void main(String args[])
    {
        String name1="ekta";
        String name2="patel";
        String name3="ekta";

        System.out.println("Name1-"+name1+"-"+name1.hashCode());
        System.out.println("Name2-"+name2+"-"+name2.hashCode());
        System.out.println("Name3-"+name3+"-"+name3.hashCode());

        System.out.println("name1==name2-"+(name1==name2));
        System.out.println("name1==name3-"+(name1==name3));

    }
}
