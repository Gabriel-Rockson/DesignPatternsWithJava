package org.roklabs.observer_pattern.youtube;

import java.util.HashSet;
import java.util.Set;

public class YoutubeChannel implements IChannel {
    private String channelName;
    private Set<ISubscriber> subscribers = new HashSet<>();

    public YoutubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void add(ISubscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void remove(ISubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void alert() {
        for (ISubscriber subscriber : subscribers) {
            subscriber.update();
        }
    }

    public Set<ISubscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(Set<ISubscriber> subscribers) {
        this.subscribers = subscribers;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
}
