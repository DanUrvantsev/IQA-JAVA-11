package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "-1,0",
            "0,0",
            "1,1",
            "8,8",
            "9,9",
            "10,0",
    })
    public void testSetWaveRadio(int wave, int expected) {
        Radio radio = new Radio();
        radio.setWave(wave);

        int actual = radio.getWave();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "-1,0",
            "0,0",
            "1,1",
            "99,99",
            "100,100",
            "101,0",
    })
    public void testSetVolumeRadio(int vol, int expected) {
        Radio radio = new Radio();
        radio.setVolume(vol);

        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "8,9",
            "4,5",
            "9,0",
    })
    public void testSetNextRadio(int stantion, int expected) {
        Radio radio = new Radio();
        radio.setWave(stantion);

        radio.next();

        int actual = radio.getWave();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,9",
            "1,0",
            "5,4",
            "9,8",
    })
    public void testSetPrevRadio(int stantion, int expected) {
        Radio radio = new Radio();
        radio.setWave(stantion);

        radio.prev();

        int actual = radio.getWave();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "99,100",
            "0,1",
            "50,51",
            "100,100",
    })
    public void testSetVolumUpRadio(int vol, int expected) {
        Radio radio = new Radio();
        radio.setVolume(vol);

        radio.volumeUp();

        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "100,99",
            "0,0",
            "50,49",
            "1,0",
    })
    public void testSetVolumDownRadio(int vol, int expected) {
        Radio radio = new Radio();
        radio.setVolume(vol);

        radio.volumeDown();

        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }


//    @Test
//    public void testSetWaveValidValue_1() {
//        Radio radio = new Radio();
//        radio.setWave(1);
//
//        int expected = 1;
//        int actual = radio.getWave();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testSetWaveInvalidValueNegative() {
//        Radio radio = new Radio();
//        radio.setWave(-1);
//
//        int expected = 0;
//        int actual = radio.getWave();
//
//        assertEquals(expected, actual);
//    }
//    @Test
//    public void testSetWaveValidValue_0() {
//        Radio radio = new Radio();
//        radio.setWave(0);
//
//        int expected = 0;
//        int actual = radio.getWave();
//
//        assertEquals(expected, actual);
//    }
//    @Test
//    public void testSetWaveValidValue_9() {
//        Radio radio = new Radio();
//        radio.setWave(9);
//
//        int expected = 9;
//        int actual = radio.getWave();
//
//        assertEquals(expected, actual);
//    }
//    @Test
//    public void testSetWaveInvalidValue_10() {
//        Radio radio = new Radio();
//        radio.setWave(10);
//
//        int expected = 0;
//        int actual = radio.getWave();
//
//        assertEquals(expected, actual);
//    }
//    @Test
//    public void testSetWaveValidValue_8() {
//        Radio radio = new Radio();
//        radio.setWave(8);
//
//        int expected = 8;
//        int actual = radio.getWave();
//
//        assertEquals(expected, actual);
//    }
}