package com.bytedance.ies.bullet.p628b.p633e;

import android.net.Uri;
import android.net.Uri.Builder;
import com.bytedance.ies.bullet.p628b.p637g.p640c.C10334e;
import com.bytedance.ies.bullet.p628b.p637g.p640c.C10342h;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.e.u */
public final class C10308u implements C10334e<C10310w> {

    /* renamed from: a */
    public static final C10308u f27710a = new C10308u();

    private C10308u() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo18383a(C10342h hVar, Object obj, Throwable th) {
        C10310w wVar = (C10310w) obj;
        C52711k.m112240b(hVar, "policy");
        C52711k.m112240b(wVar, "input");
        if (C10309v.f27711a[hVar.ordinal()] == 1 || (th instanceof C10306s)) {
            return wVar;
        }
        C10278b bVar = new C10278b();
        bVar.mo18493a(Uri.class, wVar.f27712a);
        Uri uri = (Uri) bVar.f27675a.mo18457b();
        if (uri != null) {
            Builder buildUpon = uri.buildUpon();
            C52711k.m112236a((Object) buildUpon, "it.buildUpon()");
            C10312y yVar = new C10312y(buildUpon);
            Uri uri2 = wVar.f27712a;
            C52711k.m112240b(uri2, "prevUri");
            yVar.f27715a.f27714a.mo18456a(uri2);
            Uri build = yVar.mo18453b().build();
            if (build != null) {
                return new C10310w(build, wVar.f27713b);
            }
        }
        return wVar;
    }
}
