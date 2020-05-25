package com.p683ss.android.ugc.aweme.qrcode.p2106d;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;

/* renamed from: com.ss.android.ugc.aweme.qrcode.d.c */
public final class C41006c {
    /* renamed from: a */
    public static String m90631a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "https://link-sg.byteoversea.com/";
        }
        return Uri.parse(str2).buildUpon().appendQueryParameter("aid", String.valueOf(C11010c.m22289j())).appendQueryParameter("target", str).appendQueryParameter("lang", C41005b.m90630a()).appendQueryParameter("scene", str3).build().toString();
    }
}
