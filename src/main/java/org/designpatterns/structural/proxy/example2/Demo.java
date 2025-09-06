package org.designpatterns.structural.proxy.example2;

public class Demo {
    public static void main(String[] args) {
        VideoService videoService = new VideoServiceProxy();

        System.out.println(videoService.getVideo("abc123"));
        System.out.println(videoService.getVideo("xyz789"));
        System.out.println(videoService.getVideo("abc123")); // should come from cache
    }
}
