package org.roklabs.observer_pattern.youtube;

public class Main {
    public static void main(String[] args) {
        // channels
        IChannel gabeCodes = new YoutubeChannel("Gabe Codes");

        // subscribers
        ISubscriber gabrielRockson = new Subscriber(gabeCodes, "Gabriel Rockson");
        ISubscriber melindaAmpahKorsah = new Subscriber(gabeCodes, "Melinda Ampah Korsah");
        ISubscriber anastasiaFafaAdzraku = new Subscriber(gabeCodes, "Anastasia Fafa Adzraku");

        // subscribe to the channel
        gabeCodes.add(gabrielRockson);
        gabeCodes.add(melindaAmpahKorsah);
        gabeCodes.add(anastasiaFafaAdzraku);

        // upload a video
        gabeCodes.uploadVideo("How to train your dragon");

        // upload another video
        gabeCodes.uploadVideo("How to become a Java Guru");
    }
}
