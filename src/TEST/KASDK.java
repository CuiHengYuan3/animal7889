package TEST;

public class KASDK {
    public static void main(String[] args) {
   mam a=new mam(1,2);
        System.out.println(a instanceof mam);
mam c=a;
        System.out.println(c.equals(a) );
        System.out.println(c.toString());
        System.out.println(c.hashCode());
        System.out.println(c.getClass());
    String m;
    m=new String("1213");
        System.out.println(m);
        System.out.println(m.charAt(1));

    }
}
class  asdf{
    static int z=45;
    class asdfsd {

    }

}





class mam{
    int a;
    int b;

    public mam(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("我是父类");
    }
}
class  mam2 extends man{
    public mam2(int a,int b){
        super();
    }
interface  mam3{
        final static int ab=12;
public  void abc(int a,int v);

abstract  class  io{
    public  abstract void  mkl();
}
class  ui implements mam3{
    @Override
    public void abc(int a, int v) {

    }
}


    }

}