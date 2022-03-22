package com.syntax.class25;

public abstract class SmartWatch {

    //we can have INSTANCE variable in an abstract class
    private int RAM;
    protected int ROM;
    double displaySize;
    public String make;
    static boolean showTime=true;

    //because we have instance fields in this class, we should have a constructor for them.
    //we can't create an object of this class, but we WILL have objects of this class INDIRECTLY.
    public SmartWatch(int RAM, int ROM, double displaySize, String make) {
        this.RAM = RAM;
        this.ROM = ROM;
        this.displaySize = displaySize;
        this.make = make;
    }

    //private method syntax:
    //1.access modifier, 2.non-access modifier, 3. return type, 4. method name!!!!!
    public abstract void showHealthTips();

    //to accomplish a complex task, break down the task into smaller simpler tasks
    //and make those tasks private methods, and then access those methods in 1 public method
    private void checkOSUpdate(){
        System.out.println("Checking if update is available");
    }
    private void downloadUpdate(){
        System.out.println("Downloading update");
    }
    private void installUpdate(){
        System.out.println("Installing update");
    }
    public void updateOS(){
        checkOSUpdate();
        downloadUpdate();
        installUpdate();
        System.out.println("Updating the OS");
    }

    static void displayTime(){
        System.out.println("Displaying time");
    }

}


class AppleWatch extends SmartWatch{

    public AppleWatch(int RAM, int ROM, double displaySize, String make) {
        super(RAM, ROM, displaySize, make);
    }

    @Override
    public void showHealthTips() {
        System.out.println("Use the Health App to check the details");
    }

}
