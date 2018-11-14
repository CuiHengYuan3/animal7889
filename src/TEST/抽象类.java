package TEST;

public class 抽象类 {
public static void eat (people p){
    System.out.println("a");
    System.out.println("b");
    System.out.println("c");
    p.eat();//回调，传什么就是什么，其他的都是固定的模板，其实就是一个多态。
    System.out.println("d");
}

    public static void main(String[] args) {
        eat(new teacher());

}
}
abstract  class  people{
     abstract void   eat ();//abstract在返回值类型的前面。
}
class teacher extends people{
    @Override
    void eat() {
        System.out.println("知识就是精神食粮");
    }
}
class  student extends people{
    @Override
    void eat() {

    }
}
class  man extends people{
    @Override
    void eat() {

    }
}