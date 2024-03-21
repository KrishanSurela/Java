## Array => Fixed Size, Primitve data types can be stored.

## ArrayList => Dynamic Size , Primitive data types can't be stored directly.

```java
import java.util.ArrayList;
public class Classoom{
    // Float , String , Boolean are class and boolean is datatype.
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
    }
}
```
## Operations On ArrayList
- Add Element
- Get Element
- Remove Element
- Set Element at index
- Contains Element

```java
list.add(1);
list.add(2);
list.add(5);

System.out.print(list);

list.add(4);

System.out.print(list);

//Get Operation

int element = list.get(2);
System.out.println(element);
```

