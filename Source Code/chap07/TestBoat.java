
import java.util.ArrayList;

public class TestBoat
{
    public static void main(String[] args) {

        ArrayList<Boat> boatList = new ArrayList<Boat>();
        
        // -- -- -- -- -- -- -- -- -- -- -- --
        Boat boat = new Boat();
        Sailboat sailBoat = new Sailboat();
        Rowboat rowBoat = new Rowboat();
                
        // -- -- -- -- -- -- -- -- -- -- -- --
        boatList.add(boat);
        boatList.add(sailBoat);
        boatList.add(rowBoat);

        // -- -- -- -- -- -- -- -- -- -- -- --

        for (Boat bBoat : boatList) 
        {
            bBoat.move();
        } 

    }
}

class Boat {


    public Boat(int pLength) 
    {
        length = pLength;
    }

    private int length;

    public void setLength(int len) 
    {
        length = len;
    }
    
    public int getLength() 
    {
        return length;
    }
    
    public void move() 
    {
        System.out.println("Object "+this.toString()+" which is from "+this.getClass()+" goes: drift ");
    }
}

class Rowboat extends Boat {
    public void rowTheBoat() {
        System.out.println("Object "+this.toString()+" which is from "+this.getClass()+" goes: stroke natasha");
    }
}


class Sailboat extends Boat {
    
    // Override
    public void move() {
        System.out.println("Object "+this.toString()+" which is from "+this.getClass()+" goes: hoist sail ");
    }

    // Overload
    public void move(int pSpeed) {
        System.out.println("I'm going at speed "+pSpeed);
    }

    public String toString()
    {
        String x = "Hi i'm a Sailboat";

         System.out.println(x);
         return x;

    }
}



