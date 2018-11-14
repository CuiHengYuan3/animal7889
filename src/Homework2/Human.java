package Homework2;

 public class Human {
  private   int age;
     private String name;
     private Test.Sex sex;
Human(int age, String name, Test.Sex sex ){
    this.age=age;
    this.name=name;
    this.sex=sex;
}

     public int getAge() {
         return age;
     }

     public String getName() {
         return name;
     }

     public Test.Sex getSex() {
         return sex;
     }
   void Introduce(){
     System.out.println(getSex());
     System.out.println(getAge());
     System.out.println(getName());
     }
 }
  class  Test{
      public static void main(String[] args) {
Human  Seniorsister1=new Human(19,"XXXXX",Sex.WOMAN);
Seniorsister1.Introduce();
      }

      public enum  Sex {
      MAN,WOMAN;
      }
  }