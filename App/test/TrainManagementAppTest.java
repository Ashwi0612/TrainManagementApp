import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class TrainManagementAppTest {

    // Helper method to calculate total using reduce
    private int calculateTotal(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
    }

    @Test
    void testReduce_TotalSeatCalculation() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 50, "Passenger"));

        int total = calculateTotal(bogies);

        assertEquals(122, total);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72, "Passenger"),
                new Bogie("AC Chair", 50, "Passenger"),
                new Bogie("First Class", 30, "Passenger")
        );

        int total = calculateTotal(bogies);

        assertEquals(152, total);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> bogies = Collections.singletonList(
                new Bogie("Sleeper", 72, "Passenger")
        );

        int total = calculateTotal(bogies);

        assertEquals(72, total);
    }

    @Test
    void testReduce_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();

        int total = calculateTotal(bogies);

        assertEquals(0, total);
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72, "Passenger"),
                new Bogie("AC Chair", 50, "Passenger")
        );

        int total = calculateTotal(bogies);

        assertEquals(122, total);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72, "Passenger"));

        int sizeBefore = bogies.size();

        calculateTotal(bogies);

        int sizeAfter = bogies.size();

        assertEquals(sizeBefore, sizeAfter);
    }
}
