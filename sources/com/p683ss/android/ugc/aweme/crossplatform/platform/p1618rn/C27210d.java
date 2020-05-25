package com.p683ss.android.ugc.aweme.crossplatform.platform.p1618rn;

import android.preference.PreferenceManager;
import com.bytedance.ies.ugc.p694a.C11010c;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.d */
public class C27210d {

    /* renamed from: b */
    private static volatile C27210d f71842b;

    /* renamed from: a */
    public String f71843a = PreferenceManager.getDefaultSharedPreferences(C11010c.m22280a()).getString("rn_debug_source_url_safe_host", null);

    private C27210d() {
    }

    /* renamed from: a */
    public static C27210d m65634a() {
        if (f71842b == null) {
            synchronized (C27210d.class) {
                if (f71842b == null) {
                    f71842b = new C27210d();
                }
            }
        }
        return f71842b;
    }
}
