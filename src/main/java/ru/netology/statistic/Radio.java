package ru.netology.statistic;

public class Radio {
    private int wave;
    private int volume;

    public void next() {
        if (wave != 9) {
            wave++;
        } else {
            wave = 0;
        }
    }

    public void prev() {
        if (wave != 0) {
            wave--;
        } else {
            wave = 9;
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
        if (wave > 9) {
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
