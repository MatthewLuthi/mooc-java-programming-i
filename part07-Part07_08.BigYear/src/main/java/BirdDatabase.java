
import java.util.ArrayList;

/**
 * BirdDatabase allows manipulation of bird list that is then utilized by
 * UserInterface depending on user input.
 *
 * @author Matt
 */
public class BirdDatabase {

    private ArrayList<Bird> birds;

    public BirdDatabase() {
        birds = new ArrayList<>();
    }

    public void add(String name, String latinName) {
        birds.add(new Bird(name, latinName));
    }

    public String getAllBirds() {
        String allBirds = "";

        for (int i = 0; i < birds.size(); i++) {
            if (i == birds.size() - 1) {
                allBirds += birds.get(i).toString();
            } else {
                allBirds += birds.get(i).toString() + "\n";

            }
        }

        return allBirds;
    }

    public String getOneBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                return bird.toString();
            }
        }

        return null;
    }

    public boolean addObservation(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
                return true;
            }
        }

        return false;
    }
}
