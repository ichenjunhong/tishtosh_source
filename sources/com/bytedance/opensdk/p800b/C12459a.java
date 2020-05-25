package com.bytedance.opensdk.p800b;

import android.content.Context;
import android.text.TextUtils;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.opensdk.b.a */
public final class C12459a {

    /* renamed from: a */
    public static final C12459a f32769a = new C12459a();

    private C12459a() {
    }

    /* renamed from: a */
    public static boolean m25047a(Context context, String str) {
        C52711k.m112240b(str, "platformPackageName");
        boolean z = false;
        if (context != null) {
            CharSequence charSequence = str;
            if (!TextUtils.isEmpty(charSequence)) {
                if (!TextUtils.isEmpty(charSequence)) {
                    try {
                        if (context.getPackageManager().getPackageInfo(str, 1) != null) {
                            z = true;
                        }
                    } catch (Exception unused) {
                    }
                }
                return z;
            }
        }
        return false;
    }
}
