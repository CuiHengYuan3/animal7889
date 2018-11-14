package homework;

//testjicheng
public class LV2 {
    public static void main(String[] args) {

    }
}
class Animal{
    String kind;
    String foodKype;
    String aggressivity;
    String height;
    boolean humanFrendly;
Animal(String k, String f, String a, String h, boolean hF){
    kind=k;
    foodKype=f;
    aggressivity=a;
    height=h;
    humanFrendly=hF;

}
    public  void Hunt(){
    System.out.println("发现食物");
}
    public  void Eat(){
        System.out.println("食物真好吃");
    }
}
class Elephant extends Animal{

    Elephant(String k, String f, String a, String h, boolean hF) {
        super(k, f, a, h, hF);
    }

    public  void Hunt(){
        System.out.println("发现野果野菜");
    }
    public  void Eat(){
        System.out.println("野果野菜真好吃");
    }
}

class Loin extends Animal{
    Loin(String k, String f, String a, String h, boolean hF) {
        super(k, f, a, h, hF);
    }

    public  void Hunt(){
        System.out.println("发现羚羊");
    }
    public  void Eat(){
        System.out.println("羚羊真好吃");
    }
}
class Whale extends Animal{
    Whale(String k, String f, String a, String h, boolean hF) {
        super(k, f, a, h, hF);
    }

    public  void Hunt(){
        System.out.println("发现浮游鱼群");
    }
    public  void Eat(){
        System.out.println("浮游鱼群真好吃");
    }
}

