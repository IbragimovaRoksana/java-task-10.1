package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Radio {
    private int quantityStation = 10;
    private int currentStation;
    private int volume;

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
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

}
