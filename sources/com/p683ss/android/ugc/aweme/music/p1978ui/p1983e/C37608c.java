package com.p683ss.android.ugc.aweme.music.p1978ui.p1983e;

import com.bytedance.jedi.p725a.p740j.C11698b;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.ui.e.c */
public final class C37608c extends C11698b {

    /* renamed from: a */
    private C37605a f95916a = new C37605a();

    /* renamed from: a */
    public static /* synthetic */ C2201v m84054a(C37608c cVar, String str, long j, int i, int i2, int i3, Object obj) {
        int i4;
        int i5;
        if ((i3 & 2) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i3 & 4) != 0) {
            i4 = 10;
        } else {
            i4 = i;
        }
        if ((i3 & 8) != 0) {
            i5 = 1;
        } else {
            i5 = i2;
        }
        C37605a aVar = cVar.f95916a;
        C37607b bVar = new C37607b(str, j2, i4, i5);
        C2201v a = aVar.mo22318c(bVar).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a());
        C52711k.m112236a((Object) a, "mRecommendMusicAwemeList…dSchedulers.mainThread())");
        return a;
    }
}
