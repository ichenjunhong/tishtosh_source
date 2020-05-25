package com.p683ss.sys.p2584ck.p2585a;

import android.content.Context;
import com.p683ss.p1096a.p1097a.C18477a;

/* renamed from: com.ss.sys.ck.a.h */
public final class C51435h {

    /* renamed from: d */
    private static String f128613d = "";

    /* renamed from: a */
    public String f128614a = "";

    /* renamed from: b */
    public Context f128615b;

    /* renamed from: c */
    public String f128616c = "";

    public C51435h(Context context, String str, String str2) {
        if (str == null || str.length() <= 0) {
            str = "";
        }
        this.f128614a = str;
        this.f128615b = context;
        if (str2 == null || str2.length() <= 0) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C18477a.m44716c(0));
        sb.append("/v.s");
        sb.append(str2);
        this.f128616c = sb.toString();
    }
}
