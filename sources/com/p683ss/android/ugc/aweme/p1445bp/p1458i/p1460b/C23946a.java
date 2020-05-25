package com.p683ss.android.ugc.aweme.p1445bp.p1458i.p1460b;

import com.google.p1057b.p1060c.C17658bm;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.out.AVServiceImpl;
import com.p683ss.android.ugc.aweme.p1445bp.p1450e.p1451a.C23893a;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bp.i.b.a */
public final class C23946a {

    /* renamed from: a */
    public final AtomicBoolean f63610a = new AtomicBoolean(true);

    /* renamed from: b */
    public final Set<String> f63611b = C17658bm.m43409b();

    /* renamed from: com.ss.android.ugc.aweme.bp.i.b.a$a */
    public static final class C23947a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C23946a f63612a;

        public C23947a(C23946a aVar) {
            this.f63612a = aVar;
        }

        public final /* synthetic */ Object call() {
            return this.f63612a.mo49540a();
        }
    }

    /* renamed from: a */
    public final Set<String> mo49540a() {
        Set<String> b = m58755b();
        this.f63611b.clear();
        this.f63611b.addAll(b);
        this.f63610a.set(false);
        return b;
    }

    /* renamed from: b */
    private static Set<String> m58755b() {
        List queryAllDraftList = AVServiceImpl.createIInternalAVServicebyMonsterPlugin().draftService().queryAllDraftList();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        C23893a aVar = new C23893a();
        C52711k.m112236a((Object) queryAllDraftList, "drafts");
        for (C29059c a : C52575l.m112128b((Iterable<? extends T>) queryAllDraftList)) {
            aVar.mo49499a(a);
            linkedHashSet.addAll(aVar.mo49500b());
        }
        return linkedHashSet;
    }
}
