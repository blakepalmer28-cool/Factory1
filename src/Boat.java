public class Boat {
    public int capacity;
    public String name;
    public String model;
    public boolean isTripledecker;
    public int length;



    public Boat(){
        name = "SHARK";
        capacity = 2000;
        model = "MEG";
        isTripledecker = true;
        length = 20;
    }

    //connstructor with parameter
    public Boat(String bName){
        name = bName;
        capacity = 2000;
        model = "EXWX80";
        isTripledecker = true;
        length = 20;




    }
    public void printInfo(){
        System.out.println(name);
        System.out.println("Model:"+model); // readable
        System.out.println(isTripledecker);
        System.out.println(capacity);
        System.out.println(length);

    }




}
