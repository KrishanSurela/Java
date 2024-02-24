## Object => entities in the real world.

## Classes => group of these entities or blueprint of the object.

## Access Modifier =>

-   public
-   private
-   Protected
-   Default

## Getters & setters

-   Get : to return the value
-   Set : to modify the value
-   this : this keyword is used to refer to the current object.

## 1. Encapsulation => It is defined as the wrapping up of data and methods under a single unit.

-   it also implements data hiding.

## Constructor =>

### Constructor is a special method which is invoked automatically at the time of object creation.

-   Constructors have the same name as class or structure.
-   Constructor dont have a return type.(Not even void).
-   Constructors are only called once, at object creation.
-   Memory allocation happens when constructor is called.

## Types of Constructor =>

-   Non Parameterize Constructor
-   Parameterize Constructor
-   Copy Constructor

### Jab Ek hi class me 2 se jyada alag alag constructor ho to constructor overloading.

### Destructors=>

#### in c++ , there are special function those delete the memory of object. It called as destructors.

#### But in java, there is garbage collector.It automatically deletes those memory which is not using in program. like. variables,object,arrays string is not using in program. it deletes the memory which is consumed by these.

### 2. Inheritance =>

#### Inheritance is when properties and methods of base class are passed on to a derived class. called inheritance.

### Type of inheritenxe =>

#### Single level inheritance.(Base class => Derived class)

-   This is when a subclass inherits from only one superclass. For example, class B extends class A. This is also known as simple inheritance

#### Multi level Inheritance (Base class => Derived class => Derived Class)

-   This is when a subclass inherits from another subclass, which in turn inherits from another superclass. For example, class C extends class B, and class B extends class A. This creates a chain of inheritance

#### Hierarchial Inheritance (Base class=> Derived class,Derived class)

-   This is when multiple subclasses inherit from the same superclass. For example, class B and class C both extend class A. This creates a tree-like structure of inheritance

#### Hybrid Inheritance ()

-   This is when a subclass inherits from two or more classes, where one or more of them is a combination of different types of inheritance. For example, class D extends class B and class C, where class B and class C both extend class A. This creates a complex structure of inheritance

#### Multiple inheritance is not in java. indirectly implements kr skte hai interfaces se.

### 3. PolyMorphism =>

### The same entity(method,operator or object) can have multiple form or behaviors that perform differnet actions on its tyoe or context. in another words.

### We try to achieve the similiar things in mutiple forms.

#### Compiler Time Polymorphism (Static)

-   Method Overloading -> Multiple methods with the same name but different parameters or parameters types and different number of parameters in Methods. return type does not affect method overloading.

```java
class Clac{
    int sum(int a,int b){
        int sum = a+b;
        return sum;
    }
    float sum(float a,float b){
        float sum = a+b;
        return sum;
    }
    double sum(double a,double b){
        double sum = a+b;
        return sum;
    }
    int sum(int a,int b, int c){
        int sum = a+b+c;
        return sum;
    }
}
```

#### Run time Polymorphism (dynamic)

-   Method Overriding -> Parent and child classes both contain the same function with a different definition.

#### Rules for Java Method Overriding

-   The method must have the same name as in the parent class
-   The method must have the same parameter as in the parent class.
-   There must be an IS-A relationship (inheritance).

```java
class Bank {
  int getRateOfInterest() {
    return 0;
  }
}

class SBI extends Bank {
  @Override
  int getRateOfInterest() {
    return 8;
  }
}

class ICICI extends Bank {
  @Override
  int getRateOfInterest() {
    return 7;
  }
}

class AXIS extends Bank {
  @Override
  int getRateOfInterest() {
    return 9;
  }
}

class Main {
  public static void main(String[] args) {
    SBI s = new SBI();
    ICICI i = new ICICI();
    AXIS a = new AXIS();
    System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
    System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
    System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
  }
}

```

### Packages ->

#### Package is a group of similiar types of classes , interfces and sub-packages.

-   pending in details

### Abstraction => Hiding all the unnecessary details and showing only the important parts to the user.

### Abstract Classes

-   To make a classes to abstract we prefix abstract keyword to the classes.
-   Can not create an object of abstract class
-   can have abstract / non - abstract methods
-   Can have constructors

#### Abstract Method => Abstract methods are methods that are declared in an abstract class or an interface, but do not have a body or an implementation. They are meant to be overridden by the subclasses or the classes that implement the interface.

```java
// an abstract class
abstract class Animal {
  // an abstract method
  abstract void makeSound();
}

// a subclass that extends the abstract class
class Dog extends Animal {
  // overriding the abstract method
  @Override
  void makeSound() {
    System.out.println("Woof");
  }
}


```

### Interfaces

#### Interface is a blueprint of a class

-   multiple inheritance ko implement krne ke liye ham inheritance use krte hai
-   Total abstraction ko implement.

### Rule for interfaces =>

-   All methods are public, abstract & without implementation(method ko define nhi kr skte)
-   Used to achieve total abstraction
-   Variables in the interface are, public,static and final .

#### Note => When no access modifier is specified for a class, method, or data member – It is said to be having the default access modifier by default. The data members, classes, or methods that are not declared using any access modifiers i.e. having default access modifiers are accessible only within the same package

### Static Keyword =>

#### Static keyword in java is used to share the same variable or method of a given class.

-   We can declare static on to Properties ,Functions ,Blocks and Nested Classes.
-   sabse bda example main method bhi static hota hai aur ye program me ek baar hi likha jata hai esliye hm main function ko static krte hai.Means pure program me main method ki sirf ek hi copy create hoti hai
-   static mathods aur properties ko object ke alawa class name se bhi access and modify kr skte hai.

### Super Keyword =>

#### SUper keyword is used to refer immediate parent class object.

-   to access parent's properties
-   to access parent's functions
-   to access parent's constructor.

### Constructor Chaining =>

#### Constructor chaining is the process of calling one constructor from another constructor with respect to current object.

#### Constructor chaining can be done in two ways:

-   Within same class: It can be done using this() keyword for constructors in the same class
-   From base class: by using super() keyword to call the constructor from the base class.

### Why do we need constructor chaining?

#### This process is used when we want to perform multiple tasks in a single constructor rather than creating a code for each task in a single constructor we create a separate constructor for each task and make their chain which makes the program more readable.

```java
// Java program to illustrate Constructor Chaining
// within same class Using this() keyword
class Temp
{
	// default constructor 1
	// default constructor will call another constructor
	// using this keyword from same class
	Temp()
	{
		// calls constructor 2
		this(5);
		System.out.println("The Default constructor");
	}

	// parameterized constructor 2
	Temp(int x)
	{
		// calls constructor 3
		this(5, 15);
		System.out.println(x);
	}

	// parameterized constructor 3
	Temp(int x, int y)
	{
		System.out.println(x * y);
	}

	public static void main(String args[])
	{
		// invokes default constructor first
		new Temp();
	}
}
```

### if we declare a class private and protected we never can not access this class and this class to be unusable class.
 
                Private Default Protected Public

class ->          No      Yes     No       Yes
Nested class->    Yes     Yes     Yes      Yes
Constructor       Yes     Yes     Yes      Yes
Method            Yes     Yes     Yes      Yes
Field             Yes     Yes     Yes      Yes

### Q. Which of the following is a correct statement ?(both classes in same package)

```java
class Vehicle{

}
class Car extends Vehicle{

}

We Can assign the obj of child class to the parent class reference.

// This is always true in java
Vehicle v =new Car();
// here c is the parent class reference and new car() is poiting the object of child class

// Notice -> here reference variable v only can recognize the properties of Vehicle class.
```
