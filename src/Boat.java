public class Boat {
    public int capacity;
    public String name;
    public String model;
    public boolean isTripledecker;
    public int length;


    //connstructor
    public Boat(){
        capacity = 2000;
        name = "Aidike";
        model = "EXWX80";
        isTripledecker = true;
        length = 20;




    }
    public void printinfo(){
        System.out.println(name);
        System.out.println("Model:"+model); // readable
        System.out.println(isTripledecker);
        System.out.println(capacity);
        System.out.println(length);

    }




}
