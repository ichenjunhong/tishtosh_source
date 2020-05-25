package com.p683ss.android.ugc.aweme.filter.repository.internal.p1748a;

import com.bytedance.jedi.p725a.p733f.C11597d;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31549c;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31550d;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31567e;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31595k;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31597m;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31599o;
import com.p683ss.android.ugc.aweme.filter.repository.internal.p1749b.C31547a;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31491d;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31494g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p064c.p065a.C2201v;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.f */
public final class C31510f extends C11597d<List<? extends C31493f>, List<? extends C31491d>> implements C31599o {

    /* renamed from: a */
    public final C31567e f82428a;

    /* renamed from: b */
    public final C31595k f82429b;

    /* renamed from: f */
    public final C31597m f82430f;

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.f$a */
    static final class C31511a<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ C31510f f82431a;

        /* renamed from: b */
        final /* synthetic */ List f82432b;

        C31511a(C31510f fVar, List list) {
            this.f82431a = fVar;
            this.f82432b = list;
        }

        public final /* synthetic */ Object call() {
            C31494g gVar;
            C31550d dVar;
            Iterable<C31493f> iterable = this.f82432b;
            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
            for (C31493f fVar : iterable) {
                if (this.f82431a.f82428a.mo64426a(fVar)) {
                    gVar = C31494g.FILTER_STATE_DOWNLOAD_SUCCESS;
                } else {
                    C31595k kVar = this.f82431a.f82429b;
                    C52711k.m112240b(kVar, "$this$checkFilterIsDownloading");
                    C52711k.m112240b(fVar, "filterMeta");
                    C31549c c = kVar.mo64460c(fVar);
                    boolean z = false;
                    if (c != null && (c == C31549c.PENDING || c == C31549c.START)) {
                        z = true;
                    }
                    if (z) {
                        gVar = C31494g.FILTER_STATE_DOWNLOADING;
                    } else if (this.f82431a.f82430f.mo64432a(fVar)) {
                        gVar = C31494g.FILTER_STATE_DOWNLOAD_SUCCESS;
                    } else {
                        gVar = C31494g.FILTER_STATE_NOT_DOWNLOAD;
                    }
                }
                C31494g gVar2 = gVar;
                if (this.f82431a.f82428a.mo64426a(fVar)) {
                    dVar = this.f82431a.f82428a.mo64424a(fVar.f82404a);
                } else if (gVar2 == C31494g.FILTER_STATE_DOWNLOAD_SUCCESS) {
                    dVar = this.f82431a.f82430f.mo64433d(fVar.f82404a);
                } else {
                    dVar = C31547a.m73408a();
                }
                C31491d dVar2 = new C31491d(fVar.f82404a, gVar2, dVar.f82513a, dVar.f82514b, dVar.f82515c);
                arrayList.add(dVar2);
            }
            return (List) arrayList;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C2201v mo22308a(Object obj) {
        List list = (List) obj;
        C52711k.m112240b(list, "req");
        C2201v a = C2201v.m6607a((Callable<? extends T>) new C31511a<Object>(this, list));
        C52711k.m112236a((Object) a, "Observable.fromCallable …\n\n            }\n        }");
        return a;
    }

    public C31510f(C31567e eVar, C31595k kVar, C31597m mVar) {
        C52711k.m112240b(eVar, "localFilterManager");
        C52711k.m112240b(kVar, "filterDownloader");
        C52711k.m112240b(mVar, "filterFiler");
        this.f82428a = eVar;
        this.f82429b = kVar;
        this.f82430f = mVar;
    }
}
