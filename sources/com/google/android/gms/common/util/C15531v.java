package com.google.android.gms.common.util;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.common.util.v */
public final class C15531v {

    /* renamed from: a */
    private static final IntentFilter f40009a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: b */
    private static long f40010b;

    /* renamed from: c */
    private static float f40011c = Float.NaN;

    /* renamed from: a */
    public static int m32324a(Context context) {
        int i;
        boolean z;
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, f40009a);
        int i2 = 0;
        if (registerReceiver == null) {
            i = 0;
        } else {
            i = registerReceiver.getIntExtra("plugged", 0);
        }
        int i3 = (i & 7) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        if (C15524o.m32298f()) {
            z = powerManager.isInteractive();
        } else {
            z = powerManager.isScreenOn();
        }
        if (z) {
            i2 = 1;
        }
        return (i2 << 1) | i3;
    }

    /* renamed from: b */
    public static synchronized float m32325b(Context context) {
        synchronized (C15531v.class) {
            if (SystemClock.elapsedRealtime() - f40010b >= 60000 || Float.isNaN(f40011c)) {
                Intent registerReceiver = context.getApplicationContext().registerReceiver(null, f40009a);
                if (registerReceiver != null) {
                    f40011c = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
                }
                f40010b = SystemClock.elapsedRealtime();
                float f = f40011c;
                return f;
            }
            float f2 = f40011c;
            return f2;
        }
    }
}
