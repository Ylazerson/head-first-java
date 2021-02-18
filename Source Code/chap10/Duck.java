class Duck
{

    private static int duckCount = 0;
    private int duckHeight = 0;

    Duck() 
    {
        duckCount++;
        duckHeight++;
    }
    
    public void setCount(int pCount)
    {
    	duckCount = pCount;
    }


    public void setHeight(int pHeight)
    {
    	duckHeight = pHeight;
    }

    public static void main( String [] args ) 
    {
        Duck x = new Duck();
        System.out.println( "x duckCount = "+x.duckCount);
        System.out.println( "x duckHeight = "+x.duckHeight);

        Duck y = new Duck();
        System.out.println( "y duckCount = "+y.duckCount);
        System.out.println( "y duckHeight = "+y.duckHeight);

        Duck z = new Duck();
        System.out.println( "z duckCount = "+z.duckCount);
        System.out.println( "z duckHeight = "+z.duckHeight);

        System.out.println( "Final duckCount");

        x.setCount(46);
        y.setCount(84);
        z.setCount(3);

        System.out.println( "x duckCount = "+x.duckCount);
        System.out.println( "y duckCount = "+y.duckCount);
        System.out.println( "z duckCount = "+z.duckCount);

        x.setHeight(4);
        y.setHeight(487);
        z.setHeight(9);
        
        System.out.println( "x duckHeight = "+x.duckHeight);
        System.out.println( "y duckHeight = "+y.duckHeight);
        System.out.println( "z duckHeight = "+z.duckHeight);

    }
}