public class Human {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String work;


    public Human(int age, int weight, String address, String work) {
        name = "Nick";
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }

    public Human(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.work = work;
        weight = 65;

    }

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Human(String name, String address) {
        this.name = name;
        age = 35;
        weight = 65;
        this.address = address;
    }

    public Human(String name, int age) {
        this.age = age;
        this.name = name;
        weight = 65;
    }

    public Human(String name, int age, int weight, String address, String work) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.work = work;
    }
}
