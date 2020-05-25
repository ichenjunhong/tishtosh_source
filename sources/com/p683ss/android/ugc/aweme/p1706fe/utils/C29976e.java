package com.p683ss.android.ugc.aweme.p1706fe.utils;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lancet.C18989j;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.utils.e */
public final class C29976e {

    /* renamed from: a */
    public static final C29976e f78229a = new C29976e();

    private C29976e() {
    }

    /* renamed from: a */
    public final void mo60155a(Exception exc) {
        mo60156a("error", exc);
    }

    /* renamed from: a */
    public final void mo60156a(String str, Exception exc) {
        m70126a(str, exc, null, null, null);
    }

    /* renamed from: a */
    private static void m70126a(String str, Exception exc, String str2, String str3, String str4) {
        C23088c a = C23088c.m56631a();
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            a.mo47824a("msg_type", str);
        }
        if (exc != null) {
            a.mo47824a("error_desc", Log.getStackTraceString(exc));
        }
        if (!TextUtils.isEmpty(null)) {
            a.mo47824a("tag", (String) null);
        }
        if (!TextUtils.isEmpty(null)) {
            a.mo47824a("channel_name", (String) null);
        }
        if (!TextUtils.isEmpty(null)) {
            a.mo47824a("module_name", (String) null);
        }
        C52711k.m112236a((Object) a, "build");
        if (!a.f61490a.isEmpty()) {
            C23131p.m57779a("aweme_rn_log", a.mo47825b());
            if (TextUtils.equals(charSequence, "error")) {
                Throwable th = exc;
                C32458a.m75148a((Throwable) new C18989j(th));
                C9220a.m18312a(th, "aweme_rn_log");
            }
        }
    }
}
