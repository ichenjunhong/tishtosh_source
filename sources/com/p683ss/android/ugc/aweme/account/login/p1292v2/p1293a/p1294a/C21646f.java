package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.p1294a;

import android.os.Bundle;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a.C21135a;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21838c;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21677s;
import java.io.Serializable;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.f */
public final class C21646f extends C21838c {

    /* renamed from: b */
    private final C21848h f58664b;

    /* renamed from: c */
    private final C21850i f58665c;

    /* renamed from: d */
    private final JSONObject f58666d;

    /* renamed from: a */
    public final boolean mo45905a() {
        Bundle arguments = this.f59129a.getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("phone_number");
            if (serializable != null) {
                C21677s sVar = C21677s.f58713a;
                C21829b bVar = this.f59129a;
                if (serializable != null) {
                    String a = C21134a.m53619a((C21135a) serializable);
                    C52711k.m112236a((Object) a, "PhoneNumberUtil.formatNu…neNumberUtil.PhoneNumber)");
                    sVar.mo45940a(bVar, a, this.f58664b, this.f58665c, "anti_spam").mo6491b();
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil.PhoneNumber");
                }
            }
        }
        return true;
    }

    public C21646f(C21829b bVar, C21848h hVar, C21850i iVar, JSONObject jSONObject) {
        C52711k.m112240b(bVar, "fragment");
        C52711k.m112240b(hVar, "scene");
        C52711k.m112240b(iVar, "step");
        super(bVar);
        this.f58664b = hVar;
        this.f58665c = iVar;
        this.f58666d = jSONObject;
    }
}
