package abstractdemo;

public abstract class Vehicle {
    //at this place we know vehicle will move but don't know either bike will move or car so we don't have complete
    // information ,so we will make it abstract class
    public abstract void move();
}
