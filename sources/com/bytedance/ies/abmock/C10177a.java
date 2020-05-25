package com.bytedance.ies.abmock;

import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.abmock.a */
public final class C10177a {

    /* renamed from: a */
    public static final C10177a f27510a = new C10177a();

    private C10177a() {
    }

    /* renamed from: a */
    public static final void m20507a(String str) {
        C52711k.m112240b(str, C42311c.f106865i);
        C10181b a = C10181b.m20511a();
        C52711k.m112236a((Object) a, "ABManager.getInstance()");
        if (a.mo18174b()) {
            StringBuilder sb = new StringBuilder("@=>abmock  ");
            sb.append(str);
            System.out.println(sb.toString());
        }
    }
}
