package com.bytedance.sdk.account.p878m;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.bytedance.sdk.account.m.c */
public final class C13210c {
    /* renamed from: a */
    public static boolean m26593a(Context context) {
        try {
            NetworkInfo a = C13211d.m26594a((ConnectivityManager) context.getSystemService("connectivity"));
            if (a == null || !a.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
