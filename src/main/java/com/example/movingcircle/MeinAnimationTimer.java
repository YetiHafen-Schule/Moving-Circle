package com.example.movingcircle;

import javafx.animation.AnimationTimer;
import javafx.scene.shape.Circle;

public class MeinAnimationTimer extends AnimationTimer {

    private static final long INTERVAL = 10_000_000L;

    private Circle circle;
    private long lastCall = System.nanoTime();


    public MeinAnimationTimer(Circle circle) {
        this.circle = circle;
    }

    @Override
    public void handle(long now) {
        if(now > lastCall + INTERVAL) {
            double pos = circle.getTranslateX();
            if(pos > 250) pos = -250;
            this.circle.setTranslateX(pos + 1);
            lastCall = now;
        }
    }
}
