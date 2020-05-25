package com.p683ss.android.ugc.aweme.commerce;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.bullet.utils.C24348b;
import com.p683ss.android.ugc.aweme.commerce.service.p1535ab.CommerceBulletExperiment;
import com.p683ss.android.ugc.aweme.music.p1977e.C37382g;
import com.p683ss.android.ugc.aweme.music.p1977e.C37382g.C37383a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commerce.b */
public final class C25492b {

    /* renamed from: a */
    public static final C25492b f67423a = new C25492b();

    private C25492b() {
    }

    /* renamed from: a */
    public static final void m62002a(String str, Map<String, String> map, Context context) {
        C52711k.m112240b(map, "options");
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                C52711k.m112234a();
            }
            C37383a a = C37382g.m83707a(str);
            for (Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                if (!TextUtils.isEmpty(str3)) {
                    a.mo76659a(str2, str3);
                }
            }
            String uri = a.mo76658a().toString();
            C52711k.m112236a((Object) uri, "schemaBuilder.build().toString()");
            if (C10181b.m20511a().mo18168a(CommerceBulletExperiment.class, true, "commerce_hybrid_use_bullet", 31744, 0) == 1) {
                uri = C24348b.m59717b(uri);
            }
            C41302w.m91042a().mo83861a(uri);
        }
    }
}
