package ru.netology.radio;


public class Radio {
    private int quantityStation = 10;
    private int currentStation;
    private int volume;

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public Radio() {
    }

    public void setCurrentStation(int Station) {
        if (Station > quantityStation - 1 || Station < 0)
            return;
        currentStation = Station;
    }

    public void upCurrentStation() {
        currentStation++;
        if (currentStation > quantityStation - 1)
            currentStation = 0;
    }

    public void downCurrentStation() {
        currentStation--;
        if (currentStation < 0)
            currentStation = quantityStation - 1;
    }

    public void upVolume() {
        volume++;
        if (volume > 100)
            volume = 100;
    }

    public void downVolume() {
        volume--;
        if (volume < 0)
            volume = 0;
    }

    public int getQuantityStation() {
        return quantityStation;
    }

    public void setQuantityStation(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
