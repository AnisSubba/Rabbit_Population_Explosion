package com.spartaglobal.rabbitpopulationexplosion;

import java.util.Timer;
import java.util.TimerTask;

public class GlobalTimer {
    private int seconds;
    private Timer timer = new Timer();

    public GlobalTimer(int seconds){
        this.seconds = seconds;
        timer.schedule(new GlobalTask(), 1,1000);
    }

    class GlobalTask extends TimerTask{

        @Override
        public void run() {
            if (seconds > 0){
                System.out.println(seconds);
                seconds--;
            }else{
                timer.cancel();
            }
        }
    }
}
