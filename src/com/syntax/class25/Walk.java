package com.syntax.class25;

interface IsHealthy{
    void isHealthy();
}

public interface Walk extends IsHealthy{
    void burnCalories();
}

interface Milk extends IsHealthy{
    void growBones();
}

interface Berries extends IsHealthy{
    void hasAntioxidants();
}

/*
an interface can INHERIT from OTHER INTERFACES (w/ "extends")
classes IMPLEMENT interfaces
when they are the same, they "extend"
when they are different, the "implement"
 */

class Demo implements Berries{

    @Override
    public void isHealthy() {
        System.out.println("Berries are healthy");
    }

    @Override
    public void hasAntioxidants() {
        System.out.println("Berries have lots of anti-oxidants");
    }
}