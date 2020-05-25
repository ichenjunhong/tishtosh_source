package com.twitter.sdk.android.core.internal.p2617a;

import com.twitter.sdk.android.core.C52070d;
import com.twitter.sdk.android.core.C52072e;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import java.io.IOException;
import okhttp3.C53498ab;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53504ad;
import okhttp3.C53509af;
import okhttp3.C53513b;
import okhttp3.C53671s;

/* renamed from: com.twitter.sdk.android.core.internal.a.c */
public final class C52100c implements C53513b {

    /* renamed from: a */
    final C52072e f129705a;

    public C52100c(C52072e eVar) {
        this.f129705a = eVar;
    }

    /* renamed from: a */
    public final C53498ab mo108806a(C53509af afVar, C53504ad adVar) throws IOException {
        C52070d dVar;
        GuestAuthToken guestAuthToken;
        boolean z = true;
        C53504ad adVar2 = adVar;
        int i = 1;
        while (true) {
            adVar2 = adVar2.f132407j;
            if (adVar2 == null) {
                break;
            }
            i++;
        }
        if (i >= 2) {
            z = false;
        }
        if (z) {
            C52072e eVar = this.f129705a;
            C53671s sVar = adVar.f132398a.f132380c;
            String a = sVar.mo111593a("Authorization");
            String a2 = sVar.mo111593a("x-guest-token");
            if (a == null || a2 == null) {
                dVar = null;
            } else {
                dVar = new C52070d(new GuestAuthToken("bearer", a.replace("bearer ", ""), a2));
            }
            C52070d a3 = eVar.mo108767a(dVar);
            if (a3 == null) {
                guestAuthToken = null;
            } else {
                guestAuthToken = (GuestAuthToken) a3.f129901a;
            }
            if (guestAuthToken != null) {
                C53499a a4 = adVar.f132398a.mo111256a();
                C52098a.m111433a(a4, guestAuthToken);
                return a4.mo111272c();
            }
        }
        return null;
    }
}
