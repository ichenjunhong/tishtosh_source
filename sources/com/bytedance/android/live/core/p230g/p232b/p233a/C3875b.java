package com.bytedance.android.live.core.p230g.p232b.p233a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.core.p230g.C3866ad;
import com.bytedance.android.live.core.p230g.p232b.C3884c;

/* renamed from: com.bytedance.android.live.core.g.b.a.b */
public final class C3875b implements C3884c {
    /* renamed from: a */
    public final boolean mo9248a(Context context) {
        try {
            String a = C3866ad.m9801a("ro.hmct.notch_height");
            String a2 = C3866ad.m9801a("ro.hmct.notch_width");
            if (TextUtils.equals(a.trim(), "0") || TextUtils.isEmpty(a.trim()) || TextUtils.equals(a2.trim(), "0") || TextUtils.isEmpty(a2.trim())) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
