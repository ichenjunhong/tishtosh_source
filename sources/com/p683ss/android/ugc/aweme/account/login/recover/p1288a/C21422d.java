package com.p683ss.android.ugc.aweme.account.login.recover.p1288a;

import android.content.Context;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13090h;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.p1289a.C21413c;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.p1290b.C21419c;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.d */
public final class C21422d extends C13090h<C12990b> {

    /* renamed from: f */
    public static final C21423a f58111f = new C21423a(null);

    /* renamed from: e */
    public C21419c f58112e;

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.d$a */
    public static final class C21423a {
        private C21423a() {
        }

        public /* synthetic */ C21423a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo24585a(C12990b bVar) {
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) {
        C21419c cVar = new C21419c(true, 10010);
        this.f58112e = cVar;
        if (jSONObject2 != null) {
            cVar.f58107h = jSONObject2.optBoolean("safe");
            cVar.f58108i = jSONObject2.optString("ticket");
        }
    }

    /* renamed from: a */
    public final C12990b mo24584a(boolean z, C13075b bVar) {
        C21419c cVar;
        if (this.f58112e == null) {
            cVar = new C21419c(z, 10010);
            cVar.f33998a = z;
        } else {
            cVar = this.f58112e;
            if (cVar == null) {
                C52711k.m112234a();
            }
        }
        if (!z && bVar != null) {
            cVar.f34000c = bVar.f34150b;
            cVar.f34001d = bVar.f34151c;
        }
        this.f58112e = null;
        return cVar;
    }

    public C21422d(Context context, C13073a aVar, C21413c cVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "request");
        C52711k.m112240b(cVar, "call");
        super(context, aVar, cVar);
    }
}
