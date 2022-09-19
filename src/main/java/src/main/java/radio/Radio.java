package src.main.java.radio;

public class Radio {

    private int currentRadioStation;
    private int soundVolume;


    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getSoundVolume() {

        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 10) {
            return;
        }

        soundVolume = newSoundVolume;
    }

    public void IncreaseSoundVolume() {
        if (soundVolume < 10) {
            soundVolume = soundVolume + 1;
        }

    }

    public void decreaseSoundVolume() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }

    }

    public int nextRadioStation() {
        if (currentRadioStation < 9) {
            return currentRadioStation = currentRadioStation + 1;

        } else {
            return currentRadioStation = 0;

        }

    }

    public int prevRadioStation() {
        if (currentRadioStation > 0) {
            return currentRadioStation = currentRadioStation - 1;

        } else {
            return currentRadioStation = 9;
        }

    }

}
//