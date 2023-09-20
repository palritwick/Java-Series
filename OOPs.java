// import java.util.*;

class Pen {
    String color;
    String type;
}

class Student {
    String name;
    int age;

    // public void printInfo() {
    // System.out.println(this.name);
    // System.out.println(this.age);
    // }

    // Student(String name, int age) { -->parametrised constructor
    // this.name = name;
    // this.age = age;
    // }

    // Student() {
    // System.out.println("Constructor called");
    // }

    // Student(Student s2) {
    // this.name = s2.name;
    // this.age = s2.age;
    // }

    // polymorphism -> creating same name of method with diff types parameter or diff
    // types of return stmt.
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

// Inheritance --> Single Level, Multi-level,Hierarchial, Hybrid
class Shape {
    String color;

    public void printShape() {
        System.out.println("It's shape");
    }
}

class Triangle extends Shape {
    public void printTriangle(int b, int h) {
        System.out.println("It's a triangle that have an area");
    }
}
class Circle extends Shape{
    public void printArea(int r){
        System.out.println(3.14*r*r);
    }
}
class EquilateralTriangle extends Triangle {
    public void printEquiTriangle(int l, int h){
        System.out.println(1/2*l*h);
    }
}

// Access Modifiers - public, private, protective, default

//Abstraction 
abstract class Animal{
    abstract void walk();
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Duck extends Animal{
    public void walk(){
        System.out.println("Walks in 2 legs");
    }
}
public class OOPs {
    public static void main(String args[]) {
        // Pen p1 = new Pen();
        // p1.color = "blue";
        // p1.type = "ballpoint";

        // Pen p2 = new Pen();
        // p2.color = "red";

        // System.out.println(p1.color);
        // System.out.println(p2.color);

        // Student s1 = new Student(); // --> non parameterised constructor
        // s1.name = "Ram";
        // s1.age = 14;
        // s1.printInfo();

        // Student s2 = new Student("tony", 19); //--> parameterised constructor
        // s2.printInfo();

        // copy constructor
        // Student s2 = new Student(s1);
        // s2.printInfo();

        // Polymorphism
        // Student s1 = new Student();
        // s1.printInfo("Govind");
        // s1.printInfo(18);
        // s1.printInfo("Shayam",18);

        // Inheritance
        // Triangle t = new Triangle();

        // t.color= "red";
        // System.out.println(t.color);


        // ---------------------
        Horse horse = new Horse();
        horse.walk();
    }

}
