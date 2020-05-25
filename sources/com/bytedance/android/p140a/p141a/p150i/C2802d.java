package com.bytedance.android.p140a.p141a.p150i;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.telephony.TelephonyManager;
import com.bytedance.android.p140a.p141a.C2786e;

/* renamed from: com.bytedance.android.a.a.i.d */
public final class C2802d {
    /* renamed from: a */
    public static boolean m7967a() {
        boolean z = false;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C2786e.m7920d().f8355b.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo a = C2803e.m7969a(connectivityManager);
            if (a != null && a.isConnected()) {
                z = true;
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static int m7968b() {
        if (!m7967a()) {
            return -1;
        }
        Context context = C2786e.m7920d().f8355b;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return -1;
        }
        NetworkInfo a = C2803e.m7970a(connectivityManager, 1);
        if (a != null) {
            State state = a.getState();
            if (state != null && (state == State.CONNECTED || state == State.CONNECTING)) {
                return 0;
            }
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return 1;
        }
        int networkType = telephonyManager.getNetworkType();
        if (networkType == 20) {
            return 5;
        }
        switch (networkType) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 3;
            case 13:
                return 4;
            default:
                return 1;
        }
    }
}
