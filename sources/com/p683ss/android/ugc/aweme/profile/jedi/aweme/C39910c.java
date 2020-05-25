package com.p683ss.android.ugc.aweme.profile.jedi.aweme;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.jedi.p725a.p733f.C11585a;
import com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23396j;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.profile.C40732y;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.c */
public final class C39910c extends C11585a<C39912d, List<? extends Aweme>, C39912d, FeedItemList> {

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.c$a */
    static final class C39911a<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ C39912d f101762a;

        C39911a(C39912d dVar) {
            this.f101762a = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
            if (r2 == null) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r2) {
            /*
                r1 = this;
                com.ss.android.ugc.aweme.profile.jedi.aweme.d r2 = (com.p683ss.android.ugc.aweme.profile.jedi.aweme.C39912d) r2
                java.lang.String r0 = "it"
                p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
                com.ss.android.ugc.aweme.profile.jedi.aweme.d r2 = r1.f101762a
                java.lang.String r2 = r2.f101766d
                if (r2 == 0) goto L_0x0015
                com.ss.android.ugc.aweme.profile.jedi.aweme.h r0 = com.p683ss.android.ugc.aweme.profile.jedi.aweme.C39917h.f101772b
                com.ss.android.ugc.aweme.feed.model.FeedItemList r2 = r0.mo81058a(r2)
                if (r2 != 0) goto L_0x001a
            L_0x0015:
                com.ss.android.ugc.aweme.feed.model.FeedItemList r2 = new com.ss.android.ugc.aweme.feed.model.FeedItemList
                r2.<init>()
            L_0x001a:
                r0 = 0
                r2.hasMore = r0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.jedi.aweme.C39910c.C39911a.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo22310b(Object obj) {
        C39912d dVar = (C39912d) obj;
        C52711k.m112240b(dVar, "req");
        return dVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C2201v mo22308a(Object obj) {
        C39912d dVar = (C39912d) obj;
        C52711k.m112240b(dVar, "req");
        ((C40732y) C23396j.m57478a(C11010c.m22280a(), C40732y.class)).mo48469a("");
        C2201v b = C2201v.m6614b(dVar).mo6541d((C1711f<? super T, ? extends R>) new C39911a<Object,Object>(dVar)).mo6529b(C2168a.m6521b());
        C52711k.m112236a((Object) b, "Observable.just(req).map…scribeOn(Schedulers.io())");
        return b;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo22309a(Object obj, Object obj2) {
        FeedItemList feedItemList = (FeedItemList) obj2;
        C52711k.m112240b((C39912d) obj, "req");
        C52711k.m112240b(feedItemList, "resp");
        return feedItemList.getItems();
    }
}
