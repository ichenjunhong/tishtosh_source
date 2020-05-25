package com.p683ss.android.ugc.aweme.discover.p1646h;

import com.bytedance.jedi.p725a.p726a.C11536c;
import com.bytedance.jedi.p725a.p727b.C11562b;
import com.bytedance.jedi.p725a.p727b.C11564c.C11565a;
import com.bytedance.jedi.p725a.p728c.C11571b;
import com.bytedance.jedi.p725a.p733f.C11587b;
import com.bytedance.jedi.p725a.p739i.C11682a;
import com.bytedance.jedi.p725a.p739i.C11682a.C11686b;
import com.bytedance.jedi.p725a.p740j.C11698b;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverListData;
import com.p683ss.android.ugc.aweme.discover.p1646h.p1647a.C28167a;
import com.p683ss.android.ugc.aweme.discover.p1646h.p1648b.C28171b;
import com.p683ss.android.ugc.aweme.discover.p1646h.p1648b.C28179c;
import p064c.p065a.C2201v;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.h.a */
public final class C28164a extends C11698b {

    /* renamed from: a */
    public static final C28166a f73958a = new C28166a(null);

    /* renamed from: c */
    private static final C28167a f73959c = new C28167a();

    /* renamed from: b */
    private final C28171b f73960b = new C28171b();

    /* renamed from: com.ss.android.ugc.aweme.discover.h.a$a */
    public static final class C28166a {
        private C28166a() {
        }

        public /* synthetic */ C28166a(C52707g gVar) {
            this();
        }
    }

    public C28164a() {
        mo22478a(C11571b.m23675a((C11587b<K, V, REQ, RESP>) this.f73960b), C11571b.m23673a((C11536c<K, V>) f73959c), C11686b.m24026a(C11682a.f31134a, (C52682m) null, (C52686q) C281651.f73961a, 1, (Object) null));
    }

    /* renamed from: a */
    public final C2201v<DiscoverListData> mo56577a(C28179c cVar, boolean z) {
        boolean z2;
        C2201v vVar;
        C52711k.m112240b(cVar, "param");
        if (cVar.getCursor() == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !z) {
            vVar = this.f73960b.mo22318c(cVar);
        } else {
            vVar = C11562b.m23668a(this.f73960b, f73959c, C11563a.f30948a).mo22307a(C11565a.INSTANCE).mo22318c(cVar);
        }
        C2201v<DiscoverListData> b = vVar.mo6529b(C2168a.m6521b());
        C52711k.m112236a((Object) b, "request.subscribeOn(Schedulers.io())");
        return b;
    }
}
