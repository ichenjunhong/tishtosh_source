package com.bytedance.p582g.p583a.p592d;

import android.content.Context;
import com.bytedance.p582g.p583a.p585b.p590e.C9984e;
import com.facebook.internal.C14338p;
import com.taobao.android.dexposed.ClassUtils;

/* renamed from: com.bytedance.g.a.d.g */
public final class C10003g {

    /* renamed from: a */
    private static String f27159a;

    /* renamed from: a */
    public static String m20115a(Context context) {
        if (f27159a == null) {
            String replace = C9984e.m20073a(context).replace(context.getPackageName(), C14338p.f37308a).replace(":", "_");
            f27159a = replace;
            f27159a = replace.replace(ClassUtils.PACKAGE_SEPARATOR, "_");
        }
        return f27159a;
    }
}
