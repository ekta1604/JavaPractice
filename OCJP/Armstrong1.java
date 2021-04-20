class Armstrong1{
    public static void main (String[] args) {
        int  c, sum = 0, count = 0;
        System.out.println("Armstrong numbers: ");
        for(int i = 11; i <=100000; i++)
        {
            int n = i;
            int temp = n;
            while(n > 0)
            {
                count++;
                n = n / 10;
            }
            n = temp;
            while(n > 0)
            {
                c = n % 10;
                n = n / 10;
               
                if(count == 2)
                {
                    sum = sum + (c*c);
                }
                else if(count == 3)
                {
                    sum = sum + (c*c*c);
                }
                else if(count == 4)
                {
                    sum = sum + (c*c*c*c);
                }
                else if(count == 5)
                {
                    sum = sum + (c*c*c*c*c);
                }
            }
            if(sum == temp)
            {
                System.out.print(sum + " ");
            }
            sum = 0;
            count = 0;
        }
    }
}