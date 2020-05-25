package com.p683ss.android.ugc.aweme.mix;

import com.bytedance.jedi.p725a.p733f.C11585a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.mix.MixDetailApi.C36989a;
import java.util.List;
import p064c.p065a.C2201v;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.mix.v */
public final class C37091v extends C11585a<C37095x, List<? extends Aweme>, C37095x, MixList> {

    /* renamed from: a */
    public static final C37092a f94742a = new C37092a(null);

    /* renamed from: b */
    private final MixDetailApi f94743b = C36989a.m83212a();

    /* renamed from: com.ss.android.ugc.aweme.mix.v$a */
    public static final class C37092a {
        private C37092a() {
        }

        public /* synthetic */ C37092a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo22310b(Object obj) {
        C37095x xVar = (C37095x) obj;
        C52711k.m112240b(xVar, "req");
        return xVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C2201v mo22308a(Object obj) {
        C37095x xVar = (C37095x) obj;
        C52711k.m112240b(xVar, "req");
        return this.f94743b.getMixListAweme(xVar.f94747a, xVar.f94748b, xVar.f94749c, xVar.f94750d);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo22309a(Object obj, Object obj2) {
        MixList mixList = (MixList) obj2;
        C52711k.m112240b((C37095x) obj, "req");
        C52711k.m112240b(mixList, "resp");
        List<Aweme> list = mixList.awemeList;
        if (list == null) {
            return C52575l.m112097a();
        }
        return list;
    }
}
