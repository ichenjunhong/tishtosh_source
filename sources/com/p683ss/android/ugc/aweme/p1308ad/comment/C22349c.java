package com.p683ss.android.ugc.aweme.p1308ad.comment;

import com.p683ss.android.ugc.aweme.commercialize.model.C26129j;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22317a;
import com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22322e;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.c */
public final class C22349c {

    /* renamed from: a */
    public static final C22322e f60208a = C22352c.f60210a;

    /* renamed from: b */
    public static final C22351b f60209b = new C22351b(null);

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.c$a */
    static final class C22350a implements C22322e {
        /* renamed from: a */
        public final List<TextExtraStruct> mo46452a(C26129j jVar, AwemeRawAd awemeRawAd, C52670a<C52860x> aVar) {
            C52711k.m112240b(jVar, "commentStruct");
            C52711k.m112240b(aVar, "onLinkTagClick");
            if (jVar.getCommentStyle() == 1) {
                C22317a a = C22317a.m55223a();
                C52711k.m112236a((Object) a, "AdDependManager.inst()");
                return a.f60114a.mo46445a(jVar, awemeRawAd, aVar);
            }
            C22317a a2 = C22317a.m55223a();
            C52711k.m112236a((Object) a2, "AdDependManager.inst()");
            return a2.f60114a.mo46444a(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.c$b */
    public static final class C22351b {
        private C22351b() {
        }

        public /* synthetic */ C22351b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.c$c */
    static final class C22352c {

        /* renamed from: a */
        static final C22350a f60210a = new C22350a();

        /* renamed from: b */
        public static final C22352c f60211b = new C22352c();

        private C22352c() {
        }
    }
}
