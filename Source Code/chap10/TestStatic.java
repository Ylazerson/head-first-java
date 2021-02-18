class TestStatic 
{

    // static initializer block: gets run only once the first time its loaded
    static 
    {
        System.out.println( "TestStatic.static");
    }
    
    // constructor - gets run everytime an object is created
    TestStatic() 
    {
        System.out.println( "TestStatic.TestStatic()");
    }
    
    public static void main( String [] args ) 
    {
        System.out.println( "TestStatic.main");
        TestStatic x = new TestStatic();
        TestStatic y = new TestStatic();
        TestStatic z = new TestStatic();
    }
}