import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.regex.Pattern;
import java.util.regex.Matcher;



class Bogie {
    String name;
    int capacity;
    String type;

    Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ", " + type + ")";
    }
}


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

        // ---------------- UC6 ----------------

        HashMap<String, Integer> capacityMap = new HashMap<>();

        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 50);
        capacityMap.put("First Class", 30);

// Display
        System.out.println("\nBogie Capacities:");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ---------------- UC7 ----------------

        ArrayList<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72, "passenger"));
        bogies.add(new Bogie("AC Chair", 50, "passenger"));
        bogies.add(new Bogie("First Class", 30, "passenger"));

// Sort by capacity
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

// Display sorted
        System.out.println("\nSorted Bogies by Capacity:");
        System.out.println(bogies);


        // ---------------- UC8 ----------------

// Filter bogies with capacity > 60
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

// Display filtered bogies
        System.out.println("\nFiltered Bogies (capacity > 60):");
        System.out.println(filteredBogies);

        // ---------------- UC11 ----------------

// Sample input
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

// Define regex patterns
        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

// Create matcher objects
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

// Validate inputs
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

// Display results
        System.out.println("\nTrain ID Validation: " + (isTrainValid ? "Valid" : "Invalid"));
        System.out.println("Cargo Code Validation: " + (isCargoValid ? "Valid" : "Invalid"));




    }
}
