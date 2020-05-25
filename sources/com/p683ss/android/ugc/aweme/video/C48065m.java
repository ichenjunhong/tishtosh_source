package com.p683ss.android.ugc.aweme.video;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.common.util.NetworkUtils.C18911h;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;

/* renamed from: com.ss.android.ugc.aweme.video.m */
public class C48065m {

    /* renamed from: d */
    private static final String f120785d = "m";

    /* renamed from: e */
    private static C48065m f120786e;

    /* renamed from: a */
    public int f120787a = DynamicTabYellowPointVersion.DEFAULT;

    /* renamed from: b */
    public TelephonyManager f120788b;

    /* renamed from: c */
    public PhoneStateListener f120789c;

    private C48065m(Context context) {
        if (context != null) {
            this.f120788b = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
        }
    }

    /* renamed from: a */
    public static synchronized C48065m m104081a(Context context) {
        C48065m mVar;
        synchronized (C48065m.class) {
            if (f120786e == null) {
                f120786e = new C48065m(context);
            }
            mVar = f120786e;
        }
        return mVar;
    }

    /* renamed from: b */
    public final int mo95336b(Context context) {
        try {
            if (NetworkUtils.getNetworkType(context) == C18911h.WIFI) {
                WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
                if (connectionInfo != null) {
                    this.f120787a = connectionInfo.getRssi();
                }
            }
        } catch (Exception unused) {
        }
        return this.f120787a;
    }
}
