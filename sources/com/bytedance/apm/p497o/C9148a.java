package com.bytedance.apm.p497o;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashSet;

/* renamed from: com.bytedance.apm.o.a */
public final class C9148a {

    /* renamed from: a */
    private static HashSet<HandlerThread> f25062a = new HashSet<>();

    /* renamed from: b */
    private static volatile Handler f25063b = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static Handler m18169a() {
        return f25063b;
    }
}
