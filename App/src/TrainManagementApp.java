import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.LinkedHashSet;



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

        // ---------------- UC4 ----------------

        LinkedList<String> trainList = new LinkedList<>();

// Add bogies
        trainList.add("Engine");
        trainList.add("Sleeper");
        trainList.add("AC");
        trainList.add("Cargo");
        trainList.add("Guard");

// Insert Pantry Car at position 2
        trainList.add(2, "Pantry");

// Remove first and last
        trainList.removeFirst();
        trainList.removeLast();

// Display final list
        System.out.println("\nFinal Train Consist (LinkedList):");
        System.out.println(trainList);

        // ---------------- UC5 ----------------

        LinkedHashSet<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper"); // duplicate ignored

        System.out.println("\nTrain Formation (LinkedHashSet):");
        System.out.println(formation);




    }
}
