package homework;

public class LV0 {
    String kind;
    String foodKype;
    String aggressivity;
    String height;
    boolean humanFrendly;
LV0(String k, String f, String a, String h, boolean hF){
    kind=k;
    foodKype=f;
    aggressivity=a;
    height=h;
    humanFrendly=hF;

}
    public static void main(String[] args) {
        LV0 Elephant =new LV0("mammalian", "herbivore","NO","4T",true);
        System.out.println("kind:"+Elephant.kind);
        System.out.println("foodKype:"+Elephant.foodKype);
        System.out.println("aggressivity:"+Elephant.aggressivity);
        System.out.println("height:"+Elephant.height);
        System.out.println("humanFrendly:"+Elephant.humanFrendly);
    }
}
