import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;


public class TrainManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Initial bogie count: " + trainConsist.size());

        // UC2

        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        System.out.println("\nAfter adding bogies:");
        System.out.println(trainConsist);

        trainConsist.remove("AC Chair");

        boolean exists = trainConsist.contains("Sleeper");
        System.out.println("\nDoes Sleeper exist? " + exists);

        System.out.println("\nFinal bogie list:");
        System.out.println(trainConsist);

        // UC3

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("B1");
        bogieIds.add("B2");
        bogieIds.add("B3");
        bogieIds.add("B2"); // duplicate ignored

        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIds);


    }
}
