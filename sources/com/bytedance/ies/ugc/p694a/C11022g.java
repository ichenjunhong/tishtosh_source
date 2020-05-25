package com.bytedance.ies.ugc.p694a;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.bytedance.ies.ugc.p694a.C11010c.C11011a;
import com.bytedance.ies.ugc.p694a.C11010c.C11013c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.ugc.a.g */
public final class C11022g {
    /* renamed from: a */
    public static final C11013c m22321a(Context context) {
        PackageInfo packageInfo;
        C52711k.m112240b(context, "context");
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Exception unused) {
            packageInfo = null;
        }
        long j = -1;
        String str = "";
        if (packageInfo != null) {
            str = packageInfo.versionName;
            C52711k.m112236a((Object) str, "packageInfo.versionName");
            j = (long) packageInfo.versionCode;
        }
        return new C11013c(j, str);
    }

    /* renamed from: b */
    public static final C11011a m22323b(Context context) {
        String str;
        long j;
        C52711k.m112240b(context, "context");
        String o = C11010c.m22294o();
        long n = C11010c.m22293n();
        try {
            String a = C11023h.m22324a(context, "SS_VERSION_NAME");
            C52711k.m112236a((Object) a, "ManifestReader.getString…ntext, \"SS_VERSION_NAME\")");
            str = a;
        } catch (Throwable unused) {
            str = o;
        }
        try {
            n = (long) C11023h.m22325b(context, "SS_VERSION_CODE");
        } catch (Throwable unused2) {
        }
        try {
            j = (long) C11023h.m22325b(context, "UPDATE_VERSION_CODE");
        } catch (Throwable unused3) {
            j = -1;
        }
        C11011a aVar = new C11011a(n, str, j);
        return aVar;
    }

    /* renamed from: a */
    public static final String m22322a(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "keyName");
        try {
            return C11021f.m22315a(context).mo19915a(str, "");
        } catch (Exception unused) {
            return null;
        }
    }
}
