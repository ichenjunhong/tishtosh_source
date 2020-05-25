package com.bytedance.ies.geckoclient.p686e;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lancet.p1151a.C18970b;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18978d;

/* renamed from: com.bytedance.ies.geckoclient.e.e */
final class C10940e {
    /* renamed from: a */
    static ApplicationInfo m22201a(PackageManager packageManager, String str, int i) throws NameNotFoundException {
        if (!TextUtils.equals(str, C11010c.m22280a().getPackageName()) || i != 128) {
            return packageManager.getApplicationInfo(str, i);
        }
        if (C18970b.f52271a == null) {
            C18970b.f52271a = packageManager.getApplicationInfo(str, i);
        }
        return C18970b.f52271a;
    }

    /* renamed from: a */
    static NetworkInfo m22202a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            return C18978d.m46154a();
        }
    }

    /* renamed from: a */
    static NetworkInfo m22203a(ConnectivityManager connectivityManager, int i) {
        try {
            return connectivityManager.getNetworkInfo(1);
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            return C18978d.m46154a();
        }
    }
}
