package com.zego.zegoavkit2.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18978d;

public class NetworkStateChangeReceiver2 extends BroadcastReceiver {
    private Context mContext;
    private long mThis;

    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo */
        static NetworkInfo m112000xea89a0b0(ConnectivityManager connectivityManager) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
                return C18978d.m46154a();
            }
        }
    }

    static native void onNetTypeChanged(long j, int i, String str);

    public int uninit() {
        if (this.mContext == null) {
            return -1;
        }
        this.mContext.unregisterReceiver(this);
        this.mContext = null;
        return 0;
    }

    public void setThis(long j) {
        this.mThis = j;
    }

    public int init(Context context) {
        this.mContext = context;
        if (this.mContext == null) {
            return -1;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.mContext.registerReceiver(this, intentFilter);
        onReceive(null, null);
        return 0;
    }

    public void onReceive(Context context, Intent intent) {
        if (this.mContext != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.mContext.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            if (connectivityManager != null) {
                networkInfo = _lancet.m112000xea89a0b0(connectivityManager);
            }
            String str = "";
            int i = 32;
            if (networkInfo == null) {
                i = 0;
            } else {
                str = networkInfo.toString();
                int type = networkInfo.getType();
                if (type != 9) {
                    switch (type) {
                        case 0:
                            switch (networkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                case 4:
                                case 7:
                                case 11:
                                    i = 3;
                                    break;
                                case 3:
                                case 5:
                                case 6:
                                case 8:
                                case 9:
                                case 10:
                                case 12:
                                case 14:
                                case 15:
                                    i = 4;
                                    break;
                                case 13:
                                    i = 5;
                                    break;
                            }
                        case 1:
                            i = 2;
                            break;
                    }
                } else {
                    i = 1;
                }
            }
            onNetTypeChanged(this.mThis, i, str);
        }
    }
}
