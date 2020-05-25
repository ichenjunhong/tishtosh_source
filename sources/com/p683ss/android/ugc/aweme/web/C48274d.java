package com.p683ss.android.ugc.aweme.web;

import com.bytedance.ies.geckoclient.C10885e;
import com.p683ss.android.ugc.C27991b;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.web.d */
public final class C48274d {

    /* renamed from: a */
    public final HashMap<String, C10885e> f121489a = new HashMap<>();

    /* renamed from: b */
    public final Map<String, C10885e> f121490b = new LinkedHashMap();

    /* renamed from: a */
    public static C48274d m104575a() {
        Object a = C27991b.m66756a(C48274d.class);
        if (a != null) {
            return (C48274d) a;
        }
        if (C27991b.f73444aA == null) {
            synchronized (C48274d.class) {
                if (C27991b.f73444aA == null) {
                    C27991b.f73444aA = new C48274d();
                }
            }
        }
        return (C48274d) C27991b.f73444aA;
    }

    /* renamed from: b */
    public final C10885e mo95782b(String str) {
        C10885e eVar;
        C52711k.m112240b(str, "accessKey");
        synchronized (this.f121490b) {
            eVar = (C10885e) this.f121490b.get(str);
        }
        return eVar;
    }

    /* renamed from: a */
    public final C10885e mo95780a(String str) {
        boolean z;
        C10885e eVar;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        synchronized (this.f121489a) {
            eVar = (C10885e) this.f121489a.get(str);
        }
        return eVar;
    }

    /* renamed from: a */
    public final void mo95781a(String str, C10885e eVar) {
        C52711k.m112240b(str, "accessKey");
        synchronized (this.f121489a) {
            this.f121489a.put(str, eVar);
        }
    }

    /* renamed from: b */
    public final void mo95783b(String str, C10885e eVar) {
        C52711k.m112240b(str, "accessKey");
        C52711k.m112240b(eVar, "geckoClient");
        synchronized (this.f121490b) {
            this.f121490b.put(str, eVar);
        }
    }
}
