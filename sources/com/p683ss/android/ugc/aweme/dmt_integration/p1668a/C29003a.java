package com.p683ss.android.ugc.aweme.dmt_integration.p1668a;

import com.google.gson.C18091u;
import com.google.gson.C18095w;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17960b;
import com.google.gson.p1078c.C17961c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.a.a */
public final class C29003a extends C18095w<Integer> {
    public final /* synthetic */ Object read(C17958a aVar) {
        return m68330a(aVar);
    }

    /* renamed from: a */
    private static Integer m68330a(C17958a aVar) {
        C52711k.m112240b(aVar, "in");
        C17960b f = aVar.mo34843f();
        if (f != null) {
            switch (C29004b.f75917a[f.ordinal()]) {
                case 1:
                    if (aVar.mo34846j()) {
                        return Integer.valueOf(1);
                    }
                    return Integer.valueOf(0);
                case 2:
                    aVar.mo34847k();
                    return null;
                case 3:
                    try {
                        return Integer.valueOf(aVar.mo34850n());
                    } catch (NumberFormatException e) {
                        throw new C18091u((Throwable) e);
                    }
                case 4:
                    if (Boolean.parseBoolean(aVar.mo34845i())) {
                        return Integer.valueOf(1);
                    }
                    return Integer.valueOf(0);
            }
        }
        StringBuilder sb = new StringBuilder("Expected BOOLEAN or NUMBER but was ");
        sb.append(f);
        throw new IllegalStateException(sb.toString());
    }

    public final /* synthetic */ void write(C17961c cVar, Object obj) {
        Integer num = (Integer) obj;
        C52711k.m112240b(cVar, "out");
        if (num == null) {
            cVar.mo34870f();
        } else {
            cVar.mo34860a((Number) num);
        }
    }
}
