package com.p683ss.android.ugc.aweme.challenge.p1498d;

import com.bytedance.jedi.p725a.p740j.C11698b;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.d.b */
public final class C24582b extends C11698b {

    /* renamed from: a */
    private C24580a f65042a = new C24580a();

    /* renamed from: a */
    public static /* synthetic */ C2201v m60001a(C24582b bVar, String str, long j, int i, boolean z, int i2, Object obj) {
        int i3;
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            i3 = 20;
        } else {
            i3 = i;
        }
        C52711k.m112240b(str, "chid");
        C24580a aVar = bVar.f65042a;
        C24583c cVar = new C24583c(str, j2, i3, z);
        C2201v a = aVar.mo22318c(cVar).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a());
        C52711k.m112236a((Object) a, "mBiColAwemeListFetcher.r…dSchedulers.mainThread())");
        return a;
    }
}
