package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.dy */
final class C15848dy implements C15948hq<Object> {

    /* renamed from: a */
    final /* synthetic */ C15847dx f44927a;

    /* renamed from: b */
    private final /* synthetic */ C16276tu f44928b;

    C15848dy(C15847dx dxVar, C16276tu tuVar) {
        this.f44927a = dxVar;
        this.f44928b = tuVar;
    }

    /* renamed from: a */
    public final void mo27606a(Object obj, Map<String, String> map) {
        ama ama = (ama) this.f44927a.f44925a.get();
        if (ama == null) {
            this.f44928b.mo31418b("/loadHtml", this);
            return;
        }
        ama.mo29197w().mo29207a((ank) new C15849dz(this, map, this.f44928b));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            ama.loadData(str, "text/html", "UTF-8");
        } else {
            ama.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
        }
    }
}
