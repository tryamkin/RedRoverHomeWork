package epam;

public class Main extends Object{
    public static void main(String[] args) {

        Car fastcar = new Car();
        fastcar.setSpeed(100);
        System.out.println(fastcar.getspeed());
        fastcar.speed = 200;
        System.out.println(fastcar.speed);
        Object obj = new Object();
        }
}
