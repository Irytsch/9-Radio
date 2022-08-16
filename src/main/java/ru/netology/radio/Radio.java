package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void switchToTheNextStation() {
        if (currentRadioStation >= 9) {
            setCurrentRadioStation(0);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void switchToThePrevStation() {
        if (currentRadioStation <= 0) {
            setCurrentRadioStation(9);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}