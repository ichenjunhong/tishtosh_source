package com.twitter.sdk.android.core.internal.p2617a;

import com.twitter.sdk.android.core.C52070d;
import com.twitter.sdk.android.core.C52072e;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import java.io.IOException;
import okhttp3.C53498ab;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53504ad;
import okhttp3.C53676u;
import okhttp3.C53676u.C53677a;

/* renamed from: com.twitter.sdk.android.core.internal.a.a */
public final class C52098a implements C53676u {

    /* renamed from: a */
    final C52072e f129704a;

    public C52098a(C52072e eVar) {
        this.f129704a = eVar;
    }

    public final C53504ad intercept(C53677a aVar) throws IOException {
        GuestAuthToken guestAuthToken;
        C53498ab a = aVar.mo111416a();
        C52070d a2 = this.f129704a.mo108766a();
        if (a2 == null) {
            guestAuthToken = null;
        } else {
            guestAuthToken = (GuestAuthToken) a2.f129901a;
        }
        if (guestAuthToken == null) {
            return aVar.mo111417a(a);
        }
        C53499a a3 = a.mo111256a();
        m111433a(a3, guestAuthToken);
        return aVar.mo111417a(a3.mo111272c());
    }

    /* renamed from: a */
    static void m111433a(C53499a aVar, GuestAuthToken guestAuthToken) {
        StringBuilder sb = new StringBuilder();
        sb.append(guestAuthToken.f129758c);
        sb.append(" ");
        sb.append(guestAuthToken.f129759d);
        aVar.mo111263a("Authorization", sb.toString());
        aVar.mo111263a("x-guest-token", guestAuthToken.f129749b);
    }
}
