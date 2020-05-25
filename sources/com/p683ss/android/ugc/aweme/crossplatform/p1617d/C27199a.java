package com.p683ss.android.ugc.aweme.crossplatform.p1617d;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.p683ss.android.ugc.aweme.settings.IsCutOutAndroidList;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.d.a */
public final class C27199a {

    /* renamed from: a */
    public static final C27199a f71825a = new C27199a();

    private C27199a() {
    }

    /* renamed from: a */
    public static String m65620a(String str) {
        if (str == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (parse != null && !parse.isOpaque() && TextUtils.equals(parse.getQueryParameter("need_is_cutout"), "1")) {
            String[] strArr = (String[]) C10193n.m20607a().mo18202a(IsCutOutAndroidList.class, "is_cutout_android", C10181b.m20511a().mo18175c().getIsCutoutAndroid(), "java.lang.String[]", String[].class);
            if (strArr != null) {
                for (String equals : strArr) {
                    if (TextUtils.equals(Build.MODEL, equals)) {
                        return parse.buildUpon().appendQueryParameter("is_cutout", "1").build().toString();
                    }
                }
            }
        }
        return str;
    }
}
