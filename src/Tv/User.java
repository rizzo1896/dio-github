package Tv;

public class User {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("Smart TV is on: " + smartTv.isOn);
        System.out.println("Smart TV current channel: " + smartTv.currentChannel);
        System.out.println("Smart TV current volume: " + smartTv.currentVolume);

        smartTv.turnOn();

        System.out.println("Smart TV is on: " + smartTv.isOn);

        smartTv.turnUpVolume();

        System.out.println("Smart TV current volume: " + smartTv.currentVolume);

        smartTv.turnDownVolume();

        System.out.println("Smart TV current volume: " + smartTv.currentVolume);

        smartTv.setChannel(100);

        System.out.println("Smart TV current channel: " + smartTv.currentChannel);
    }
}
