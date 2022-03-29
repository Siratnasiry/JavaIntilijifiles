package Class23;

public class Car {

    void start() {
        System.out.println("Use Keys to start me");
    }
    void stop() {
        System.out.println("Use Breaks to start me");
    }
    void park() {
        System.out.println("Park me manually");
    }
}
class BMW extends Car{
        void start(){
        System.out.println("start me with button");
        }
        void stop(){System.out.println(" Can use breaks or i can autobreak");}
        void park(){System.out.println("use parking sensors to park me");}
        }
class Tesla extends Car{
    void start(){
        System.out.println("start with app or remote");}
    void stop(){System.out.println(" Can use breaks or i can autoBreak");}
    void park(){System.out.println("use parking sensors to park me");}
}

class Suzuki extends Car{
    void start() {
        System.out.println("Push me to start");
    }

    void stop(){
        System.out.println("I lost my breaks and tires on the way");
    }
}