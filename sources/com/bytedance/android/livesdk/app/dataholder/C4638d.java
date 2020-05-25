package com.bytedance.android.livesdk.app.dataholder;

import android.text.TextUtils;
import android.util.Base64;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.app.dataholder.d */
public final class C4638d extends C4635a<Boolean> {

    /* renamed from: m */
    private static C4638d f12659m;

    /* renamed from: c */
    public boolean f12660c;

    /* renamed from: d */
    public String f12661d;

    /* renamed from: e */
    public String f12662e;

    /* renamed from: f */
    public byte[] f12663f;

    /* renamed from: g */
    public String f12664g;

    /* renamed from: h */
    public String f12665h;

    /* renamed from: i */
    public int f12666i;

    /* renamed from: j */
    public C4640f f12667j;

    /* renamed from: k */
    public boolean f12668k;

    /* renamed from: l */
    public Map<String, Integer> f12669l;

    /* renamed from: a */
    public static C4638d m11114a() {
        if (f12659m == null) {
            f12659m = new C4638d();
        }
        return f12659m;
    }

    private C4638d() {
        this.f12669l = new HashMap();
        this.f12651b = Boolean.valueOf(false);
        this.f12667j = new C4640f();
    }

    /* renamed from: b */
    public final void mo10419b() {
        this.f12651b = Boolean.valueOf(false);
        this.f12660c = false;
        this.f12664g = null;
        this.f12663f = null;
        this.f12662e = null;
        this.f12665h = null;
        this.f12666i = 0;
        this.f12668k = false;
        this.f12669l.clear();
        this.f12661d = null;
    }

    /* renamed from: a */
    public final void mo10414a(Boolean bool) {
        super.mo10414a(bool);
        if (bool != null && bool.booleanValue()) {
            this.f12660c = true;
        }
    }

    /* renamed from: a */
    public final void mo10417a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f12663f = Base64.decode(str, 0);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo10420b(String str, int i) {
        this.f12665h = mo10421c(str, i);
    }

    /* renamed from: c */
    public String mo10421c(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            this.f12668k = true;
        } else {
            if (i > 0) {
                str = String.valueOf(i);
            } else {
                str = null;
            }
            this.f12668k = false;
        }
        return str;
    }

    /* renamed from: a */
    public final void mo10418a(String str, int i) {
        this.f12661d = mo10421c(str, i);
    }
}
