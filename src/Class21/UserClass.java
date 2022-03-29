package Class21;

public class UserClass {
    //Write program: userClass  that has a constructor that initializes
    // instance variable name and mobile number. Create a subclass  userInfo that will
    // have user address variable and it also being initialized through constructor call.
    // Print users name, mobile number and address in userDetails method. Test your code.
    String name;
    String mobileNumber;
    UserClass(String name,String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }
}
class UserClassInfo extends UserClass {
    String address;

    UserClassInfo(String name, String mobileNumber, String address) {
        super(name, mobileNumber);
        this.address = address;
    }

    void UserClassDetails() {
        System.out.println("name = "+name+" MobileNumber = "+mobileNumber+" Address = "+address);

    }
}
   class Test{
       public static void main(String[] args) {
           UserClassInfo obj=new UserClassInfo("Yosra","342222211111","20205 VirginiaUSA");
           obj.UserClassDetails();
       }
}