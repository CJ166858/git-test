public class one {
     String name;
     String age;

    public String getName() {
        return name;
    }

    public one(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public one(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public  void eat(){
        System.out.println("chi");
    }


}
