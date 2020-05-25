package com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.api;

import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.api.CommentFilterApi.API;
import com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.p1604b.C27036a;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.api.a */
public final class C27032a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f71350a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27032a.class), "mApi", "getMApi()Lcom/ss/android/ugc/aweme/compliance/businesses/commentfilter/api/CommentFilterApi$API;"))};

    /* renamed from: c */
    public static final C27033a f71351c = new C27033a(null);

    /* renamed from: b */
    public final DataCenter f71352b;

    /* renamed from: d */
    private final C52668f f71353d = C52732g.m112285a(C27035c.f71355a);

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.api.a$a */
    public static final class C27033a {
        private C27033a() {
        }

        public /* synthetic */ C27033a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.api.a$b */
    static final class C27034b<TTaskResult, TContinuationResult> implements C0011g<C27036a, Object> {

        /* renamed from: a */
        final /* synthetic */ C27032a f71354a;

        C27034b(C27032a aVar) {
            this.f71354a = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "it");
            if (iVar.mo31c() || iVar.mo33d() || !iVar.mo26b()) {
                return null;
            }
            DataCenter dataCenter = this.f71354a.f71352b;
            if (dataCenter != null) {
                dataCenter.mo48228a("list_keywords", (Object) ((C27036a) iVar.mo34e()).f71356a);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.businesses.commentfilter.api.a$c */
    static final class C27035c extends C52712l implements C52670a<API> {

        /* renamed from: a */
        public static final C27035c f71355a = new C27035c();

        C27035c() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return CommentFilterApi.f71349a;
        }
    }

    /* renamed from: a */
    public final API mo55265a() {
        return (API) this.f71353d.getValue();
    }

    /* renamed from: b */
    public final void mo55266b() {
        API a = mo55265a();
        C52711k.m112236a((Object) a, "mApi");
        a.getCommentFilterKeywords().mo20a((C0011g<TResult, TContinuationResult>) new C27034b<TResult,TContinuationResult>(this), C0013i.f25b);
    }

    public C27032a(DataCenter dataCenter) {
        this.f71352b = dataCenter;
    }
}
