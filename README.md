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
