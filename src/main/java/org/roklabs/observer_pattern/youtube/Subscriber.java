package org.roklabs.observer_pattern.youtube;

public class Subscriber implements ISubscriber {
    private String name;
    private final IChannel channel;

    public Subscriber(IChannel channel, String name) {
        this.channel = channel;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("A new video has been published by channel: " + this.channel.getChannelName());
//        System.out.println("Title of video: ");
        System.out.println(this.getName() + " has gotten a notification.");
    }
}
