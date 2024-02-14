package Arrays;

public class passingArrayArgs {
    public static void update(int marks[],int n){
        n=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {88,98,95};
        int nonChangable=6;
        update(marks,nonChangable);

        //to print our marks
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }   
        System.out.println(nonChangable);

    }
}
