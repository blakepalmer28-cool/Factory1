public class Airplane {
    /// instance variables
    /// 1. used in the whole class
    /// 2. they should be at the top of the class
    /// 3. have public in front
    public int capacity;
    public String name;
    public String model;
    public boolean isDoubleDecker;
    public int length;
    public Airplane(){
        capacity = 250;
        length = 157;
        name = "Jacob6";
        //pname =pName;

        model = "Boeing 737";
        isDoubleDecker = false;
    }
    //todo:make a method called printInfo() that prints the airplanes instance variables
    public void printInfo(){

    }
    //default constructor ^^^^^^^^
    //constructor

    //constructor with parameter
    public Airplane(int pCapacity,String pName, String pModel, boolean pIsDoubleDecker, int pLength){
        capacity = pCapacity;
        name = pName;
        //plane =name;

        model =pModel;
        isDoubleDecker =  pIsDoubleDecker;
        length = pLength;


    }

}
