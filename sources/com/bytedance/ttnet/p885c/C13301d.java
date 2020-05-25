package com.bytedance.ttnet.p885c;

import android.content.Context;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18982g;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/* renamed from: com.bytedance.ttnet.c.d */
final class C13301d {
    /* renamed from: a */
    static void m26786a(HttpURLConnection httpURLConnection, String str, String str2) {
        URLConnection uRLConnection = httpURLConnection;
        if (C18982g.m46160a(uRLConnection)) {
            C18976b.m46151a(uRLConnection.getURL(), str, str2, "");
        }
        httpURLConnection.setRequestProperty(str, str2);
    }

    /* renamed from: a */
    static boolean m26787a(Context context) {
        try {
            return C23718g.m58207b().mo49153d();
        } catch (Exception unused) {
            return false;
        }
    }
}
