import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinsTest {

    @Test
    void getBin() {
        Bins bin = new Bins(2,12);

        int expected = 0;
        int receivedNum = bin.getBin(10);

        assertEquals(expected, receivedNum);

    }

    @Test
    void incrementBin() {
        Bins bin = new Bins(2,12);

        int expected = 1;
        bin.incrementBin(10);
        int receivedNum = bin.getBin(10);

        assertEquals(expected, receivedNum);
    }
}