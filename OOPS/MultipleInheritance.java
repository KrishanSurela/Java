public class MultipleInheritance {
   public static void main(String[] args) {
    Bear b = new Bear();
    b.EatGrass();
    b.EatMeet();
   }
}
interface Herbivore{
     void EatGrass();
}
interface Carnivore{
    void EatMeet();
}
class Bear implements Herbivore,Carnivore{
    public void EatGrass(){ // Yaha public nhi likhte hai to ye function bydefault class ke ander method default type ka ho jayega.So interface ke ander method public type ka h to public bnana pdega

        System.out.println("Bear can Eat Grass");
    }
    public void EatMeet(){
        System.out.println("Bear can also Eat Meet");
    }
}