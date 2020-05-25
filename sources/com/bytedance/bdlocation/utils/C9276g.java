package com.bytedance.bdlocation.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.p683ss.p2544b.p2545a.C51151a;

/* renamed from: com.bytedance.bdlocation.utils.g */
public final class C9276g {
    /* renamed from: a */
    public static WifiInfo m18394a(Context context) {
        if (context != null && m18395b(context)) {
            try {
                WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
                if (C9277h.m18397a((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity"), 1).getState() == State.CONNECTED && connectionInfo.getSSID() != null) {
                    return connectionInfo;
                }
            } catch (Throwable th) {
                C51151a.m110020b("BDLocation", th);
            }
        }
        return null;
    }

    /* renamed from: b */
    private static boolean m18395b(Context context) {
        try {
            NetworkInfo a = C9277h.m18396a((ConnectivityManager) context.getSystemService("connectivity"));
            if (a != null) {
                if (a.isAvailable()) {
                    if (1 == a.getType()) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
