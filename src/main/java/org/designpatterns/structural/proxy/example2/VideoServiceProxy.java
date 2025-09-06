package org.designpatterns.structural.proxy.example2;

import java.util.HashMap;
import java.util.Map;

public class VideoServiceProxy implements VideoService{
    private final RealVideoService realVideoService = new RealVideoService();
    private final Map<String, String> cache = new HashMap<>();

    @Override
    public String getVideo(String videoId) {
        System.out.println("Proxy: Checking cache for video " + videoId);
        if (cache.containsKey(videoId)) {
            System.out.println("Proxy: Returning cached video " + videoId);
            return cache.get(videoId);
        }

        String video = realVideoService.getVideo(videoId);
        cache.put(videoId, video);
        return video;
    }
}
