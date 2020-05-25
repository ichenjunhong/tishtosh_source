package com.p683ss.android.sdk.webview;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.sdk.webview.q */
public final class C19772q {

    /* renamed from: a */
    public final String f54455a;

    /* renamed from: b */
    public final String f54456b;

    /* renamed from: c */
    public String f54457c;

    /* renamed from: d */
    public long f54458d;

    /* renamed from: e */
    public final List<String> f54459e = new ArrayList();

    /* renamed from: f */
    public final List<String> f54460f = new ArrayList();

    /* renamed from: g */
    public final List<String> f54461g = new ArrayList();

    /* renamed from: a */
    public static String m48303a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        return sb.toString();
    }

    public C19772q(String str, String str2, String str3) {
        if (str2 == null) {
            str2 = "";
        }
        this.f54455a = str2;
        if (str3 == null) {
            str3 = "";
        }
        this.f54456b = str3;
        if (str == null) {
            str = "";
        }
        this.f54457c = str;
    }
}
