package com.facebook.p909a.p910a;

import android.hardware.SensorManager;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.a.a.b */
public final class C13524b {

    /* renamed from: a */
    public static final C13540f f35302a = new C13540f();

    /* renamed from: b */
    public static SensorManager f35303b;

    /* renamed from: c */
    public static C13534e f35304c;

    /* renamed from: d */
    public static String f35305d;

    /* renamed from: e */
    public static final AtomicBoolean f35306e = new AtomicBoolean(true);

    /* renamed from: f */
    public static Boolean f35307f = Boolean.valueOf(false);

    /* renamed from: g */
    public static volatile Boolean f35308g = Boolean.valueOf(false);

    /* renamed from: a */
    static String m27346a() {
        if (f35305d == null) {
            f35305d = UUID.randomUUID().toString();
        }
        return f35305d;
    }
}
