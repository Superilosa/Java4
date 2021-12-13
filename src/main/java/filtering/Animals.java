package filtering;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

public class Animals {

    private static final Logger logger = LoggerFactory.getLogger(Animals.class);

    public static void filterAnimals(){

        HashMap<String, Integer> animals = new HashMap<>();
        animals.put("ძროხა", 100);
        animals.put("ცხვარი", 20);
        animals.put("ძაღლი", 14);
        animals.put("სპილო", 200);
        animals.put("კატა", 4);
        animals.put("თხა", 21);
        animals.put("სინდიოფალა", 1);

        try {
            HashMap<String, Integer> filteredAnimals = (HashMap<String, Integer>) animals.entrySet()
                    .stream().filter(Animals::isHeavy).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            filteredAnimals.forEach(
                    (key, value) -> System.out.printf("Name: %s, Weight: %d\n", key, value)
            );
        } catch(Exception ex){
            logger.error("Error while filtering animals", ex);
        }
    }

    private static boolean isHeavy(Map.Entry<String, Integer> animal) {
        return animal.getValue() > 20;
    }

}
