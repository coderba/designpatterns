package org.designpatterns.structural.proxy.example2;

//Imagine we have a VideoService that fetches videos. Fetching is expensive (network or disk). We’ll create a proxy that:
//Caches results (performance)
//Logs access (monitoring)
public interface VideoService {
    String getVideo(String id);
}
