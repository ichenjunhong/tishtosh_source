package com.p683ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.p683ss.android.ugc.aweme.filter.repository.internal.C31591g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31482a;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31495h;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31496i;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31499l;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31501n;
import p064c.p065a.C1680ad;
import p064c.p065a.p071d.C1711f;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.b */
public final class C31573b implements C31496i {

    /* renamed from: a */
    public final C31591g f82565a;

    /* renamed from: b */
    public final C31499l f82566b;

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.b$a */
    static final class C31574a<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ C31573b f82567a;

        C31574a(C31573b bVar) {
            this.f82567a = bVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            C31482a aVar = (C31482a) obj;
            C52711k.m112240b(aVar, "it");
            return new C31572a(aVar, this.f82567a.f82566b, this.f82567a.f82565a);
        }
    }

    /* renamed from: b */
    public final C31501n mo64401b() {
        return this.f82566b.mo64415e();
    }

    /* renamed from: a */
    public final C1680ad<C31495h> mo64400a() {
        C1680ad<C31495h> b = this.f82565a.mo22470a().mo6538d().mo6157b((C1711f<? super T, ? extends R>) new C31574a<Object,Object>(this));
        C52711k.m112236a((Object) b, "filterBoxDataSource\n    …DataSource)\n            }");
        return b;
    }

    public C31573b(C31591g gVar, C31499l lVar) {
        C52711k.m112240b(gVar, "filterBoxDataSource");
        C52711k.m112240b(lVar, "filterRepository");
        this.f82565a = gVar;
        this.f82566b = lVar;
    }
}
