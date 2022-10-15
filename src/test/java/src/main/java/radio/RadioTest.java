package src.main.java.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void shouldNotSetSoundVolumeMoreMax() {
        Radio radio = new Radio();

        radio.setSoundVolume(11);

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeLessMin() {
        Radio radio = new Radio();

        radio.setSoundVolume(-1);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(7);
        radio.IncreaseSoundVolume();

        int expected = 8;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(7);
        radio.decreaseSoundVolume();

        int expected = 6;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseSoundVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setSoundVolume(10);
        radio.IncreaseSoundVolume();

        int expected = 10;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseSoundVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setSoundVolume(0);
        radio.decreaseSoundVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(3);
        radio.nextRadioStation();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextRadioStationWith9On0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);
        radio.prevRadioStation();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // Тест на переключение радиостанций кнопкой "предыдущая" с 0 на 9:
    @Test
    public void shouldSwitchPrevRadioStationWith0On9() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // Тест на выбор радиостанции по указанию номера в пределах с 0 до 9:
    @Test
    public void shouldSetAnyRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationMore9() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationLess0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextRadioStationWith8On9() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.nextRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextRadioStationWith0On1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.nextRadioStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevRadioStationWith9On8() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.prevRadioStation();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevRadioStationWith1On0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);
        radio.prevRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseAmountRadioStation() {
        Radio radio = new Radio(22);

        radio.setCurrentRadioStationDesiredAmount(21);

        int expected = 21;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextRadioStationDesiredAmount() {
        Radio radio = new Radio(22);

        radio.setCurrentRadioStationDesiredAmount(8);
        radio.nextRadioStationDesiredAmount();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextRadioStationDesiredAmountWith21On0() {
        Radio radio = new Radio(22);

        radio.setCurrentRadioStationDesiredAmount(21);
        radio.nextRadioStationDesiredAmount();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevRadioStationDesiredAmount() {
        Radio radio = new Radio(22);

        radio.setCurrentRadioStationDesiredAmount(11);
        radio.prevRadioStationDesiredAmount();

        int expected = 10;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevRadioStationDesiredAmountWith0On21() {
        Radio radio = new Radio(22);

        radio.setCurrentRadioStationDesiredAmount(0);
        radio.prevRadioStationDesiredAmount();

        int expected = 21;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAnyRadioStationDesiredAmount() {
        Radio radio = new Radio(22);

        radio.setCurrentRadioStationDesiredAmount(12);

        int expected = 12;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationDesiredAmountMore21() {
        Radio radio = new Radio(22);

        radio.setCurrentRadioStationDesiredAmount(22);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationDesiredAmountLess0() {
        Radio radio = new Radio(22);

        radio.setCurrentRadioStationDesiredAmount(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextRadioStationDesiredAmountWith20On21() {
        Radio radio = new Radio(22);

        radio.setCurrentRadioStationDesiredAmount(20);
        radio.nextRadioStationDesiredAmount();

        int expected = 21;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextRadioStationDesiredAmountWith0On1() {
        Radio radio = new Radio(22);

        radio.setCurrentRadioStationDesiredAmount(0);
        radio.nextRadioStationDesiredAmount();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevRadioStationDesiredAmountWith21On20() {
        Radio radio = new Radio(22);

        radio.setCurrentRadioStationDesiredAmount(21);
        radio.prevRadioStationDesiredAmount();

        int expected = 20;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevRadioStationDesiredAmountWith1On0() {
        Radio radio = new Radio(22);

        radio.setCurrentRadioStationDesiredAmount(1);
        radio.prevRadioStationDesiredAmount();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

}