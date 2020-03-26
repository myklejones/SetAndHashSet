package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {

        HeavenlyBody temp = new HeavenlyBody("Murcury",88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

         temp = new HeavenlyBody("Earth",365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Sun",88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon",27);
        solarSystem.put(temp.getName(), temp);
        temp.addMoon(tempMoon);


        System.out.println("planets ");
        for (HeavenlyBody planet: planets){
            System.out.println("\t" + planet.getName());
        }



    }
}
