package com.p683ss.p2566d;

import android.content.Context;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build.VERSION;

/* renamed from: com.ss.d.c */
public class C51298c {

    /* renamed from: a */
    private static BatteryManager f128070a;

    /* renamed from: b */
    private static IntentFilter f128071b = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: b */
    public static float m110295b(Context context) {
        return ((float) m110297d(context).getLongProperty(2)) / 1000.0f;
    }

    /* renamed from: c */
    public static long m110296c(Context context) {
        return m110297d(context).getLongProperty(4);
    }

    /* renamed from: a */
    public static float m110294a(Context context) {
        return ((float) context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("voltage", -1)) / 1000.0f;
    }

    /* renamed from: d */
    private static BatteryManager m110297d(Context context) {
        if (f128070a == null) {
            synchronized (C51298c.class) {
                if (f128070a == null) {
                    if (VERSION.SDK_INT < 21) {
                        return null;
                    }
                    f128070a = (BatteryManager) context.getSystemService("batterymanager");
                }
            }
        }
        return f128070a;
    }
}
