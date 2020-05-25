package com.p683ss.android.ugc.aweme.account.login.authorize.p1281a;

import android.text.TextUtils;
import com.bytedance.sdk.account.p844a.p845a.C12989a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12995g;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.a.c */
public final class C21076c extends C12989a<C12995g> {

    /* renamed from: a */
    private final WeakReference<C21074a> f57311a;

    public C21076c(C21074a aVar) {
        this.f57311a = new WeakReference<>(aVar);
    }

    public final /* synthetic */ void onResponse(C12990b bVar) {
        C12995g gVar = (C12995g) bVar;
        if (gVar.f33998a) {
            if (this.f57311a.get() != null) {
                ((C21074a) this.f57311a.get()).mo45118a(gVar.f34009h, gVar.f34009h.f34481i);
            }
        } else if (this.f57311a.get() != null) {
            String str = gVar.f34019r;
            if (gVar.f34003f != null) {
                JSONObject optJSONObject = gVar.f34003f.optJSONObject("data");
                if (TextUtils.isEmpty(str) && optJSONObject != null && optJSONObject.has("profile_key")) {
                    str = optJSONObject.optString("profile_key", "");
                }
            }
            ((C21074a) this.f57311a.get()).mo45115a(gVar.f34000c, gVar.f34001d, gVar.f34011j, str, gVar);
        }
    }
}
