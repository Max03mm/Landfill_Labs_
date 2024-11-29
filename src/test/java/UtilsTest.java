import models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static models.Location.A;
import static models.Location.B;
import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    Historic historic;
    List<Recycling> candidateCentres;
    @BeforeEach
    void beforeEach() {
        historic = new Historic(A, 1250);
        // Use the instance variable here
        candidateCentres = new ArrayList<>();

        Recycling centre1 = new Alpha(Location.A, 5);  // Location A, 5 years active, generation Alpha
        Recycling centre2 = new Beta(Location.B, 3);   // Location B, 3 years active, generation Beta
        Recycling centre3 = new Gamma(Location.C, 2);  // Location C, 2 years active, generation Gamma

        candidateCentres.add(centre1);
        candidateCentres.add(centre2);
        candidateCentres.add(centre3);
    }

    @Test
    void findViableCentres() {


    }

    @Test
    void findOptimalCentre() {

        Recycling optimalCentre = Utils.findOptimalCentre(historic, candidateCentres);

        assertEquals(candidateCentres.get(0), optimalCentre, "The optimal centre should be centre1.");


    }

    @Test
    void findNearestCentres() {
    }

    @Test
    void findHighestGenerations() {
    }

    @Test
    void compareGenerations() {
    }

    @Test
    void findLeastYearsActive() {
    }

    @Test
    void calculateTravelDuration() {
    }

    @Test
    void calculateProcessDuration() {
    }
}