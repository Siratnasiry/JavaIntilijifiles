package Class23;

public class ClassDogTester {

    public static void main(String[] args) {
        ClassDog Dog=new ClassDog();
        System.out.println(Dog);

        ClassDog Dog2=new ClassDog("Tommy","Green","Redbull",12,25.5);
       Dog2.changeInfo("Rokey","Black","Bulldong",13,25.5);
        System.out.println(Dog2);
    }


}
