package com.p683ss.android.ugc.aweme.shortvideo.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.net.b */
public final class C44332b {
    /* renamed from: b */
    public static boolean m97108b(Context context) {
        if (context != null) {
            NetworkInfo a = C44333c.m97110a((ConnectivityManager) context.getSystemService("connectivity"), 1);
            if (a != null) {
                return a.isAvailable();
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m97107a(Context context) {
        NetworkInfo[] allNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getAllNetworkInfo();
        if (allNetworkInfo != null) {
            for (NetworkInfo state : allNetworkInfo) {
                if (state.getState() == State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }
}
