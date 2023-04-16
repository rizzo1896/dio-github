package Tv;

public class SmartTv {
    boolean isOn = false;
    int currentChannel = 1;
    int currentVolume = 25;

    public void turnUpVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void setChannel(int newChannel) {
        if (newChannel >= 1 && newChannel <= 120) {
            currentChannel = newChannel;
        }
    }

    public void nextChannel() {
        if (currentChannel < 120) {
            currentChannel++;
        } else {
            currentChannel = 1;
        }
    }

    public void previousChannel() {
        if (currentChannel > 1) {
            currentChannel--;
        } else {
            currentChannel = 120;
        }
    }
}
