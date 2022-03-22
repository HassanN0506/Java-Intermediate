package com.syntax.class25;

public interface Healthy {
    void Healthy();
}
interface Portable{
    void canCarry();
}
interface Edible{
    void eat();
}

class Banana implements Healthy, Portable, Edible{

    @Override
    public void Healthy() {
        System.out.println("bananas are healthy");
    }

    @Override
    public void canCarry() {
        System.out.println("bananas are portable");
    }

    @Override
    public void eat() {
        System.out.println("bananas are edible");
    }
}

class Laptop implements Portable{

    @Override
    public void canCarry() {
        System.out.println("we can carry a laptop easily");
    }
}
