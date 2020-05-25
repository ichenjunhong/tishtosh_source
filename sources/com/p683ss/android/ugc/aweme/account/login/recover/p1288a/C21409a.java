package com.p683ss.android.ugc.aweme.account.login.recover.p1288a;

import android.content.Context;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13090h;
import com.bytedance.sdk.account.p865g.C13168a;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.p1289a.C21411a;
import com.p683ss.android.ugc.aweme.account.login.recover.p1288a.p1290b.C21417a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.a */
public final class C21409a extends C13090h<C21417a> {

    /* renamed from: e */
    public static final C21410a f58094e = new C21410a(null);

    /* renamed from: f */
    private C21417a f58095f;

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.a$a */
    public static final class C21410a {
        private C21410a() {
        }

        public /* synthetic */ C21410a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_auth_available_ways", (String) null, (String) null, (C12990b) (C21417a) bVar, this.f34211c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C21417a aVar;
        if (this.f58095f == null) {
            aVar = new C21417a(z, 10027);
        } else {
            aVar = this.f58095f;
            if (aVar == null) {
                C52711k.m112234a();
            }
            aVar.f33998a = z;
        }
        if (!z && bVar != null) {
            aVar.f34000c = bVar.f34150b;
            aVar.f34001d = bVar.f34151c;
        }
        this.f58095f = null;
        return aVar;
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) {
        C21417a aVar = new C21417a(true, 10027);
        this.f58095f = aVar;
        if (jSONObject2 != null) {
            aVar.f34028h = jSONObject2.optString("email");
            aVar.f34029i = jSONObject2.optBoolean("has_email");
            aVar.f34030j = jSONObject2.optBoolean("has_mobile");
            aVar.f34031k = jSONObject2.optBoolean("has_oauth");
            aVar.f34032l = jSONObject2.optBoolean("has_pwd");
            aVar.f34033m = jSONObject2.optBoolean("is_most_device");
            aVar.f34034n = jSONObject2.optString("mobile");
            aVar.f34036p = jSONObject2.optString("token");
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject2.optJSONArray("oauth_platforms");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            aVar.f34035o = arrayList;
            aVar.f58103q = jSONObject2.optString("avatar_url");
            aVar.f58104r = jSONObject2.optString("username");
            aVar.f58105s = jSONObject2.optBoolean("is_ftc_user");
        }
    }

    public C21409a(Context context, C13073a aVar, C21411a aVar2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "request");
        C52711k.m112240b(aVar2, "call");
        super(context, aVar, aVar2);
    }
}
