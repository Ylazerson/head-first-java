
import java.util.ArrayList;

public class TestBoat
{
    public static void main(String[] args) {

        ArrayList<Boat> boatList = new ArrayList<Boat>();
        
        int length = 4;

        // -- -- -- -- -- -- -- -- -- -- -- --
        Boat boat1 = new Boat(length, "Honda");
        Boat boat2 = new Boat();
        Boat boat3 = new Boat(8, "Jack Dangelwanger", "Jeep");
                
        // -- -- -- -- -- -- -- -- -- -- -- --
        boatList.add(boat1);
        boatList.add(boat2);
        boatList.add(boat3);
        // -- -- -- -- -- -- -- -- -- -- -- --

        for (Boat bBoat : boatList) 
        {
            bBoat.move();
            System.out.println("My Length is "+bBoat.getLength());
            System.out.println("My Name is "+bBoat.getName());
            System.out.println("My Engine is "+bBoat.getEngine());
        } 

    }
}

class Boat {


    // ---------- Instance Variables ------------
    private String name;

    private int length;

    private String engine;

    // ---------- Constructors ------------
    public Boat(int pLength, String pName, String engineBrand) 
    {
        this(engineBrand);
        length = pLength;
        name = pName;
    }

    public Boat(int pLength, String engineBrand) 
    {
        this(engineBrand);
        length = pLength;
        name = "John Doe";
    }

    public Boat() 
    {
        this("Ford");
        length = 2;
        name = "John Doe";
    }

    public Boat(String pEngine) 
    {
        engine = pEngine;
        // do some really coplicated code
    }

    // ---------- Methods ------------
    public void setLength(int len) 
    {
        length = len;
    }
    
    public int getLength() 
    {
        return length;
    }

    public String getEngine() 
    {
        return engine;
    }
    
    public void setName(String pName) 
    {
        name = pName;
    }
    
    public String getName() 
    {
        return name;
    }

    public void move() 
    {
        System.out.println("Object "+this.toString()+" which is from "+this.getClass()+" goes: drift ");
    }
}




