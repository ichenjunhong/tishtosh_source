package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.C16442zy;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.zzaxk;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.bu */
public final class C14987bu {

    /* renamed from: a */
    private final Context f38693a;

    /* renamed from: b */
    private boolean f38694b;

    /* renamed from: c */
    private C16442zy f38695c;

    /* renamed from: d */
    private zzaxk f38696d;

    public C14987bu(Context context, C16442zy zyVar, zzaxk zzaxk) {
        this.f38693a = context;
        this.f38695c = zyVar;
        this.f38696d = zzaxk;
        if (this.f38696d == null) {
            this.f38696d = new zzaxk();
        }
    }

    /* renamed from: c */
    private final boolean m30941c() {
        return (this.f38695c != null && this.f38695c.mo31544a().f46233f) || this.f38696d.f46209a;
    }

    /* renamed from: a */
    public final void mo27620a() {
        this.f38694b = true;
    }

    /* renamed from: b */
    public final boolean mo27622b() {
        return !m30941c() || this.f38694b;
    }

    /* renamed from: a */
    public final void mo27621a(String str) {
        if (m30941c()) {
            if (str == null) {
                str = "";
            }
            if (this.f38695c != null) {
                this.f38695c.mo31547a(str, null, 3);
                return;
            }
            if (this.f38696d.f46209a && this.f38696d.f46210b != null) {
                for (String str2 : this.f38696d.f46210b) {
                    if (!TextUtils.isEmpty(str2)) {
                        acd.m32583a(this.f38693a, "", str2.replace("{NAVIGATION_URL}", Uri.encode(str)));
                    }
                }
            }
        }
    }
}
