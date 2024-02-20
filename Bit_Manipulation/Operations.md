## Operations

### 1. Get ith Bit

```java
n&(1<<i)

example ->
what is 2nd bit of 6.

6&(1<<2) =>(110 & 100) => 1

2nd bit of 6 is 1.
```

### 2. set ith Bit => kisi position pe 0 hai to 1 bnana hai

```java

n|(1<<i)

example ->

8|(1<<2) =>(1000 | 0100) => 1100 => 12
return n|(1<<i);
```

### 3. Clear ith bit => kisi position pe 1 hai to usko 0 bnana hai

```java

n & ~(1<<i)

example ->

10&~(1<<1) =>(1010 & ~0010) =>(1010&1101) => 1000 => 8
return n & ~(1<<i) ;
```

## Update Ith Bit => We make a function to update ith bit that will be taking arguments like number , position and newBit(0 or 1).

```java
public static int clearBit(int number,int pos){
    int bitmask = ~(1<<pos);
    return number & bitmask;
}
public static int setBit(int num,int position){
    int bitmask = 1<<position;
    return num | bitmask;
}
public static int updateBit(int number,int pos,int newBit){
    if(newBit==0){
        return clearBit(number, pos);
    }else{
        return setBit(number, pos);
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number : ");
    int number = sc.nextInt();
    System.out.println("Enter position : ");
    int pos = sc.nextInt();
    System.out.println("Write the bit you want to change :");
    int newBit = sc.nextInt();
    System.out.println("Number After Update bit : "+updateBit(number, pos, newBit));
    sc.close();
}
``
```

## Clear Last i Bit => Last ki sabhi i bit ko 0 bnana hai

```java
~0 => (-1) => 1111111111
~0 << 3 => 1111111000

bitmask = ~0 << pos

return number & bitmask;

```

## Clear Range of bits =>

```java
11010101 => 213 is a given number
We want to clear bit from 2 to 4;

for clear this range our bitmask should be =>
11000111 =>
number & bitmask => output
11010101 & 11000111 => 11000101

to make bitmask like 11000111

a   => 11000000
b   => 00000111
a|b => 11000111

a => ~0 << endposition+1;
b => 1*2^startPosition -1; => (1<<startPosition) -1
    [a*2^b => a<<b]

bitmask => a|b

return bitmask & number;

int a = ~0<<epos+1;
int b = (1<<spos)-1;
int bitmask = a|b;
return number & bitmask;
```

## check if a number is power of 2 or not

```java
return (number & (number-1))==0

=>   1000 =>8
=> & 0111 =>7
=>   0000

Here 8 is power of 2
```

## count set bit (occurance of 1)

```java

```

## Fast Exponentiation ->

```java
a^N
=> We convert our N into Binary Form with & operator

3^5 => 3^101

int answer =1;
while(N>0){
    if((N&1)!=0){ //check LSB (101 & 001 => 1)
        answer = answer * a;
    }
    a=a*a;
    N=N>>1;
}
return answer;


```
