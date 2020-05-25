package com.p683ss.android.ugc.aweme.p1328af.p1329a.p1331b;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.af.a.b.h */
public final class C22503h {

    /* renamed from: a */
    public static final C22504a f60630a = new C22504a(null);

    /* renamed from: b */
    private final List<C22497b> f60631b;

    /* renamed from: com.ss.android.ugc.aweme.af.a.b.h$a */
    public static final class C22504a {
        private C22504a() {
        }

        public /* synthetic */ C22504a(C52707g gVar) {
            this();
        }
    }

    public C22503h(List<C22497b> list) {
        C52711k.m112240b(list, "timingInfoList");
        this.f60631b = list;
    }

    /* renamed from: a */
    public final C22499d mo46843a(String str, JSONObject jSONObject) {
        C52711k.m112240b(str, "curTrigger");
        C52711k.m112240b(jSONObject, "metrics");
        Iterator it = this.f60631b.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (TextUtils.equals(((C22497b) it.next()).f60616b, str)) {
                break;
            } else {
                i++;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() == -1) {
            z = true;
        }
        if (z) {
            valueOf = null;
        }
        if (valueOf != null) {
            C22497b bVar = (C22497b) this.f60631b.get(valueOf.intValue());
            long optLong = jSONObject.optLong(str) - jSONObject.optLong(bVar.f60615a);
            if (optLong > 0) {
                return new C22499d(bVar.f60617c, optLong);
            }
        }
        return null;
    }
}
