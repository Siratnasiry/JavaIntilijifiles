package Class23;

public class ClassDog {

    String name;
    String color;
    String breed;
    int age;
    double weight;

    //overloading the constructors
    ClassDog() { //() doesnt have parameter, its called no argument constructor
        System.out.println("No Argument constructor");
    }

    ClassDog(String name) {
        this.name = name;

    }

    public ClassDog(String name, String color, String breed, int age, double weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    void changeInfo(String name) {
        this.name = name;

    }

    void changeInfo(String name, String color, String bulldong, int i, double v) {
        this.name = name;
        this.color = color;
    }

    // the below code came ( write tos you will get the options and click ok)
    @Override
    public String toString() {
        return "ClassDog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }


}