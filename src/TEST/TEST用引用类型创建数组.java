package TEST;

public class TEST用引用类型创建数组 {
    public static void main(String[] args) {
        User [] users=new User[3];
        users[0]=new User("崔","崔恒源1");
        users[0]=new User("崔","崔恒源2");
        users[0]=new User("崔","崔恒源3");
    }

}
class User{
    private  String id;
    private  String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;

    }
}