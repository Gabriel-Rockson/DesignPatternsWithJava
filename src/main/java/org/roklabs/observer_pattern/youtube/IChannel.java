package org.roklabs.observer_pattern.youtube;

public interface IChannel {
    void add(ISubscriber subscriber);

    void remove(ISubscriber subscriber);

    void alert();
}
