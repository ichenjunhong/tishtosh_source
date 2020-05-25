package com.p683ss.android.ugc.aweme.app;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.newmedia.p1195a.C19540c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.j */
public final class C23107j {

    /* renamed from: a */
    public static final C23107j f61527a = new C23107j();

    private C23107j() {
    }

    /* renamed from: a */
    public static final String m56674a() {
        StringBuilder sb = new StringBuilder();
        sb.append("v");
        String i = C11010c.m22288i();
        if (i == null) {
            i = "1.0";
        }
        sb.append(i);
        sb.append(" Build ");
        sb.append(C11010c.m22295p());
        sb.append("_");
        sb.append(C19540c.m47819a(C11010c.m22280a()).mo40795a("release_build", ""));
        String sb2 = sb.toString();
        C52711k.m112236a((Object) sb2, "sb.toString()");
        return sb2;
    }
}
