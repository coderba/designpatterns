package org.designpatterns.structural.proxy.example2;

public class RealVideoService implements VideoService {
    @Override
    public String getVideo(String videoId) {
        // Simulate expensive operation
        System.out.println("Fetching video from remote server: " + videoId);
        return "VideoContent{" + videoId + "}";
    }
}
