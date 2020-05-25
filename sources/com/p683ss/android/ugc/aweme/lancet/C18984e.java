package com.p683ss.android.ugc.aweme.lancet;

import android.text.TextUtils;
import android.util.Patterns;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.bullet.business.QuickShopBusiness;

/* renamed from: com.ss.android.ugc.aweme.lancet.e */
public final class C18984e {
    /* renamed from: a */
    public static void m46161a(String str) {
        try {
            m46162b(str);
        } catch (Throwable th) {
            C9220a.m18312a(th, "H5UrlCheckLancet checkError");
        }
    }

    /* renamed from: b */
    private static void m46162b(String str) {
        boolean z;
        int i;
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(QuickShopBusiness.f64351b, str)) {
            if (!Patterns.WEB_URL.matcher(str).matches()) {
                C23131p.m57779a("h5_invalid_url", C23088c.m56631a().mo47824a("errorDesc", str).mo47825b());
                return;
            }
            int length = str.length();
            int i2 = 0;
            int i3 = 0;
            char c = '0';
            while (true) {
                z = true;
                if (i2 >= length) {
                    z = false;
                    break;
                }
                char charAt = str.charAt(i2);
                if (charAt == '?') {
                    i = 1;
                } else {
                    i = 0;
                }
                i3 += i;
                if (i3 > 1 || (charAt == c && (charAt == '&' || charAt == '?' || charAt == '='))) {
                    break;
                }
                i2++;
                c = charAt;
            }
            if (z) {
                C23131p.m57779a("h5_invalid_url", C23088c.m56631a().mo47824a("errorDesc", str).mo47825b());
            }
        }
    }
}
