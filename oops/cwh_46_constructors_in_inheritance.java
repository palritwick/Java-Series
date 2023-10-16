class Base{
    /*int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
        System.out.println("The value of x is : " +x);    
    }
    public void printme(){
        System.out.println("I am a constructor");
    }*/

    Base(){
        System.out.println("This is the base class constructor\n");
    }
    Base(int a){
        System.out.println("This is base contructor with value of a "+a);
    }
}

class Derived extends Base{

    //this is the code of inheritance 
    /*public int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }*/

    Derived(){
        System.out.println("I am derived class contructor\n");
    }
}

public class cwh_46_constructors_in_inheritance {
    public static void main(String[] args) {
        /*Base b = new Base();
        b.setX(10);
        System.out.println(b.getX());
        
        Derived d = new Derived();
        d.setY(50);
        System.out.println(d.getY());*/

        Base b1 = new Base(5);
        Derived d1 = new Derived();

    }
}
