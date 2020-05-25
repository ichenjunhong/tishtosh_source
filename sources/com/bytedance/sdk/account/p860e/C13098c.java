package com.bytedance.sdk.account.p860e;

import android.content.Context;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p846b.C13002c;
import com.bytedance.sdk.account.p844a.p848d.C13014c;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13078b.C13079a;
import com.bytedance.sdk.account.p859d.C13090h;
import com.bytedance.sdk.account.p865g.C13168a;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.e.c */
public final class C13098c extends C13090h<C13014c> {

    /* renamed from: e */
    private C13014c f34223e;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_account_info", (String) null, (String) null, (C12990b) (C13014c) bVar, this.f34211c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C13014c cVar = this.f34223e;
        if (cVar == null) {
            cVar = new C13014c(z, 10017);
        } else {
            cVar.f33998a = z;
        }
        if (!z) {
            cVar.f34000c = bVar.f34150b;
            cVar.f34001d = bVar.f34151c;
        }
        return cVar;
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34223e = new C13014c(true, 10017);
        this.f34223e.f34003f = jSONObject;
        this.f34223e.f34027i = C13079a.m26266a(jSONObject, jSONObject2);
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f34223e = new C13014c(false, 10017);
        this.f34223e.f34003f = jSONObject2;
        this.f34223e.f34026h = jSONObject.optString(LeakCanaryFileProvider.f132049i);
    }

    public C13098c(Context context, C13073a aVar, C13002c cVar) {
        super(context, aVar, cVar);
    }
}
