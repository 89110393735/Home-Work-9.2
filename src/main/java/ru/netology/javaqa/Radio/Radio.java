package ru.netology.javaqa.Radio;

public class Radio {

    private int maxStation;
    private int minStation;
    private int maxVolume;
    private int minVolume;
    private int currentStation;
    private int currentVolume;


    public Radio() {
        this.maxStation = 9;
        this.minStation = 0;
        this.maxVolume = 100;
        this.minVolume = 0;

    }

    public Radio(int stationsCount, int volumeCount) {
        this.maxStation = stationsCount - 1;
        this.minStation = stationsCount + 1;
        this.maxVolume = volumeCount - 1;
        this.minVolume = volumeCount + 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void maxStation() {
        if (currentStation != maxStation) {
            currentStation = minStation;
        } else {
            this.currentStation = this.minStation;
        }
    }

    public void minStation() {
        if (currentStation != minStation) {
            currentStation = maxStation;
        } else {
            this.currentStation = this.maxStation;
        }
    }

    public void prevStation() {
        if (currentStation != minStation) {
            currentStation--;

        } else {
            currentStation = maxStation;
        }
    }

    public void nextVolume() {
        if (currentVolume != minVolume) {
            currentVolume++;
        } else {
            currentVolume = this.minVolume;
        }
    }

    public void prevVolume() {
        if (currentVolume != minVolume) {
            currentVolume--;

        } else {
            this.currentVolume = maxVolume;
        }
    }

    public void maxVolume() {
        if (currentVolume != maxVolume) {
            currentVolume = maxVolume;
            return;
        }
        this.currentVolume = maxVolume;

    }

    public void minVolume() {
        if (currentVolume != minVolume) {
            currentVolume = minVolume;
            return;
        }
       currentVolume = this.minVolume;

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}



