package com.bytedance.apm.p485h;

import android.text.TextUtils;

/* renamed from: com.bytedance.apm.h.e */
public final class C9043e {

    /* renamed from: a */
    public long f24688a;

    /* renamed from: b */
    public String f24689b;

    /* renamed from: c */
    public String f24690c;

    /* renamed from: d */
    public String f24691d;

    /* renamed from: e */
    public String f24692e;

    /* renamed from: f */
    public String f24693f;

    public final int hashCode() {
        return m17927a(this.f24689b) + m17927a(this.f24690c) + m17927a(this.f24691d) + m17927a(this.f24692e) + m17927a(this.f24693f);
    }

    /* renamed from: a */
    private static int m17927a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9043e eVar = (C9043e) obj;
        if (!TextUtils.equals(this.f24689b, eVar.f24689b) || !TextUtils.equals(this.f24690c, eVar.f24690c) || !TextUtils.equals(this.f24691d, eVar.f24691d) || !TextUtils.equals(this.f24692e, eVar.f24692e) || !TextUtils.equals(this.f24693f, eVar.f24693f)) {
            return false;
        }
        return true;
    }

    public C9043e(String str, String str2, String str3, String str4, String str5) {
        this.f24689b = str;
        this.f24690c = str2;
        this.f24691d = str3;
        this.f24692e = str4;
        this.f24693f = str5;
    }

    public C9043e(long j, String str, String str2, String str3, String str4, String str5) {
        this.f24688a = j;
        this.f24689b = str;
        this.f24690c = str2;
        this.f24691d = str3;
        this.f24692e = str4;
        this.f24693f = str5;
    }
}
