class array_table
{
    public static void main(String[] args)
    {
        System.out.println("Index\tValue");
        int array[]={32,12,18,54,2};

        for(int counter=0;counter<array.length;counter++){
            System.out.println(counter + "\t" + array[counter]);
        }
    }
}