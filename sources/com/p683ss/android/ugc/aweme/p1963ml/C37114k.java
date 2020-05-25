package com.p683ss.android.ugc.aweme.p1963ml;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.video.C48065m;
import com.p683ss.android.ugc.p2454f.C48913c.C48914a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.ml.k */
final /* synthetic */ class C37114k implements C48914a {

    /* renamed from: a */
    static final C48914a f94761a = new C37114k();

    private C37114k() {
    }

    /* renamed from: a */
    public final Map mo76389a() {
        HashMap hashMap = new HashMap();
        hashMap.put("country", C35837h.m80981f());
        Context a = C11010c.m22280a();
        hashMap.put("access", NetworkUtils.getNetworkAccessType(a));
        hashMap.put("signal", Integer.valueOf(C48065m.m104081a(a).mo95336b(a)));
        return hashMap;
    }
}
