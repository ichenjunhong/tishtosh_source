package com.p683ss.android.ugc.aweme.shortvideo.senor;

import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Build.VERSION;
import android.os.SystemClock;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.senor.a */
public abstract class C44510a implements SensorEventListener {

    /* renamed from: a */
    public boolean f112621a;

    public C44510a(boolean z) {
        this.f112621a = z;
    }

    /* renamed from: a */
    protected static double m97398a(SensorEvent sensorEvent) {
        return m97399a(Long.valueOf(sensorEvent.timestamp));
    }

    /* renamed from: a */
    public static double m97399a(Long l) {
        long j;
        long nanoTime = System.nanoTime();
        long abs = Math.abs(nanoTime - l.longValue());
        if (VERSION.SDK_INT >= 17) {
            j = Math.abs(SystemClock.elapsedRealtimeNanos() - l.longValue());
        } else {
            j = Long.MAX_VALUE;
        }
        return (double) (nanoTime - Math.min(Math.min(abs, j), Math.abs((SystemClock.uptimeMillis() * 1000000) - l.longValue())));
    }
}
