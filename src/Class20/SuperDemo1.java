package Class20;

public class SuperDemo1 {
}
class AAA{
    AAA(){

    }
}
class BBB{
    String name;
    BBB( ){

    }
    BBB(String name){
        super();
        //this(); we cant usr this () and super() inside the same constructor
        this.name=name;
    }
}