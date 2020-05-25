package com.p683ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11797e;
import com.bytedance.jedi.arch.ext.list.C11837a;
import com.bytedance.jedi.arch.ext.list.C11854c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28333l;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.c */
public final class C28291c {
    /* renamed from: a */
    public static final <RECEIVER extends C11796d> void m67205a(SearchJediViewModel searchJediViewModel, C11797e<? extends RECEIVER> eVar, C11837a<C28333l> aVar, C11854c<C28333l, RECEIVER> cVar, C11854c<C28333l, RECEIVER> cVar2, C52682m<? super RECEIVER, ? super Boolean, C52860x> mVar) {
        SearchJediViewModel searchJediViewModel2 = searchJediViewModel;
        C52711k.m112240b(searchJediViewModel, "$this$listSubscribe");
        C11797e<? extends RECEIVER> eVar2 = eVar;
        C52711k.m112240b(eVar2, "subscriber");
        C11837a<C28333l> aVar2 = aVar;
        C52711k.m112240b(aVar2, "adapter");
        ListMiddleware.m24163a(searchJediViewModel2.f74182f, eVar2, aVar2, false, eVar.mo22555f(), cVar, cVar2, mVar, null, null, null, 896, null);
    }
}
