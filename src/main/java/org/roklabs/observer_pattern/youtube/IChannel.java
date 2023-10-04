package org.roklabs.observer_pattern.youtube;

import java.util.Set;

public interface IChannel {
    void add(ISubscriber subscriber);

    void remove(ISubscriber subscriber);

    void alert();

    String getChannelName();

    Set<String> getYoutubeVideos();

    String getLatestVideo();

    void uploadVideo(String videoName);
}
