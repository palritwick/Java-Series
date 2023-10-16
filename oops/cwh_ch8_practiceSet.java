/*
Create a class Employee with the following properties and methods:
Salary (property) (int)
getSalary (method returning int)
name (property) (String)
getName (method returning String)
setName (method changing name)
Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
Create a class Square with a method to initialize its side, calculating area, perimeter etc.
Create a class Rectangle & problem 3.
Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
Repeat problem 4 for a circle.*/

class Employee {
    int salary;
    String name;

    public int getSlary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
/* 
class cellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.print("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Call Rohan...");
    }
}
class square{
    int side;
    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }
}*/
public class cwh_ch8_practiceSet {
    
    
    public static void main(String args[]) {
        // problem 1
        
        Employee rit = new Employee();
        rit.salary = 35;
        rit.setName("Ritwick Pal");
        System.out.println(rit.salary);
        System.out.println(rit.getName());
        
/* 
        cellPhone realme = new cellPhone();
        realme.ring();
        realme.vibrate();
        realme.callFriend();
        

        square sq = new square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());*/
    }
}
