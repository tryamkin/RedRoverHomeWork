package redRowerHW.hw10_3;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import org.junit.Test;

public class TrafficLights {

    public static String updateLight(String current) {
      String answ = null;
        switch (current) {
            case ("red"):answ = "green";
            break;
            case ("yellow"):answ = "red";
            break;
            case ("green"):answ = "yellow";
            break;
        }
        return answ;

    }

}


