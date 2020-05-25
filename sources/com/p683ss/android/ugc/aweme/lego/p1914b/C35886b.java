package com.p683ss.android.ugc.aweme.lego.p1914b;

import android.content.Context;
import com.p683ss.android.ugc.aweme.lego.C35889c;
import com.p683ss.android.ugc.aweme.lego.C35897g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.lego.b.b */
public final class C35886b {

    /* renamed from: a */
    public final Map<C35897g, List<C35889c>> f92102a = new HashMap();

    /* renamed from: b */
    private Context f92103b;

    /* renamed from: a */
    private final void m81036a(C35889c cVar) {
        synchronized (this.f92102a) {
            Object obj = this.f92102a.get(cVar.mo46246a());
            if (obj == null) {
                C52711k.m112234a();
            }
            ((List) obj).remove(cVar);
        }
    }

    /* renamed from: a */
    public final void mo74550a(Context context) {
        C52711k.m112240b(context, "context");
        this.f92103b = context;
        for (C35897g put : C35897g.values()) {
            this.f92102a.put(put, new ArrayList());
        }
    }

    /* renamed from: b */
    public final C35889c mo74553b(C35897g gVar) {
        C52711k.m112240b(gVar, "type");
        synchronized (this.f92102a) {
            Object obj = this.f92102a.get(gVar);
            if (obj == null) {
                C52711k.m112234a();
            }
            if (!(!((Collection) obj).isEmpty())) {
                return null;
            }
            Object obj2 = this.f92102a.get(gVar);
            if (obj2 == null) {
                C52711k.m112234a();
            }
            C35889c cVar = (C35889c) ((List) obj2).get(0);
            return cVar;
        }
    }

    /* renamed from: a */
    public final boolean mo74552a(C35897g gVar) {
        C52711k.m112240b(gVar, "type");
        Object obj = this.f92102a.get(gVar);
        if (obj == null) {
            C52711k.m112234a();
        }
        if (!((Collection) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo74551a(C35889c cVar, boolean z) {
        C52711k.m112240b(cVar, "request");
        synchronized (cVar) {
            Object obj = this.f92102a.get(cVar.mo46246a());
            if (obj == null) {
                C52711k.m112234a();
            }
            if (((List) obj).contains(cVar)) {
                m81036a(cVar);
                Context context = this.f92103b;
                if (context == null) {
                    C52711k.m112237a("context");
                }
                cVar.mo46247a(context, z);
            }
        }
    }
}
