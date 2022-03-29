package Class25;

public interface Healthy {

    void Healthy();
    interface portable{

    void canCarry();
}
interface Eatable{
    void eat();
    }
    class Orange implements Healthy,portable,Eatable{


        @Override
        public void Healthy() {
            System.out.println("Orange is healthy to eat");
        }

        @Override
        public void canCarry() {
            System.out.println("we can carry orange easily");
        }

        @Override
        public void eat() {
            System.out.println("we can eat orange");
        }
    }
    class Laptop implements portable{


        @Override
        public void canCarry() {
            System.out.println("we can carry a laptop easily");
        }
    }
}