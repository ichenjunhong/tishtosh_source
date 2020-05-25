package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.ra */
public final class C16202ra extends C16217rp {

    /* renamed from: a */
    final Context f45454a;

    /* renamed from: b */
    String f45455b = m38710c("description");

    /* renamed from: c */
    long f45456c = m38711d("start_ticks");

    /* renamed from: d */
    long f45457d = m38711d("end_ticks");

    /* renamed from: e */
    String f45458e = m38710c("summary");

    /* renamed from: f */
    String f45459f = m38710c("location");

    /* renamed from: g */
    private final Map<String, String> f45460g;

    public C16202ra(ama ama, Map<String, String> map) {
        super(ama, "createCalendarEvent");
        this.f45460g = map;
        this.f45454a = ama.mo28938d();
    }

    /* renamed from: c */
    private final String m38710c(String str) {
        return TextUtils.isEmpty((CharSequence) this.f45460g.get(str)) ? "" : (String) this.f45460g.get(str);
    }

    /* renamed from: d */
    private final long m38711d(String str) {
        String str2 = (String) this.f45460g.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
