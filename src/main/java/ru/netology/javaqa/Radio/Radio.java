package ru.netology.javaqa.Radio;

public class Radio {

    private int currentStation;
    private int currentVolume;


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation != 9) {
            currentStation++;
            return;
        } else {
            currentStation = 0;
            return;
        }
    }

    public void prevStation() {
        if (currentStation != 0) {
            currentStation--;
            return;

        } else {
            currentStation = 9;
            return;
        }
    }

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
}



