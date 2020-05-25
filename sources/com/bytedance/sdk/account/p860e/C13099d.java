package com.bytedance.sdk.account.p860e;

import android.content.Context;
import com.bytedance.sdk.account.p844a.p845a.C12989a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p848d.C13017f;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13078b.C13079a;
import com.bytedance.sdk.account.p859d.C13090h;
import com.bytedance.sdk.account.p865g.C13168a;
import com.bytedance.sdk.account.p877l.C13207b;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.e.d */
public final class C13099d extends C13090h<C13017f> {

    /* renamed from: e */
    C13207b f34224e;

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_account_switch", (String) null, (String) null, (C12990b) (C13017f) bVar, this.f34211c);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34224e = C13079a.m26266a(jSONObject, jSONObject2);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C13017f fVar = new C13017f(z, BaseNotice.HASHTAG);
        if (z) {
            fVar.f34009h = this.f34224e;
        } else {
            fVar.f34000c = bVar.f34150b;
            fVar.f34001d = bVar.f34151c;
        }
        return fVar;
    }

    public C13099d(Context context, C13073a aVar, C12989a aVar2) {
        super(context, aVar, aVar2);
    }
}
