package com.facebook.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.lancet.C18984e;
import com.p683ss.android.ugc.aweme.lancet.p1151a.C18970b;

/* renamed from: com.facebook.internal.ad */
final class C14294ad {
    /* renamed from: a */
    static ApplicationInfo m29329a(PackageManager packageManager, String str, int i) throws NameNotFoundException {
        if (!TextUtils.equals(str, C11010c.m22280a().getPackageName())) {
            return packageManager.getApplicationInfo(str, 128);
        }
        if (C18970b.f52271a == null) {
            C18970b.f52271a = packageManager.getApplicationInfo(str, 128);
        }
        return C18970b.f52271a;
    }

    /* renamed from: a */
    static void m29330a(WebView webView, String str) {
        C18984e.m46161a(str);
        webView.loadUrl(str);
    }
}
