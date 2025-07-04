import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.Radio.Radio;

public class RadioTest {

    @Test
    public void testValidStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNegativeStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-7);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNotValidStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(20);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryTenStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryNineStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryEightStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryNegativStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryNullStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryOneStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testValidVolume() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNegativeVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-7);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNotValidVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(120);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryNineVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryNegativeUpVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBoundaryOneVolume() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextValidStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.nextStation();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextNineStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextEightStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.nextStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextOneStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void nextMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.nextStation();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxValidStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.minStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.maxStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(55);
        radio.nextVolume();
        int expected = 56;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.nextVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevValidStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.prevStation();
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prevStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevBoundaryNineStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testDnMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.prevVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(43);
        radio.prevVolume();
        int expected = 42;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.maxVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testBoundaryMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.maxVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolume() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.minVolume();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minDnVolume() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.minVolume();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minNullVolume() {
        Radio radio = new Radio();
        radio.setCurrentStation(-5);
        radio.minVolume();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

}


