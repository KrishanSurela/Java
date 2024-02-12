# Java

## Variable in Java

### Variables are containers in java that have some information.

## DataTypes in Java ->

### Primitive Datatype ->

-   These are the most basic data types available in java. These datatypes are already defined in java.

#### These are 8 type of premitive datatypes ->

-   Boolean
-   byte
-   char
-   int
-   short
-   long
-   float
-   double

### Non-Primitive ->

#### These include Classes, Interfaces, and Arrays. Non-primitive types are created by the programmer and is not defined by Java (except for String).

### Comments => // or /\* \*/

### Input in Java

#### For take a input from user . we make a object of scanner class

```java
import java.util.*; // package
Scanner sc = new Scanner(System.in);
String input = sc.next();
```

-   next
-   nextLine
-   nextInt
-   nextByte
-   nextFloat
-   nextDouble
-   nextBoolean
-   nextshort
-   nextLong

```java
    Scanner scanner = new Scanner(System.in);

    String input = scanner.next();//Krishan Surela

    System.out.println("My Name is :"+input);
    My Name is :Krishan

    String input2 = scanner.nextLine(); //Krishan Surela
    System.out.println("My Name is :"+input2);// My Name is :Krishan Surela

    int num1 = scanner.nextInt();
    System.out.println(num1);

    float price = scanner.nextFloat();
    System.out.println(price);

    Boolean is = scanner.nextBoolean();//true
    System.out.println(is);//true
```

### Type Conversion =>(widening or implicit)

#### Conversion happens when:

-   type compatible (int <-> float, int <- X -> boolean)
-   destination type > source type

-   byte -> short -> int -> float -> long -> double

#### Type conversion in Java is automatic and occurs when assigning a value of a smaller range type to a variable of a larger range type.

-   It happens implicitly during assignments, and the compiler handles it.
-   For example, assigning an int value to a long variable or a float value to a double variable involves type conversion.
-   example

```java
int a = 25;
long b=a;
System.out.print(b); //25

long a = 25;
int b=a;
System.out.print(b); //incompatible types :possible lossy conversion from long to int

```

### Type Casting -> Narrowing or Explicit

#### Type casting, on the other hand, is explicit and is used to convert a value from one type to another.

-   It allows you to convert a value from a larger range type to a smaller range type.
-   Type casting is done manually by the programmer using casting operators.
-   If you don’t perform casting when needed, the compiler reports a compile-time error.
-   There are two types of type casting:
    Widening Type Casting (Implicit Conversion):
    Converting a lower data type into a higher one.
-   It’s safe because there’s no chance of data loss.
-   Examples: int to long, long to float.
    Automatic and done by the compiler.

```java
        float b=6.56f;
        int a =(int) b ;
```

## Type Promotion ->

### Java automatically promotes each byte , short , or char operand to int when evaluating an expression.

### if one operand is long , float or double the whole expression is promoted to long, float , or double respectively.

-   Example ->

```java
char a ='a';
char b ='b';

System.out.println(b-a);//1
System.out.println(a);//Type Promotion is only apply for expression. //a

char c = b-a; //can not convert int to char error

int c = b-a;// currect

byte b =5;
b = b*2; // can not convert int to byte


byte b =10;
b =(byte)(b*2) // convert int to byte with type casting

```

```java
int $ = 70;
System.out.println($);
//No, the statement will not give any error.
//Names of variables are called identifiers in Java. Identifier rule says, identifiers can start with any alphabet or underscore (“_”) or dollar (“$”).
// According to the rule the given variable name is a valid identifier.
```

### Operators in Java

#### Operaters are Symbols that tell compiler to perform some operation.

```java
sum = a+b;

here a and b are operands and + is operator.
```

### Types of operators in java

-   Arithmetic Operators (Binary/Unary)
-   Relational Operators
-   Logical Operators
-   Bitwise operators
-   Assignment Operators

#### ArithMetics Operators

-   Binary (+ , - , \* , / , %) 2 Operands Required

-   Unary (++ , -- ) 1 operand required

#### Relational Operators (return type-> boolean)

-   == (equal)
-   != (Not Equal)
-   > ( Greater than)
-   < (lesser than)
-   > = (greater than equal)
-   <= (lesser than equal)

#### Logical Operators

-   && (Logical AND)
-   || (Logical OR)
-   !

#### Assignment Operator ->

-   =
-   += (ShortHand Operator)
-   -= (ShortHand Operator)
-   \*= (ShortHand Operator)
-   /= (ShortHand Operator)

```java
int i = 9
i= i+5;

int i = 9;
i+=5;

```

#### Conditional Statements

-   if
-   else if
-   ternary operator ( condition ? true:false)
-   switch

### Loops

#### loops are used to execute a set of instructions repeatedly as long as a specified condition remains true.

#### There are three types of loops in Java

-   while Loop ->

```java
int i=0; // intialization
while (i<=10) { // condition
    System.out.println(i); // increment/decrement
    i++;
}
```

-   for Loop ->

```java

//for(intialization;condition;increment/decrement)
for (int i=0; i<=10; i++) {
    System.out.println(i);
}

```

-   do while

```java
initialization
do{
    increment/decrement
}while(condition)
```

#### break -> to exit the loop

```java
for(int i=1;i<=5;i++){
    if(i==3){
        break;
    }
    System.out.println(i);
}
System.out.print("I m out of the loop");
```

## Question ->

### Keep entering the number till user enters a multiple of 10.

```java

do{
    System.out.println("Enter Your Number :");
    int m = sc.nextInt();
    if(m%10==0){
        System.out.println("This is right Number : "+m);
        break;
    }

    System.out.println("Enter another number which is divisible by 10 :");
    System.out.println("Your Given Number is "+m);
}while(true);

```

### Continue ->

#### Display all numbers enterd by user except multiples of 10.

```java

    do{
        System.out.println("Enter your number :");
        int o = sc.nextInt();

        if(n%10==0){
            continue;
        }
        System.out.println("Nunber was : "+o);
    }while(true);
```

### Check Number Prime or not

```java
System.out.println("Enter Your Number :");

        int n = sc.nextInt();
        boolean isPrime=true;
        if(n==2){
            System.out.println("Given Number is Prime");
        }
        else{
            for(int i=2;i<=(n-1)/2;i++){
                if(n%i==0){
                    isPrime = false;
                }
            }

            if(isPrime==true){
                System.out.println("Given Number is Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }
```

### Functions =>

#### In Java, functions are known as methods. They are blocks of code that perform a specific task and are used to organize code, making it more modular and reusable.

```java
returnType name(){
    //body
    return statement;
}

// Syntax with Parameter
returnType name(type param1,type param2){ //parameter
    //body
    return statement;
}

```

## Parameter and arguments

### Parameter =>

-   It will be using while defineing the function.
-   It is also known as formal parameters.

### Arguments =>

-   It will using while calling the function.
-   It is also known as actual parameters.

## Call By Value -> We always pass the copy of variables to the methods for call by value.

### All the function in java works on call by value concept.

```java
    public static void swap(int a,int b){
        int temp;
        //swapping
        temp=a;
        a=b;
        b=temp;

        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);
        System.out.println("value of temp : "+temp);

    }
    public static void main(String[] args) {
        int a=3;
        int b=5;

        swap(a,b);

        // There is no change in original value.
        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);
    }
```

## Methods ->

-   User defined Function => factorial,sum,product ,etc..
-   inbuilt method => Math(pow,sqrt,max,min),nextint() etc..

## Function Overloading ->

### Multiple functions with the same name but different parameter.

-   here can be also number of parameters are different.

```java
public static int sum(int a,int b){//5,9
    int sum = a+b;
}
public static int sum(int a,int b,int c){//5,9,6
    int sum = a+b+c;
}
public static float sum(float a,float b){//8.5,9.4
    flaot sum = a+b;
}
public static double sum(double a,double b){//8.5,9.4
    double sum = a+b;
}

System.out.println(sum(5,9));
System.out.println(sum(5,9,6));
System.out.println(sum(8.5,9.4));
System.out.println(sum(8.5,9.4));
```
