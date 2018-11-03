class inheritance_concept
{
    public static void main(String[] args)
    {
        zeeshan17 zeeshan17_object = new zeeshan17();
        drink drink_object = new drink();
        
        zeeshan17_object.eat();
        drink_object.eat();   
    }
}
class zeeshan17 extends food
{
    public void eat()
    {
        System.out.println("I am the new method of zeeshan17");        
    }
}
class drink extends food
{

}
class food 
{
    public void eat()
    {
        System.out.println("I am the eat methods");        
    }
}