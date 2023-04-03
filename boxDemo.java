class Box {
    int width; float height; double depth;}
class boxDemo{
    public static void main(String args[])
    {
        Box mybox= new Box();
        double vol;
        mybox.width = 10;
        mybox.height = 20 ;
        mybox.depth = 15.50;
        vol =mybox.width *mybox.height * mybox.depth;

        System.out.println("Volume is " + vol);
    }
}
