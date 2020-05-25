package com.bytedance.geckox.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.telephony.TelephonyManager;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;

/* renamed from: com.bytedance.geckox.utils.j */
public final class C10162j {
    /* renamed from: a */
    public static String m20488a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return "unknow";
            }
            NetworkInfo a = C10163k.m20489a(connectivityManager);
            if (a != null) {
                if (a.isAvailable()) {
                    NetworkInfo a2 = C10163k.m20490a(connectivityManager, 1);
                    if (a2 != null) {
                        State state = a2.getState();
                        if (state != null && (state == State.CONNECTED || state == State.CONNECTING)) {
                            return "WIFI";
                        }
                    }
                    switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return "2G";
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return "3G";
                        case 13:
                            return "4G";
                        default:
                            return "unknow";
                    }
                }
            }
            return "unknow";
        } catch (Throwable unused) {
            return TEVideoRecorder.FACE_BEAUTY_NULL;
        }
    }
}
