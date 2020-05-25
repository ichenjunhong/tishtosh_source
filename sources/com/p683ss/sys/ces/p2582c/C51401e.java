package com.p683ss.sys.ces.p2582c;

import android.content.Context;
import com.p683ss.p1096a.p1097a.C18477a;
import com.p683ss.sys.ces.C51393c;
import com.p683ss.sys.ces.p2580a.C51384d;

/* renamed from: com.ss.sys.ces.c.e */
public final class C51401e {

    /* renamed from: d */
    private static String f128530d = "";

    /* renamed from: a */
    public String f128531a = "";

    /* renamed from: b */
    public Context f128532b;

    /* renamed from: c */
    public String f128533c = "";

    public C51401e(Context context, String str, int i) {
        if (str == null || str.length() <= 0) {
            str = "";
        }
        this.f128531a = str;
        this.f128532b = context;
        StringBuilder sb = new StringBuilder();
        sb.append(C18477a.m44711a());
        sb.append("/c/m");
        sb.append(m110554a(0));
        this.f128533c = sb.toString();
    }

    /* renamed from: a */
    private String m110554a(int i) {
        String str = "?os=0&ver=0.6.11.29.02-MT&m=2";
        String str2 = "";
        try {
            str2 = this.f128532b.getPackageManager().getPackageInfo(this.f128532b.getPackageName(), 0).versionName;
        } catch (Exception unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("&app_ver=");
        sb.append(str2);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("&region=");
        sb3.append(C51384d.m110514a(this.f128532b));
        String sb4 = sb3.toString();
        if (i == 0) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append("&aid=");
            sb5.append(C51393c.m110536b());
            String sb6 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append("&did=");
            sb7.append(C51393c.m110538d());
            String sb8 = sb7.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(sb8);
            sb9.append("&iid=");
            sb9.append(C51393c.m110539e());
            sb4 = sb9.toString();
        }
        if (i != 1) {
            return sb4;
        }
        StringBuilder sb10 = new StringBuilder();
        sb10.append(sb4);
        sb10.append("&appkey=");
        sb10.append(C51393c.m110541g().NM_getAppKey());
        String sb11 = sb10.toString();
        StringBuilder sb12 = new StringBuilder();
        sb12.append(sb11);
        sb12.append("&did=");
        sb12.append(C51393c.m110541g().NM_getDeviceId());
        return sb12.toString();
    }
}
