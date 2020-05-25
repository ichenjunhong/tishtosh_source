package com.p683ss.android.download;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;
import com.p683ss.android.ugc.aweme.settings2.ShowStorageDotSizeSettings;

/* renamed from: com.ss.android.download.r */
final class C19133r implements C19138v {

    /* renamed from: b */
    private static C19133r f52728b;

    /* renamed from: a */
    private Context f52729a;

    /* renamed from: a */
    public final long mo39070a() {
        return System.currentTimeMillis();
    }

    /* renamed from: d */
    public final Long mo39074d() {
        Context context = this.f52729a;
        return Long.valueOf(2147483648L);
    }

    /* renamed from: e */
    public final Long mo39075e() {
        Context context = this.f52729a;
        return Long.valueOf(ShowStorageDotSizeSettings.DEFAULT);
    }

    /* renamed from: b */
    public final NetworkInfo mo39072b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f52729a.getSystemService("connectivity");
        if (connectivityManager == null) {
            return null;
        }
        return C19134s.m46647a(connectivityManager);
    }

    /* renamed from: c */
    public final boolean mo39073c() {
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f52729a.getSystemService("connectivity");
        boolean z2 = false;
        if (connectivityManager == null) {
            return false;
        }
        NetworkInfo a = C19134s.m46647a(connectivityManager);
        if (a == null || a.getType() != 0) {
            z = false;
        } else {
            z = true;
        }
        TelephonyManager telephonyManager = (TelephonyManager) this.f52729a.getSystemService("phone");
        if (z && telephonyManager.isNetworkRoaming()) {
            z2 = true;
        }
        return z2;
    }

    private C19133r(Context context) {
        this.f52729a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static synchronized C19133r m46640a(Context context) {
        C19133r rVar;
        synchronized (C19133r.class) {
            if (f52728b == null) {
                f52728b = new C19133r(context);
            }
            rVar = f52728b;
        }
        return rVar;
    }

    /* renamed from: a */
    public final void mo39071a(Intent intent) {
        try {
            intent.setClass(this.f52729a, DownloadHandlerService.class);
            Context context = this.f52729a;
            if (context == null || !(context instanceof Context) || !C40895d.m90464a(context, intent)) {
                context.startService(intent);
            }
        } catch (Exception unused) {
        }
    }
}
