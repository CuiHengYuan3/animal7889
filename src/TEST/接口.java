package TEST;
//接口作用：动物之间可以继承，但石头，飞机，导弹，篮球呢？这些就不能用继承了，因为继承还不够
//抽象，接口是比抽象类更抽象的类，如石头和飞机，导弹可以飞，导弹篮球是圆的，这就是最抽象的。
//一个类只可以单继承另一个类，但可以有多个接口，一般一种接口是一种属性。一个抽象类是一种模板。
//接口是规范与具体实现的分离，接口是规范，一种法法律，是来源与你是什么，你就要干什么，你是超人
//就必须能飞，你是坏人，就要做坏事（无语），一个项目的规范有很多，所以做项目一般是面向接口。
public interface 接口 {
    //接口中只有常量，抽象方法
    String A = "常量";//这两个常量总是 public static final,因为在是在接口中定义的
    int B = 12;

    public void test();//声明方法返回类型，参数类型。但不能写内容，只是声明。与内容

    // 为空不一样
    public int test2(int a,int b);//声明了规范，内容有很多类型，接口里的方法当然不能私有

    public static void main(String[] args) {
        Fly b=new 导弹();
    }
}
   class A implements 接口{

      @Override//必须重写。
      public void test() {
          System.out.println("test");
      }

       @Override
       public int test2(int a, int b) {
           System.out.println("test2");
          return a+b;
       }

      }
  interface Fly{
int FlyHinght=15;
    void  fly();

}
 interface  攻击{
    int gongjiForce=45;
    void gongji();
 }

   class  导弹 implements Fly,攻击{//一个类有多个接口,并且接口之间也可以相互接。

       @Override
       public void fly() {

       }

       @Override
       public void gongji() {

       }
   }