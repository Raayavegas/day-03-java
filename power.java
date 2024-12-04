class A 
{
    public static void main(String args[])
    {
        int a=8;
        if((a&(a-1))==0)
        {
            System.out.println("power");
        }
        else
        {
            System.out.println("not a power");
        }
    }
}