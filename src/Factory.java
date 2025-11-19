import java.sql.SQLOutput;

public class Factory {

    //make a varible called yearFounded that is an integer
    //instance varibales at the top of class, they can be seen by every class
    //they have to have the word public
    //scope is the whole class
    public int yearFounded = 1798;
    public String factoryName = "Airplane Factory";
    public boolean isOpen = true;

    public static void main(String[] args) {
        System.out.println("welcome to  Mx. Bradford's factory");
        new Factory();
    }

    //constructor
    /// 1. is a method
    /// 2. has a same name as class
    /// 3. no void
    /// public Factory works because

    public Factory(){
        isOpen = false;
        //scope for manger is only in the constructory
        String manager = "Mr. Hales";
        System.out.println(manager);
        factoryInfo();

        //todo: change the varible yearfounded to be a different value
        //call factoryInfo(); agian

        // type variableName = Value
        // object of type airplane
        Airplane plane1 = new Airplane();
        plane1.name = "quandaleDingle";
        System.out.println(plane1.name);
        plane1.capacity = 1 ;
        System.out.println(plane1.capacity);
        plane1.model = "B-1B Lancer";
        System.out.println(plane1.model);
        plane1.isDoubleDecker = true;
        System.out.println(plane1.isDoubleDecker);
        plane1.length = 67;
        System.out.println(plane1.length);

        Airplane plane2 = new Airplane();
        System.out.println(plane2.capacity);
        plane2.capacity = 615;
        System.out.println(plane2.capacity);
        plane2.model = "Qu";
        System.out.println(plane2.model);
        plane2.isDoubleDecker = true;
        System.out.println(plane2.isDoubleDecker);
        plane2.length = 67;
        System.out.println(plane2.length);

        Airplane plane3 = new Airplane();
        plane3.name= "quandaleDingle2.0";
        System.out.println(plane3.name);
        plane3.capacity = 1230;
        System.out.println(plane3.capacity);
        plane3.model = "B-2B Lancer";
        System.out.println(plane3.model);
        plane3.isDoubleDecker = false;
        System.out.println(plane3.isDoubleDecker);
        plane3.length = 134;
        System.out.println(plane3.length);

        //constructor with parameter

        Airplane plane = new Airplane(232,"Jacob6","Boeing 737",false, 157);
        System.out.println(plane.capacity);
        plane.printInfo();

        //hW: make 2 more airplane objects
        //for one of the objects change all the instance variables
        //for both objects print all the instance variables



        //todo: give all of plane1's instance Variable values
    }

    //make a method called factoryInfo,nothing should be in the method.
    public void factoryInfo(){
        //todo: add souts to print out the 3 instance variables
        System.out.println(yearFounded);
        System.out.println(factoryName);
        System.out.println("it is " +isOpen + " that the facoty is open");


        System.out.println(factoryName +yearFounded +isOpen);
        //more readable option
        System.out.println("year founded " + yearFounded);
    }
}
