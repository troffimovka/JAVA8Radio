package ru.netology.constructor;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    public RadioTest() {
    }

    @Test
    void shouldSetStationWithinRange() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentStation(8);
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationOverRange() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentStation(99);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationBelowRange() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void shouldGoNextStationBeforeMaximum() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentStation(5);
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void shouldGoNextStationAfterMaximum() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldGoPrevStationBeforeMinimum() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentStation(5);
        radio.previousStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void shouldGoPreviousStationAfterMinimum() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentStation(0);
        radio.previousStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldSetVolumeWithinRange() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentVolume(8);
        assertEquals(8, radio.getCurrentVolume());
    }

    @Test
    void shouldSetVolumeOutOfRange() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentVolume(867);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeWithingRange() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeOutofRange() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeWithingRange() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeOutofRange() {
        ru.netology.domain.Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}