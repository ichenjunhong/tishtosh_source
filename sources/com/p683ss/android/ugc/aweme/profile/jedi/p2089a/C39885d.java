package com.p683ss.android.ugc.aweme.profile.jedi.p2089a;

import com.bytedance.jedi.p725a.p733f.C11597d;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.profile.service.C40010c;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p093k.C2168a;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.a.d */
public final class C39885d extends C11597d<C52860x, List<? extends C29059c>> {

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.a.d$a */
    static final class C39886a<V> implements Callable<T> {

        /* renamed from: a */
        public static final C39886a f101734a = new C39886a();

        /* renamed from: com.ss.android.ugc.aweme.profile.jedi.a.d$a$a */
        public static final class C39887a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return C52594a.m112153a(Long.valueOf(((C29059c) t2).f76129G), Long.valueOf(((C29059c) t).f76129G));
            }
        }

        C39886a() {
        }

        public final /* synthetic */ Object call() {
            C40010c.f101950a.mo82022a();
            List draftList = AVExternalServiceImpl.getAVServiceImpl_Monster().draftService().draftList(true);
            if (draftList.size() > 1) {
                C52575l.m112105a(draftList, new C39887a());
            }
            return C52575l.m112138e((Iterable<? extends T>) draftList);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C2201v mo22308a(Object obj) {
        C52711k.m112240b((C52860x) obj, "req");
        C2201v a = C2201v.m6607a((Callable<? extends T>) C39886a.f101734a).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a());
        C52711k.m112236a((Object) a, "Observable.fromCallable …dSchedulers.mainThread())");
        return a;
    }
}
