package ClassReview;

public class Bike {
        int maxSpeed=100;
        void printMaxSpeed(){

        }
    }
    class HondaBikes extends Bike{
        int maxSpeed=150;
        void printMaxSpeed(){
            int maxSpeed=200;
            System.out.println(maxSpeed);
            System.out.println(this.maxSpeed);
            System.out.println(super.maxSpeed);// nothing = 200 this.=150, super.100
        }
    }
    class Test123{
        public static void main(String[] args) {
            HondaBikes hondaBikes=new HondaBikes();
            hondaBikes.printMaxSpeed();
        }
    }

