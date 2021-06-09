package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void shouldSetNumber() {
        Radio radio = new Radio();
        int number;

        number = radio.NUMBER_MIN;
        radio.setNumber(number);
        assertEquals(number, radio.getNumber());

        number = radio.NUMBER_MIN + 1;
        radio.setNumber(number);
        assertEquals(number, radio.getNumber());

        number = radio.NUMBER_MAX;
        radio.setNumber(number);
        assertEquals(number, radio.getNumber());

        int numberCurrent;
        numberCurrent = radio.getNumber();
        number = radio.NUMBER_MIN-1;
        radio.setNumber(number);
        assertEquals(numberCurrent, radio.getNumber());

        numberCurrent = radio.getNumber();
        number = radio.NUMBER_MAX+1;
        radio.setNumber(number);
        assertEquals(numberCurrent, radio.getNumber());

    }

    @Test
    public void shouldSetNumberNext() {
        Radio radio = new Radio();
        int number;

        number = radio.NUMBER_MIN;
        radio.setNumber(number);
        radio.setNumberNext();
        assertEquals(number + 1, radio.getNumber());

        number = radio.NUMBER_MIN + 1;
        radio.setNumber(number);
        radio.setNumberNext();
        assertEquals(number + 1, radio.getNumber());

        number = radio.NUMBER_MAX;
        radio.setNumber(number);
        radio.setNumberNext();
        assertEquals(radio.NUMBER_MIN, radio.getNumber());
    }

    @Test
    public void shouldSetNumberPrev() {
        Radio radio = new Radio();
        int number;

        number = radio.NUMBER_MIN;
        radio.setNumber(number);
        radio.setNumberPrev();
        assertEquals(radio.NUMBER_MAX, radio.getNumber());

        number = radio.NUMBER_MIN + 1;
        radio.setNumber(number);
        radio.setNumberPrev();
        assertEquals(number - 1, radio.getNumber());

        number = radio.NUMBER_MAX;
        radio.setNumber(number);
        radio.setNumberPrev();
        assertEquals(number - 1, radio.getNumber());
    }

    @Test
    public void shouldSetVolumePlus() {
        Radio radio = new Radio();
        int volume;

        radio.volume = radio.VOLUME_MIN;
        radio.setVolumePlus();
        assertEquals(radio.VOLUME_MIN + 1, radio.getVolume());

        radio.volume = radio.VOLUME_MIN + 1;
        radio.setVolumePlus();
        assertEquals(radio.VOLUME_MIN + 2, radio.getVolume());

        radio.volume = radio.VOLUME_MAX;
        radio.setVolumePlus();
        assertEquals(radio.VOLUME_MAX, radio.getVolume());
    }

    @Test
    public void shouldSetVolumeMinus() {
        Radio radio = new Radio();
        int volume;

        radio.volume = radio.VOLUME_MIN;
        radio.setVolumeMinus();
        assertEquals(radio.VOLUME_MIN, radio.getVolume());

        radio.volume = radio.VOLUME_MIN + 1;
        radio.setVolumeMinus();
        assertEquals(radio.VOLUME_MIN, radio.getVolume());

        radio.volume = radio.VOLUME_MAX;
        radio.setVolumeMinus();
        assertEquals(radio.VOLUME_MAX - 1, radio.getVolume());
    }

    @Test
    public void shouldIsOn() {
        Radio radio = new Radio();

        radio.setOn(true);
        assertEquals(true, radio.isOn());

        radio.setOn(false);
        assertEquals(false, radio.isOn());
    }

    @Test
    public void shouldSetOn() {
        Radio radio = new Radio();

        radio.setOn(true);
        assertEquals(true, radio.isOn());

        radio.setOn(false);
        assertEquals(false, radio.isOn());

    }
}