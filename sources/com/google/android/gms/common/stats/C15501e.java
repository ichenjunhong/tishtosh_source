package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.C15531v;
import java.util.List;

/* renamed from: com.google.android.gms.common.stats.e */
public final class C15501e {

    /* renamed from: a */
    public static C15501e f39970a = new C15501e();

    /* renamed from: b */
    private static Boolean f39971b;

    /* renamed from: c */
    private static boolean f39972c = false;

    /* renamed from: a */
    public final void mo28516a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
        m32252a(context, str, 8, str2, str3, null, i2, list, 0);
    }

    /* renamed from: a */
    public static void m32252a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list, long j) {
        int i3 = i;
        List<String> list2 = list;
        if (f39971b == null) {
            f39971b = Boolean.valueOf(false);
        }
        if (f39971b.booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                String str5 = "missing wakeLock key. ";
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str5.concat(valueOf);
                } else {
                    new String(str5);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (7 == i3 || 8 == i3 || 10 == i3 || 11 == i3) {
                    if (list2 != null && list.size() == 1 && "com.google.android.gms".equals(list2.get(0))) {
                        list2 = null;
                    }
                    List<String> list3 = list2;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int a = C15531v.m32324a(context);
                    String packageName = context.getPackageName();
                    WakeLockEvent wakeLockEvent = r1;
                    WakeLockEvent wakeLockEvent2 = new WakeLockEvent(currentTimeMillis, i, str2, i2, list3, str, elapsedRealtime, a, str3, "com.google.android.gms".equals(packageName) ? null : packageName, C15531v.m32325b(context), j, str4);
                    try {
                        C15502f.m32254a(context, new Intent().setComponent(C15499c.f39961a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", wakeLockEvent));
                    } catch (Exception e) {
                        Log.wtf("WakeLockTracker", e);
                    }
                }
            }
        }
    }
}
