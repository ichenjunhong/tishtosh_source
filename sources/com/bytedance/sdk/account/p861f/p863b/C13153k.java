package com.bytedance.sdk.account.p861f.p863b;

import android.content.Context;
import com.bytedance.sdk.account.p844a.p845a.C12989a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12992d;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13090h;
import com.bytedance.sdk.account.p865g.C13168a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.k */
public final class C13153k extends C13090h<C12992d> {

    /* renamed from: e */
    List<String> f34351e = new ArrayList();

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_logout_others", (String) null, (String) null, (C12990b) (C12992d) bVar, this.f34211c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C12992d dVar = new C12992d(z, 10025);
        if (z) {
            dVar.f34006h = this.f34351e;
        } else {
            dVar.f34000c = bVar.f34150b;
            dVar.f34001d = bVar.f34151c;
        }
        return dVar;
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        JSONArray optJSONArray = jSONObject2.optJSONArray("logout_user_ids");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                this.f34351e.add(optJSONArray.getString(i));
            }
        }
    }

    public C13153k(Context context, C13073a aVar, C12989a<C12992d> aVar2) {
        super(context, aVar, aVar2);
    }
}
