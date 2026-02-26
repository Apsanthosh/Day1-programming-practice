// ShadowingDemo.java

//  Correct Version Using `this`
class Person {

    String name;
    int age;

    // Constructor with SAME parameter names as instance variables
    Person(String name, int age) {

        // `this.name` refers to instance variable
        // `name` refers to constructor parameter
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


//  Incorrect Version (Without using `this`)
class PersonWithoutThis {

    String name;
    int age;

    // Constructor WITHOUT `this`
    PersonWithoutThis(String name, int age) {

        // This only assigns parameter to itself!
        // Instance variables remain unchanged.
        name = name;
        age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


public class ShadowingDemo {

    public static void main(String[] args) {

        //  Using correct constructor
        Person p1 = new Person("Alice", 25);
        p1.display();

        //  Using constructor without `this`
        PersonWithoutThis p2 = new PersonWithoutThis("Bob", 30);
        p2.display();
    }
}