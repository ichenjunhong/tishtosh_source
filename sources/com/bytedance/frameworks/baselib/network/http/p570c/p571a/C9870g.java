package com.bytedance.frameworks.baselib.network.http.p570c.p571a;

import android.text.TextUtils;
import com.bytedance.frameworks.baselib.network.http.C9831a;
import com.p683ss.android.ugc.aweme.net.C37775g;
import okhttp3.C53504ad;

/* renamed from: com.bytedance.frameworks.baselib.network.http.c.a.g */
final class C9870g {
    /* renamed from: a */
    static String m19752a(C53504ad adVar, C9831a aVar) {
        String str;
        String str2;
        if (adVar == null || aVar == null) {
            return C9865e.m19733a(adVar, aVar);
        }
        if (!(aVar instanceof C37775g)) {
            return C9865e.m19733a(adVar, aVar);
        }
        try {
            C37775g gVar = (C37775g) aVar;
            if (adVar == null) {
                str = "";
            } else {
                str = adVar.mo111276b("Bd-Tt-Error-Code");
                if (TextUtils.isEmpty(str)) {
                    str = adVar.mo111276b("bd-tt-error-code");
                    if (TextUtils.isEmpty(str)) {
                        str = adVar.mo111276b("BD-TT-ERROR-CODE");
                    }
                }
            }
            gVar.f96240E = str;
            C37775g gVar2 = (C37775g) aVar;
            if (adVar == null) {
                str2 = "";
            } else {
                str2 = adVar.mo111276b("X-Tt-Logid");
                if (TextUtils.isEmpty(str2)) {
                    str2 = adVar.mo111276b("x-tt-logid");
                    if (TextUtils.isEmpty(str2)) {
                        str2 = adVar.mo111276b("X-TT-LOGID");
                    }
                }
            }
            gVar2.f96241F = str2;
        } catch (Throwable unused) {
        }
        return C9865e.m19733a(adVar, aVar);
    }
}
