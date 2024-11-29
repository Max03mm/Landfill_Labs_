package models;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class HistoricTest {



    @Test
    void getRemainingWaste() {
    }

    @Test
    void setRemainingWaste() {
    }

    @Test
    void getPlasticGlass() {
    }

    @Test
    void setPlasticGlass() {
    }

    @Test
    void getPaper() {
    }

    @Test
    void setPaper() {
    }

    @Test
    void getMetallic() {
    }

    @Test
    void setMetallic() {
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/wasteSplit.csv")
    void estimateWasteSplit(double initialWaste, double expectedPaper, double expectedPlasticGlass, double expectedMetallic) {

        Historic historic = new Historic(Location.A, initialWaste);


        assertEquals(expectedPaper, historic.getPaper(), 0.01, "Paper waste split is incorrect");
        assertEquals(expectedPlasticGlass, historic.getPlasticGlass(), 0.01, "Plastic/Glass waste split is incorrect");
        assertEquals(expectedMetallic, historic.getMetallic(), 0.01, "Metallic waste split is incorrect");

    }
}
