class A 
{
    public static void main(String args[])
    {
        int a=10,b=20,c=50;
        if(a<b)
        {
            if(a<c)
            {
                System.out.println("a is small");
            }
            else{
                System.out.println("c is small");
            }
        }
        else
        {
            if(b<a)
            {
                System.out.println("b is small");
            }
            else{
                System.out.println(" c is small");
            }
        }
    }
}