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
        }

        if(isPrime==true){
            System.out.println("Given Number is Prime");
        }
        else{
            System.out.println("Not Prime");
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
//Function Overloading Using Parameter and datatypes
public static int sum(int a,int b){//5,9
    return a+b;
}
public static int sum(int a,int b,int c){//5,9,6
    return a+b+c;
}
public static float sum(float a,float b){//8.5,9.4
   return a+b;
}
public static double sum(double a,double b){//8.5,9.4
    return a+b;
}

System.out.println(sum(5,9));
System.out.println(sum(5,9,6));
System.out.println(sum(8.5f,9.4f));
System.out.println(sum(8.5,9.4));

```

## Convert a Number from Binary to Decimal ->

```java
n=1001
decimal = 1*8 + 0*4 + 0*2 + 1*1 =>9

//logic

int dec =0;
int pow =0;
while(n!=0){
    lastDigit = n%10;
    dec = dec + lastDigit * 2^pow;
    pow++;
    n=n/10;
}

//code

public static void binToDec(int n){
    int dec =0;
    int pow =0;
    int realBin =n ;
    while(n>0){
        int lastDigit = n%10;
        dec = dec + (lastDigit * (int)Math.pow(2, pow));
        pow++;
        n=n/10;
    }

    System.out.println("Decimal Number of \""+realBin+"\" is : "+dec);
}
public static void main(String[] args) {
    binToDec(111);
}
```

## ## Convert a Number from Decimal to Binary ->

```java

//logic

n=7

7%2=>1  ^
3%2=>1  |
1%2=>1  |

Bin = 111

// Logic

n=11;
bin=0;
while(n>0){
    rem=n%2;
    bin =bin+rem*10^pow;
    n=n/2;
    pow++;
}

//code

public static void decToBin(int num){
    int originalNum =num;
    int bin=0;
    int rem;
    int pow=0;
    while(num>0){
        rem=num%2;
        bin = bin + (rem*(int)Math.pow(10,pow));
        num=num/2;
        pow++;
    }
    System.out.println("Binary Number of \""+originalNum+"\" is "+bin);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Decimal Number :");
    int num = sc.nextInt();
    decToBin(num);
    sc.close();
}
```

## Scope =>

### Method Scope ->

#### Variables declared directly inside a method are available anywhere in the method following the line of code in which they were declared

```java
public class Main {
    public static void main(String[] args) {
        int x = 100; // x has method scope
        System.out.println(x); // x can be used here
    }
}

```

### Block Scope ->

#### A block of code refers to all of the code between curly braces {}. Variables declared inside blocks of code are only accessible by the code between the curly braces, which follows the line in which the variable was declared.

```java
public class Main {
    public static void main(String[] args) {
        { // This is a block
            int x = 100; // x has block scope
            System.out.println(x); // x can be used here
        }
        // x cannot be used here, it's out of scope
    }
}

```

## Arrays =>

### List of elements of the same type placed in a contiguous memory location.

## Operations in arrays =>

-   Create
-   Input
-   Output
-   Update

### Creating an Array

```java
datatype arrayName[] = new datatype[size];

int narks[] = new int[50];

int numbers[] = {52,53,55};

String fruits[] = {"apple","mango","orange"};
```

### Input in an Array =>

```java


Scanner sc = new Scanner(System.in);

System.out.println("Enter Your Array Size");
int arraySize = sc.nextInt();

int marks [] = new int[arraySize];

for(int i=0;i<arraySize;i++){
   System.out.println("Give a number at position : "+i);
   marks[i]=sc.nextInt();
}
for(int i=0;i<arraySize;i++){
   System.out.println("A number at position : "+i+" is "+marks[i]);
   marks[i]=sc.nextInt();
}

```

## Passing arrays as argument =>

```java
// By call by reference
public class passingArrayArgs {
   public static void update(int marks[],int n){
        n=10;
       for(int i=0;i<marks.length;i++){
           marks[i]=marks[i]+1;
       }
   }
   public static void main(String[] args) {
       int marks[] = {88,98,95};
       int nonChangable = 6;

       update(marks,nonChangable);
       System.out.println(nonChangable);
   }
}
```

## Binary Searh ->

### The array should be sorted as Binary Search works on sorted arrays. If the array is not sorted, we’ll need to sort it before using Binary Search.

### Does not matter array is sorted in order to increasing or decreasing.

```java
    public static int BinaryS(int numbers [],int key){
        int start =0;
        int end = numbers.length-1;
        while(start<=end){
            int mid  = (start+end)/2;
            //comparisons
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){ // right part
                start = mid+1;
            }
            else{ // left part
                end = mid-1;
            }
        }
        return -1;
    }
```

## Time Complexity of Binary Search->

```java

                  loop runs
Iteration 1 =>       n        =>(n/2power0)
Iteration 2 =>       n/2      =>(n/2power1)
Iteration 3 =>       n/4      =>(n/2power2)
Iteration 4 =>       n/8      =>(n/2power3)
Iteration 5 =>       n/16     =>(n/2power4)
          .
          .
          .
          .

n/2power(k) = 1 (in worst case) Means loop runs till the n

=> n = 2power(k) => k = log(base2)(n)

=> O(log n)
```

## Trapping Rainwater =>

-   1. Minimum numbe of bars >=2
-   2. Bars in Ascending or Descending Order(no water trapped)

-   3. if there are 3 and more bars then we will find maximum of left bar and max of right bar. in those maximum which one is minimum that is water level.
-   water level=min(max(left),max(right));
-   4. trapped water = (water level - bar level or height )\*width

-   bar height and bar width are given is question.

-   to calculate max(left),max(right) we use Auxiliary Array (helper array)

## Sorting => Arrange in an order

-   Bubble Sort
-   Selection Sort
-   Insertion Sort
-   Counting Sort

### Bubble Sort =>

#### Large elements come to the end of the array by swapping with adjacent elements.

```java

public class BubbleSort {
    public static void BubbleS(int arr[]){

        int swapped=0;
        int n = arr.length;
        for(int turn =0;turn<=n-2;turn++){

            for(int j=0;j<=n-2-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    swapped++;
                }
            }
        }
        if(swapped==0){
            System.out.println("The array is already sorted");
        }
    }
    public static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr [] ={1,2,3,4,5};
        BubbleS(arr);
        printArray(arr);
    }
}

```

## Selection Sort =>

### Pick the smallest (from unsorted),putit ar the biginning

```java
public class SelectionSort {
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int numbers[]= {3,5,2,1,4};
        selectionSort(numbers);
        printArray(numbers);
    }
}
```

## Insertion Sort =>

### Pick an element (from unsorted part) and place in the right pos in sorted part.

## 2D Array =>

```java
    int matrix[][] = new int [3][3];
    // number of rows in 2d array
    int rows = matrix.length;
    //number of columns in 2d array
    int cols = matrix[0].length;

```

### Spiral Matrix =>

### Approach =>

```java 1st iteration        2nd
    start row   0                     1       ++
    end row     3 (n-1)               2       --
    start col   0                     1       ++
    end col     3                     2       --
```

## Search in Sorted Matrix (StairCase Search)=>

```java
Condition for cell (0,m-1)

key<cell value => LEFT
key>cell value => Bottem

while
row<matrix[0].length && col>=0

Condition for cell (n-1,0)

key<cell value => TOP
key> cell value => RIGHT



When n-1 goes to 0 and m-1 goes to 0 then search item is not exist.


```

## The toString() method in Java is invoked automatically when an object needs to be represented as a string. Here are some common scenarios when toString() gets invoked:

-   Printing Objects: When you try to print an object using System.out.println(), Java automatically invokes the toString() method on the object to get a string representation of it.
    Java

```java
Complex c = new Complex(1.0, 2.0);

System.out.println(c);  // This will invoke c.toString()
```

-   String Concatenation: If you concatenate an object with a string, Java will automatically call the toString() method on the object.
    Java

```java
String s = "Complex number: " + c;  // This will invoke c.toString()
```

-   In Debugging: Debugging tools often use toString() to provide a string representation of objects.

## Exception Handling =>

## Source code ke karan generate hone wali error ko Exception kahte hai.

### Built In Exceptions =>

-   ClassNotFoundException
-   SQLException
-   FileNotFoundException
-   ArrayIndexOutOfBoundsException
-   NullPointerException
-   ArithmeticException
-   IOException

### Program ko bina terminate kiye process ko continue krna exception handling kahte hai.

```java
class A{
    public static void main(String arr []){
        int arr [] ={1,2,3,4,5,5};
        try{
            int a = arr[10];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
class B{
    public static void main(String arr []){
        int arr [] ={1,2,3,4,5,5};
        int arr2[] ={2,3,5,0,5,9};
        try{
            for(int i=0;i<6;i++){
                System.out.println(arr[i]/arr1[i]);
            }
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
```

## finally => finally statement execute the code after try and catch.

## throw => The throw statement allows us to create a user defined exception.

```java
public class Main {
  static void checkAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }

  public static void main(String[] args) {
    checkAge(15); // Set age to 15 (which is below 18...)
  }
}
```

## Recursion => the function calling itself called recursion.

## Recursion is a method of solving a computational problem where the solutions to smaller instances of the same problem.

