
public class GoodDogTestDrive {
    public static void main(String[] args)
    {
        GoodDog one = new GoodDog();
        one.setSize(70);

        GoodDog two = new GoodDog();
        two.setSize(45);

        GoodDog three = new GoodDog();
        three.setSize(8);

        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());
        System.out.println("Dog three: " + three.getSize());
        
        one.bark();
        two.bark();
        three.bark();
    }
}


class GoodDog {
    private int size;
    public int getSize() {return size;}
    public void setSize(int pSize) {
        if (pSize > 9) {
            size = pSize;
           }
        }

    void bark() {
        if      (size > 60) {System.out.println("Wooof! Wooof!");} 
        else if (size > 40) {System.out.println("Ruff! Ruff!");} 
        else                {System.out.println("Yip! Yip!");}
                }
}


