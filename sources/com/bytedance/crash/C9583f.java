package com.bytedance.crash;

import com.bytedance.crash.p545e.C9578a;
import com.bytedance.crash.p555n.C9696h;
import com.bytedance.news.common.service.manager.C12401c;
import com.bytedance.services.apm.api.C13218a;
import com.bytedance.services.apm.api.IEnsure;
import java.util.Map;

/* renamed from: com.bytedance.crash.f */
public final class C9583f {

    /* renamed from: a */
    public static long f26140a = -1;

    public C9583f() {
        try {
            EnsureImpl$1 ensureImpl$1 = new EnsureImpl$1(this);
            C12401c.m24977a(IEnsure.class, ensureImpl$1);
            C13218a.f34488a = ensureImpl$1;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo17383a(String str) {
        m19007a(str, "EnsureNotReachHere", null);
    }

    /* renamed from: b */
    public static boolean m19009b(String str) {
        if (C9616k.m19156h().mo17477b() == null || !C9616k.m19156h().mo17477b().getLogTypeSwitch(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m19008a(Throwable th) {
        if (!C9616k.m19156h().mo17476a() || C9696h.m19369a(th)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo17384a(String str, Throwable th) {
        String str2 = "EnsureNotReachHere";
        try {
            if (m19009b("ensure_err_npth")) {
                C9578a.m19005a(th.getStackTrace(), th, str, str2, 0);
                return;
            }
            if (C9616k.m19156h().mo17477b() == null) {
                C9578a.m19006a(th.getStackTrace(), th, str, str2, "ensure_err_npth", 0);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m19007a(String str, String str2, Map<String, String> map) {
        if (C9616k.m19156h().mo17476a()) {
            C9578a.m19002a(Thread.currentThread().getStackTrace(), 5, str, str2, map);
        }
    }
}
