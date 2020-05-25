package com.p683ss.caijing.globaliap.p2556a;

import com.p683ss.base.p2547b.C51160c;
import com.p683ss.caijing.globaliap.p2561e.C51271a;
import com.p683ss.caijing.globaliap.p2561e.C51280e;
import com.p683ss.caijing.globaliap.pay.C51292c;
import java.util.Map;

/* renamed from: com.ss.caijing.globaliap.a.b */
public final class C51219b extends C51280e {

    /* renamed from: a */
    private Map<String, String> f127917a;

    /* renamed from: b */
    public final Map<String, String> mo101746b() {
        return this.f127917a;
    }

    /* renamed from: a */
    public final String mo101744a() {
        String a = C51160c.m110046a(C51292c.m110280b());
        StringBuilder sb = new StringBuilder("https://");
        sb.append(a);
        sb.append("/gateway-u");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo101745a(C51271a<?> aVar) {
        this.f127917a = aVar.mo101796a();
    }
}
