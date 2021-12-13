package filtering;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        try {
            People.filterPeople();
        } catch(Exception ex){
            logger.error("People error");
        }
        try {
            Animals.filterAnimals();
        } catch(Exception ex){
            logger.error("Animals error");
        }

    }

}
