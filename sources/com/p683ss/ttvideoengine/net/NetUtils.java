package com.p683ss.ttvideoengine.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18978d;

/* renamed from: com.ss.ttvideoengine.net.NetUtils */
public class NetUtils {
    public static long netUpdateTimeMs = -1;
    private static final BroadcastReceiver networkReceiver = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast() && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                NetUtils.netUpdateTimeMs = System.currentTimeMillis();
            }
        }
    };
    public static boolean registerNetworkReceiver;

    /* renamed from: com.ss.ttvideoengine.net.NetUtils$_lancet */
    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo */
        static NetworkInfo m110643xea89a0b0(ConnectivityManager connectivityManager) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
                return C18978d.m46154a();
            }
        }
    }

    public static boolean isNetAvailable(Context context) {
        NetworkInfo networkInfo = getNetworkInfo(context);
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    public static String getNetExtraInfo(Context context) {
        try {
            NetworkInfo networkInfo = getNetworkInfo(context);
            if (networkInfo == null || !networkInfo.isAvailable()) {
                return null;
            }
            return networkInfo.getExtraInfo();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int getNetType(Context context) {
        try {
            NetworkInfo networkInfo = getNetworkInfo(context);
            if (networkInfo == null || !networkInfo.isAvailable()) {
                return -1;
            }
            return networkInfo.getType();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static NetworkInfo getNetworkInfo(Context context) {
        if (context == null) {
            return null;
        }
        try {
            if (!registerNetworkReceiver) {
                synchronized (networkReceiver) {
                    if (!registerNetworkReceiver) {
                        registerNetworkReceiver = true;
                        context.registerReceiver(networkReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    }
                }
            }
            return _lancet.m110643xea89a0b0((ConnectivityManager) context.getSystemService("connectivity"));
        } catch (Throwable unused) {
            return null;
        }
    }
}
