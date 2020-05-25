package com.p683ss.avframework.livestreamv2.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ss.avframework.livestreamv2.utils.TimerTaskUtils */
public class TimerTaskUtils {
    private static Map<String, Timer> mapTasks = new HashMap();

    public static void removeTask(String str) {
        Timer timer = (Timer) mapTasks.get(str);
        if (timer != null) {
            timer.cancel();
            mapTasks.remove(str);
        }
    }

    public static void addTask(final Runnable runnable, int i, String str) {
        removeTask(str);
        Timer timer = new Timer();
        long j = (long) i;
        timer.schedule(new TimerTask() {
            public final void run() {
                runnable.run();
            }
        }, j, j);
        mapTasks.put(str, timer);
    }
}
