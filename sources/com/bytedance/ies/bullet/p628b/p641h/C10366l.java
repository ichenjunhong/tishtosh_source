package com.bytedance.ies.bullet.p628b.p641h;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.h.l */
public final class C10366l {

    /* renamed from: a */
    public static final C10367a f27810a = new C10367a(null);

    /* renamed from: b */
    private final List<C10365k> f27811b;

    /* renamed from: com.bytedance.ies.bullet.b.h.l$a */
    public static final class C10367a {
        private C10367a() {
        }

        public /* synthetic */ C10367a(C52707g gVar) {
            this();
        }
    }

    public C10366l(List<C10365k> list) {
        C52711k.m112240b(list, "timingInfoList");
        this.f27811b = list;
    }

    /* renamed from: a */
    public final C10361h mo18440a(String str, JSONObject jSONObject) {
        C52711k.m112240b(str, "curTrigger");
        C52711k.m112240b(jSONObject, "metrics");
        Iterator it = this.f27811b.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (TextUtils.equals(((C10365k) it.next()).f27808b, str)) {
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
            C10365k kVar = (C10365k) this.f27811b.get(valueOf.intValue());
            long optLong = jSONObject.optLong(kVar.f27807a);
            if (optLong > 0) {
                long optLong2 = jSONObject.optLong(str) - optLong;
                if (optLong2 > 0) {
                    return new C10361h(kVar.f27809c, optLong2);
                }
            }
        }
        return null;
    }
}
