package TEST;
/*
多态：同样的方法（参数也类型），不同的结果。与方法重载不一样。
实现多态的三个条件：继承，方法重写，父类引用指向子类对象。
下面代码，若没有多态，不同的动物要实现AnimalSay这个静态方法就需要重载很多静态方法

ps:不需要传参的方法就“ .”来调用，而需要传参的方法是这样的 AnimalSay(a)，先写方法名，
参数在括号内。

*/

public class TEST多态和类型转换测试 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog B = new Dog();
        AnimalSay(a);
        AnimalSay(B);
        Animal C = new Dog();//向上转型,这个C是Animal的对象，不是狗的对象，因为狗是动物的子类，所以自动向父类
        //转，所以不能用狗类的方法(如seeDoor方法)，要用就要强制转换为Dog类
        C.shout();//这里调用的是父类的方法
        Dog C1=(Dog) C;//强制转换为Dog类
((Dog) C).seeDoor();//现在就可以用了

    }

    static void AnimalSay(Animal a) {//父类引用指向子类对象
        a.shout();
    }

}

class Animal {//父类加了final就不能被继承
    public void shout() {//如果父类方法加了final就不能被重写
        System.out.println("叫了一声");
    }

}

class Dog extends Animal {
    public void shout() {
        System.out.println("汪");//方法重写
    }
public  void seeDoor(){
        System.out.println("汪汪汪");
    }
}

class Cat extends Animal {
    public void shout() {
        System.out.println("喵喵喵");
    }
}