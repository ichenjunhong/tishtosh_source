package com.p683ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.google.p1057b.p1058a.C17432q;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31496i;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31497j;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31499l;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.c */
public final class C31575c implements C31497j {

    /* renamed from: a */
    public final C17432q<FilterBoxApi> f82568a;

    /* renamed from: b */
    private final C31499l f82569b;

    /* renamed from: c */
    private final C17432q<C29252f> f82570c;

    /* renamed from: d */
    private final C31577d f82571d;

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.c$a */
    static final class C31576a extends C52712l implements C52670a<FilterBoxApi> {

        /* renamed from: a */
        final /* synthetic */ C31575c f82572a;

        C31576a(C31575c cVar) {
            this.f82572a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (FilterBoxApi) this.f82572a.f82568a.get();
        }
    }

    /* renamed from: a */
    public final C31496i mo64402a() {
        return new C31573b(new C31578e(C52732g.m112285a(new C31576a(this)), this.f82571d, this.f82570c), this.f82569b);
    }

    public C31575c(C31499l lVar, C17432q<FilterBoxApi> qVar, C17432q<C29252f> qVar2, C31577d dVar) {
        C52711k.m112240b(lVar, "filterRepository");
        C52711k.m112240b(qVar, "filterBoxApiProvider");
        C52711k.m112240b(qVar2, "effectPlatform");
        C52711k.m112240b(dVar, "effectParams");
        this.f82569b = lVar;
        this.f82568a = qVar;
        this.f82570c = qVar2;
        this.f82571d = dVar;
    }
}
