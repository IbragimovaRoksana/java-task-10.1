package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    int quantityStation = 15;
    Radio myCustomizeRadio = new Radio(quantityStation);
    Radio myRadio = new Radio();

    @Test
    void shouldSetQuantityStation() {
        assertEquals(quantityStation, myCustomizeRadio.getQuantityStation());
        assertEquals(0, myCustomizeRadio.getCurrentStation());
        assertEquals(0, myCustomizeRadio.getVolume());
    }

    @Test
    void shouldSetDefaultSets() {
        assertEquals(10, myRadio.getQuantityStation());
        assertEquals(0, myRadio.getCurrentStation());
        assertEquals(0, myRadio.getVolume());
    }

    @Test
    void shouldCheckOverLimitCustomizeStation() {
        myCustomizeRadio.setCurrentStation(quantityStation - 1);
        myCustomizeRadio.upCurrentStation();
        assertEquals(0, myCustomizeRadio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStation() {
        myRadio.setCurrentStation(5);
        int setStation = myRadio.getCurrentStation();
        System.out.println("Номер станции:" + setStation);
        assertEquals(5, setStation);
    }

    @Test
    void shouldCheckOverLimit() {
        myRadio.setCurrentStation(10);
        int setStation = myRadio.getCurrentStation();
        System.out.println("Номер станции:" + setStation);
        assertEquals(0, setStation);
    }

    @Test
    void shouldCheckUnderLimit() {
        myRadio.setCurrentStation(-1);
        int setStation = myRadio.getCurrentStation();
        System.out.println("Номер станции:" + setStation);
        assertEquals(0, setStation);
    }

    @Test
    void shouldUpCurrentStation() {
        myRadio.setCurrentStation(5);
        int currentStation;
        myRadio.upCurrentStation();
        currentStation = myRadio.getCurrentStation();
        System.out.println("Номер станции:" + currentStation);
        assertEquals(6, currentStation);
    }

    @Test
    void shouldUpCurrentStationToZero() {
        myRadio.setCurrentStation(9);
        int currentStation;
        myRadio.upCurrentStation();
        currentStation = myRadio.getCurrentStation();
        System.out.println("Номер станции:" + currentStation);
        assertEquals(0, currentStation);
    }

    @Test
    void shouldDownCurrentStation() {
        myRadio.setCurrentStation(5);
        int currentStation;
        myRadio.downCurrentStation();
        currentStation = myRadio.getCurrentStation();
        System.out.println("Номер станции:" + currentStation);
        assertEquals(4, currentStation);
    }

    @Test
    void shouldDownCurrentStationToNine() {
        myRadio.setCurrentStation(0);
        int currentStation;
        myRadio.downCurrentStation();
        currentStation = myRadio.getCurrentStation();
        System.out.println("Номер станции:" + currentStation);
        assertEquals(9, currentStation);
    }

    @Test
    void shouldUpVolume() {
        myRadio.setVolume(5);
        int volume;
        myRadio.upVolume();
        volume = myRadio.getVolume();
        System.out.println("Громкость:" + volume);
        assertEquals(6, volume);
    }

    @Test
    void shouldHoldVolumeAtHundred() {
        myRadio.setVolume(100);
        int volume;
        myRadio.upVolume();
        volume = myRadio.getVolume();
        System.out.println("Громкость:" + volume);
        assertEquals(100, volume);
    }

    @Test
    void shouldDownVolume() {
        myRadio.setVolume(10);
        int volume;
        myRadio.downVolume();
        volume = myRadio.getVolume();
        System.out.println("Громкость:" + volume);
        assertEquals(9, volume);
    }

    @Test
    void shouldHoldVolumeAtZero() {
        myRadio.setVolume(0);
        int volume;
        myRadio.downVolume();
        volume = myRadio.getVolume();
        System.out.println("Громкость:" + volume);
        assertEquals(0, volume);
    }

}