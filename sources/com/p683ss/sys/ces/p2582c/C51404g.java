package com.p683ss.sys.ces.p2582c;

import android.content.Context;
import com.p683ss.p1096a.p1097a.C18477a;
import com.p683ss.sys.ces.C51393c;
import com.p683ss.sys.ces.p2580a.C51384d;

/* renamed from: com.ss.sys.ces.c.g */
public final class C51404g {

    /* renamed from: d */
    private static String f128539d = "";

    /* renamed from: a */
    public String f128540a = "";

    /* renamed from: b */
    public Context f128541b;

    /* renamed from: c */
    public String f128542c = "";

    public C51404g(Context context, String str) {
        if (str == null || str.length() <= 0) {
            str = "";
        }
        this.f128540a = str;
        this.f128541b = context;
        StringBuilder sb = new StringBuilder();
        sb.append(C18477a.m44716c(0));
        sb.append("/v2/s");
        sb.append(m110560a());
        this.f128542c = sb.toString();
    }

    /* renamed from: a */
    private String m110560a() {
        String str = "?os=0&ver=0.6.11.29.02-MT&m=2";
        String str2 = "";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(this.f128541b.getPackageManager().getPackageInfo(this.f128541b.getPackageName(), 0).versionName);
            str2 = sb.toString();
        } catch (Throwable unused) {
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("&app_ver=");
        sb2.append(str2);
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(sb3);
        sb4.append("&region=");
        sb4.append(C51384d.m110514a(this.f128541b));
        String sb5 = sb4.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(sb5);
        sb6.append("&aid=");
        sb6.append(C51393c.m110536b());
        String sb7 = sb6.toString();
        StringBuilder sb8 = new StringBuilder();
        sb8.append(sb7);
        sb8.append("&did=");
        sb8.append(C51393c.m110538d());
        return sb8.toString();
    }
}
