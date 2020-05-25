package com.twitter.sdk.android.core;

import android.text.TextUtils;
import com.google.gson.C17978g;
import com.google.gson.C18091u;
import com.google.gson.C18097x;
import com.twitter.sdk.android.core.models.C52194a;
import com.twitter.sdk.android.core.models.C52195b;
import com.twitter.sdk.android.core.models.SafeListAdapter;
import com.twitter.sdk.android.core.models.SafeMapAdapter;
import p2666g.C53133m;

/* renamed from: com.twitter.sdk.android.core.n */
public final class C52219n extends C52229t {

    /* renamed from: a */
    private final C52194a f130032a;

    /* renamed from: b */
    private final C52230u f130033b;

    /* renamed from: c */
    private final int f130034c;

    /* renamed from: d */
    private final C53133m f130035d;

    public final C53133m getResponse() {
        return this.f130035d;
    }

    public final int getStatusCode() {
        return this.f130034c;
    }

    public final C52230u getTwitterRateLimit() {
        return this.f130033b;
    }

    public final int getErrorCode() {
        if (this.f130032a == null) {
            return 0;
        }
        return this.f130032a.f129921b;
    }

    public final String getErrorMessage() {
        if (this.f130032a == null) {
            return null;
        }
        return this.f130032a.f129920a;
    }

    public C52219n(C53133m mVar) {
        this(mVar, readApiError(mVar), readApiRateLimit(mVar), mVar.mo110644a());
    }

    public static C52230u readApiRateLimit(C53133m mVar) {
        return new C52230u(mVar.f131635a.f132403f);
    }

    public static C52194a readApiError(C53133m mVar) {
        try {
            String readUtf8 = mVar.f131637c.source().buffer().clone().readUtf8();
            if (!TextUtils.isEmpty(readUtf8)) {
                return m111635a(readUtf8);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    private static C52194a m111635a(String str) {
        try {
            C52195b bVar = (C52195b) new C17978g().mo34894a((C18097x) new SafeListAdapter()).mo34894a((C18097x) new SafeMapAdapter()).mo34900d().mo34884a(str, C52195b.class);
            if (!bVar.f129922a.isEmpty()) {
                return (C52194a) bVar.f129922a.get(0);
            }
        } catch (C18091u unused) {
            new StringBuilder("Invalid json: ").append(str);
        }
        return null;
    }

    private C52219n(C53133m mVar, C52194a aVar, C52230u uVar, int i) {
        StringBuilder sb = new StringBuilder("HTTP request failed, Status: ");
        sb.append(i);
        super(sb.toString());
        this.f130032a = aVar;
        this.f130033b = uVar;
        this.f130034c = i;
        this.f130035d = mVar;
    }
}
