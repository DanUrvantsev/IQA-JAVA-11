package ru.netology.statistic;

public class Radio {
    private int wave;
    private int volume;
    private int maxStantion;

    public Radio(){
        this.maxStantion = 35;
    }

    public Radio(int stantionsCount){
        this.maxStantion = stantionsCount-1;
    }

    public void next() {
        if (wave != maxStantion) {
            wave++;
        } else {
            wave = 0;
        }
    }

    public void prev() {
        if (wave != 0) {
            wave--;
        } else {
            wave = maxStantion;
        }
    }

    public void volumeUp() {
        if (volume < 100) {
            volume++;
        }
    }

    public void volumeDown() {
        if (volume > 0) {
            volume--;
        }
    }

    public int getWave() {
        return wave;
    }

    public void setWave(int wave) {
        if (wave < 0) {
            return;
        }
        if (wave > maxStantion) {
            return;
        }
        this.wave = wave;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 100) {
            return;
        }
        this.volume = volume;
    }
}
