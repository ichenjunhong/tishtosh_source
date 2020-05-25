package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

@C16299uq
public final class abm {

    /* renamed from: a */
    int f40185a = -1;

    /* renamed from: b */
    private long f40186b = -1;

    /* renamed from: c */
    private long f40187c = -1;

    /* renamed from: d */
    private int f40188d = -1;

    /* renamed from: e */
    private long f40189e;

    /* renamed from: f */
    private final Object f40190f = new Object();

    /* renamed from: g */
    private final String f40191g;

    /* renamed from: h */
    private final abx f40192h;

    /* renamed from: i */
    private int f40193i = 0;

    /* renamed from: j */
    private int f40194j = 0;

    public abm(String str, abx abx) {
        this.f40191g = str;
        this.f40192h = abx;
    }

    /* renamed from: a */
    public final void mo28602a() {
        synchronized (this.f40190f) {
            this.f40193i++;
        }
    }

    /* renamed from: b */
    public final void mo28604b() {
        synchronized (this.f40190f) {
            this.f40194j++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28603a(com.google.android.gms.internal.ads.zzyv r11, long r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f40190f
            monitor-enter(r0)
            com.google.android.gms.internal.ads.abx r1 = r10.f40192h     // Catch:{ all -> 0x007c }
            long r1 = r1.mo28648j()     // Catch:{ all -> 0x007c }
            com.google.android.gms.common.util.e r3 = com.google.android.gms.ads.internal.C14963ax.m30837g()     // Catch:{ all -> 0x007c }
            long r3 = r3.mo28523a()     // Catch:{ all -> 0x007c }
            long r5 = r10.f40187c     // Catch:{ all -> 0x007c }
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0042
            long r1 = r3 - r1
            com.google.android.gms.internal.ads.bl<java.lang.Long> r5 = com.google.android.gms.internal.ads.C15740bx.f44217aD     // Catch:{ all -> 0x007c }
            com.google.android.gms.internal.ads.bu r6 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ all -> 0x007c }
            java.lang.Object r5 = r6.mo30717a(r5)     // Catch:{ all -> 0x007c }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x007c }
            long r5 = r5.longValue()     // Catch:{ all -> 0x007c }
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0033
            r1 = -1
            r10.f40185a = r1     // Catch:{ all -> 0x007c }
            goto L_0x003b
        L_0x0033:
            com.google.android.gms.internal.ads.abx r1 = r10.f40192h     // Catch:{ all -> 0x007c }
            int r1 = r1.mo28649k()     // Catch:{ all -> 0x007c }
            r10.f40185a = r1     // Catch:{ all -> 0x007c }
        L_0x003b:
            r10.f40187c = r12     // Catch:{ all -> 0x007c }
            long r12 = r10.f40187c     // Catch:{ all -> 0x007c }
            r10.f40186b = r12     // Catch:{ all -> 0x007c }
            goto L_0x0044
        L_0x0042:
            r10.f40186b = r12     // Catch:{ all -> 0x007c }
        L_0x0044:
            r12 = 1
            if (r11 == 0) goto L_0x0058
            android.os.Bundle r13 = r11.f46319c     // Catch:{ all -> 0x007c }
            if (r13 == 0) goto L_0x0058
            android.os.Bundle r11 = r11.f46319c     // Catch:{ all -> 0x007c }
            java.lang.String r13 = "gw"
            r1 = 2
            int r11 = r11.getInt(r13, r1)     // Catch:{ all -> 0x007c }
            if (r11 != r12) goto L_0x0058
            monitor-exit(r0)     // Catch:{ all -> 0x007c }
            return
        L_0x0058:
            int r11 = r10.f40188d     // Catch:{ all -> 0x007c }
            int r11 = r11 + r12
            r10.f40188d = r11     // Catch:{ all -> 0x007c }
            int r11 = r10.f40185a     // Catch:{ all -> 0x007c }
            int r11 = r11 + r12
            r10.f40185a = r11     // Catch:{ all -> 0x007c }
            int r11 = r10.f40185a     // Catch:{ all -> 0x007c }
            if (r11 != 0) goto L_0x0070
            r11 = 0
            r10.f40189e = r11     // Catch:{ all -> 0x007c }
            com.google.android.gms.internal.ads.abx r11 = r10.f40192h     // Catch:{ all -> 0x007c }
            r11.mo28630b(r3)     // Catch:{ all -> 0x007c }
            goto L_0x007a
        L_0x0070:
            com.google.android.gms.internal.ads.abx r11 = r10.f40192h     // Catch:{ all -> 0x007c }
            long r11 = r11.mo28650l()     // Catch:{ all -> 0x007c }
            r13 = 0
            long r3 = r3 - r11
            r10.f40189e = r3     // Catch:{ all -> 0x007c }
        L_0x007a:
            monitor-exit(r0)     // Catch:{ all -> 0x007c }
            return
        L_0x007c:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007c }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.abm.mo28603a(com.google.android.gms.internal.ads.zzyv, long):void");
    }

    /* renamed from: a */
    public final Bundle mo28601a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f40190f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f40191g);
            bundle.putLong("basets", this.f40187c);
            bundle.putLong("currts", this.f40186b);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f40188d);
            bundle.putInt("preqs_in_session", this.f40185a);
            bundle.putLong("time_in_session", this.f40189e);
            bundle.putInt("pclick", this.f40193i);
            bundle.putInt("pimp", this.f40194j);
            bundle.putBoolean("support_transparent_background", m32470a(context));
        }
        return bundle;
    }

    /* renamed from: a */
    private static boolean m32470a(Context context) {
        Context a = C16380xq.m39015a(context);
        int identifier = a.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            abv.m32796d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == a.getPackageManager().getActivityInfo(new ComponentName(a.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                return true;
            }
            abv.m32796d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (NameNotFoundException unused) {
            abv.m32798e("Fail to fetch AdActivity theme");
            abv.m32796d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }
}
