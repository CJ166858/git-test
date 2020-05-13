public class stunent implements Comparable<stunent> {
    private String name;
    private int age;

    public String getName() {
        return name;
    }


    public stunent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "stunent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public stunent() {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(stunent o) {
        return this.getAge()-o.getAge();
    }


}
