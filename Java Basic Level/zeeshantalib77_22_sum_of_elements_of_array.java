class sum_array
{
    public static void main(String[] args)
    {
        int array[]={1,2,3,4,5};
        int sum=0;
        for(int counter=0;counter<array.length;counter++)
        {
            sum+=array[counter];
        }
        System.out.println("The sum of theze numbers is " +sum);
    }
}