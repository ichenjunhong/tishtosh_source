package com.bytedance.ies.dmt.p664ui.p668d;

import android.text.TextUtils;

/* renamed from: com.bytedance.ies.dmt.ui.d.g */
public class C10702g {

    /* renamed from: a */
    private static C10702g f28498a;

    /* renamed from: b */
    private String f28499b;

    /* renamed from: c */
    private long f28500c;

    /* renamed from: a */
    public static C10702g m21573a() {
        if (f28498a == null) {
            synchronized (C10702g.class) {
                if (f28498a == null) {
                    f28498a = new C10702g();
                }
            }
        }
        return f28498a;
    }

    /* renamed from: a */
    public final boolean mo19076a(String str) {
        if (System.currentTimeMillis() - this.f28500c > 2000) {
            this.f28499b = str;
            this.f28500c = System.currentTimeMillis();
            return true;
        } else if (!TextUtils.equals(this.f28499b, str)) {
            return true;
        } else {
            return false;
        }
    }
}
