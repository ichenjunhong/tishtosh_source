package com.twitter.sdk.android.core.internal.p2617a;

import java.io.IOException;
import okhttp3.C53504ad;
import okhttp3.C53676u;
import okhttp3.C53676u.C53677a;

/* renamed from: com.twitter.sdk.android.core.internal.a.b */
public final class C52099b implements C53676u {
    public final C53504ad intercept(C53677a aVar) throws IOException {
        C53504ad a = aVar.mo111417a(aVar.mo111416a());
        if (a.f132400c == 403) {
            return a.mo111277b().mo111281a(401).mo111283a("Unauthorized").mo111291a();
        }
        return a;
    }
}
