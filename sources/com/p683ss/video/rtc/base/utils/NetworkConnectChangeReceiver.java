package com.p683ss.video.rtc.base.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.p683ss.video.rtc.base.utils.NetworkUtils.NetworkType;
import com.p683ss.video.rtc.engine.LogReport;
import com.p683ss.video.rtc.engine.RtcEngineImpl.C51644RtcEngineImpl;
import com.p683ss.video.rtc.engine.utils.LogUtil;

/* renamed from: com.ss.video.rtc.base.utils.NetworkConnectChangeReceiver */
public class NetworkConnectChangeReceiver extends BroadcastReceiver {
    private NetworkType sNetworkType = NetworkType.UNKNOWN;

    private int getConstantNetworkType(NetworkType networkType) {
        if (!networkType.isAvailable()) {
            return 0;
        }
        return getType(networkType);
    }

    private int getType(NetworkType networkType) {
        switch (networkType) {
            case MOBILE:
                return 1;
            case WIFI:
                return 2;
            case MOBILE_2G:
                return 3;
            case MOBILE_3G:
                return 4;
            case MOBILE_4G:
                return 5;
            default:
                return -1;
        }
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || "android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction()) || "android.net.wifi.STATE_CHANGE".equals(intent.getAction())) {
            NetworkType networkType = NetworkUtils.getNetworkType(context);
            StringBuilder sb = new StringBuilder("this: ");
            sb.append(hashCode());
            sb.append(" before: ");
            sb.append(this.sNetworkType);
            sb.append(" now: ");
            sb.append(networkType);
            LogUtil.m110864d("NetworkConnectChangeReceiver", sb.toString());
            if (this.sNetworkType != networkType) {
                int constantNetworkType = getConstantNetworkType(networkType);
                try {
                    if (C51644RtcEngineImpl.getRtcEngineHandler() != null) {
                        C51644RtcEngineImpl.getRtcEngineHandler().onNetworkTypeChanged(constantNetworkType);
                        LogReport instance = LogReport.instance();
                        StringBuilder sb2 = new StringBuilder("{type:");
                        sb2.append(constantNetworkType);
                        sb2.append("}");
                        instance.sdkAPICallBack(0, sb2.toString(), "onNetworkTypeChanged");
                    }
                } catch (Exception e) {
                    StringBuilder sb3 = new StringBuilder("onNetworkTypeChanged callback catch exception.\n");
                    sb3.append(e.getMessage());
                    LogUtil.m110868w("NetworkConnectChangeReceiver", sb3.toString());
                }
            }
            this.sNetworkType = networkType;
        }
    }
}
