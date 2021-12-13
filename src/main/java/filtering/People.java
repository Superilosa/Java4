package filtering;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class People {

    private static final Logger logger = LoggerFactory.getLogger(People.class);

    public static void filterPeople() {

        ArrayList<String> people = new ArrayList<>(Arrays.asList("Nika", "Gio", "Tsotne", "Irakli", "Mikheili", "Alexandre", "Ekaterine", "Nino"));

        try {
            ArrayList<String> filteredPeople = (ArrayList<String>) people
                    .stream().filter(p -> p.length() > 5).collect(Collectors.toList());

            filteredPeople.forEach(System.out::println);
        } catch(Exception ex){
            logger.error("Error while filtering people", ex);
        }

    }
}
