package com.p683ss.p2568f.p2569a.p2572c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.ss.f.a.c.d */
public final class C51326d {
    /* renamed from: a */
    public static NetworkInfo m110386a(Context context) {
        try {
            return C51327e.m110387a((ConnectivityManager) context.getSystemService("connectivity"));
        } catch (Throwable unused) {
            return null;
        }
    }
}
