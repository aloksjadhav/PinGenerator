package main.java;

import jdk.nashorn.internal.runtime.logging.Logger;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Logger
public class PinGenerator {

    java.util.logging.Logger log = java.util.logging.Logger.getLogger("PinGenerator");

    /**
     * Generates 4-digit unique numbers
     * @return
     */
    public Set<Integer> getFourDigitPins()
    {
        Random r = new Random();
        Set<Integer> finalList = new HashSet<>();

        while (finalList.size() < 1000) {
            int randomInt = r.nextInt(9000) + 1000;
            finalList.add(randomInt);
        }
        return finalList;
    }


}
