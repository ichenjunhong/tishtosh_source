package com.p683ss.android.ugc.aweme.web;

import com.bytedance.geckox.C10026a;
import com.p683ss.android.ugc.C27991b;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.web.f */
public final class C48276f {

    /* renamed from: a */
    public final HashMap<String, C10026a> f121491a = new HashMap<>();

    /* renamed from: b */
    public final Map<String, C10026a> f121492b = new LinkedHashMap();

    /* renamed from: a */
    public static C48276f m104588a() {
        Object a = C27991b.m66756a(C48276f.class);
        if (a != null) {
            return (C48276f) a;
        }
        if (C27991b.f73497ba == null) {
            synchronized (C48276f.class) {
                if (C27991b.f73497ba == null) {
                    C27991b.f73497ba = new C48276f();
                }
            }
        }
        return (C48276f) C27991b.f73497ba;
    }

    /* renamed from: b */
    public final C10026a mo95786b(String str) {
        C10026a aVar;
        C52711k.m112240b(str, "accessKey");
        synchronized (this.f121492b) {
            aVar = (C10026a) this.f121492b.get(str);
        }
        return aVar;
    }

    /* renamed from: a */
    public final C10026a mo95784a(String str) {
        boolean z;
        C10026a aVar;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        synchronized (this.f121491a) {
            aVar = (C10026a) this.f121491a.get(str);
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo95785a(String str, C10026a aVar) {
        C52711k.m112240b(str, "accessKey");
        synchronized (this.f121491a) {
            this.f121491a.put(str, aVar);
        }
    }
}
