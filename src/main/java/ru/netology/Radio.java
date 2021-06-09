package ru.netology;

public class Radio {
    int NUMBER_MAX = 9;
    int NUMBER_MIN = 0;
    int VOLUME_MAX = 10;
    int VOLUME_MIN = 0;

    int number=NUMBER_MIN;
    int volume=VOLUME_MIN;
    boolean on=false;

    public void setNumber(int number) {
        if (number >= NUMBER_MIN && number <= NUMBER_MAX)
            this.number = number;
    }

    public void setNumberNext() {
        if (number == NUMBER_MAX) {
            number = NUMBER_MIN;
        } else {
            number = number + 1;
        }
    }

    public void setNumberPrev() {
        if (number == NUMBER_MIN) {
            number = NUMBER_MAX;
        } else {
            number = number - 1;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setVolumePlus() {
        if (volume < VOLUME_MAX) {
            volume = volume + 1;
        }
    }

    public void setVolumeMinus() {
        if (volume > VOLUME_MIN) {
            volume = volume - 1;
        }
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
