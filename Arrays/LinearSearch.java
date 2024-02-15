 
public class LinearSearch {
    public static int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int itemSearch(String menu[],String item){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==item){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16}; 
        int key=9;
        int search =linearSearch(numbers, key);
        if(search == -1){
            System.out.println("Key is Not FOUND");
        }else{
             System.out.println("Key is at index : "+search);
        }

        String menu[] = {"DOSA","Chole Bhature","Samose","Chaumeen","manchurian","Aalu tikki","Kachori","Pepsi","Cococola","Daaru"};

        String item = "Daaru";
        int searchItem = itemSearch(menu,item);
        if(searchItem == -1){
            System.out.println("Item is Not FOUND");
        }else{  
             System.out.println(menu[searchItem]+" is at index : "+ (int)(searchItem+1));
        }
    }
}
