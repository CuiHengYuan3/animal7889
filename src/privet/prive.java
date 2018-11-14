package privet;

public class prive {
    public static void main(String[] args) {
        Human h=new Human();

      int b= h.Getage();
          System.out.println(b);
    h.Getag();
    }
}
class Human{
    private   int age=12;
    int Getage(){
        return age;
    }
void  Getag(){
    System.out.println(Getage());
}




}