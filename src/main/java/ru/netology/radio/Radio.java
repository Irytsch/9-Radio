package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int quantityOfStation;

    public Radio() {
        quantityOfStation = 10;
    }

    public Radio(int quantityOfStation) {
        this.quantityOfStation = quantityOfStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > quantityOfStation - 1) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void switchToTheNextStation() {
        if (currentRadioStation == quantityOfStation - 1) {
            setCurrentRadioStation(0);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void switchToThePrevStation() {
        if (currentRadioStation == 0) {
            setCurrentRadioStation(quantityOfStation - 1);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}