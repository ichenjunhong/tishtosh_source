package com.p683ss.android.ugc.aweme.account.login.p1292v2.base;

import android.arch.lifecycle.C0184k;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import p064c.p065a.C2193n;
import p064c.p065a.C2199t;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.e */
public final class C21840e {
    /* renamed from: a */
    public static final <T> C2193n<T> m54518a(C2193n<T> nVar, C23526a aVar) {
        C52711k.m112240b(nVar, "$this$bindLifeCycle");
        C52711k.m112240b(aVar, "fragment");
        MaybeBindLifeCycleTransformer maybeBindLifeCycleTransformer = new MaybeBindLifeCycleTransformer();
        if (aVar.isViewValid()) {
            C0184k viewLifecycleOwner = aVar.getViewLifecycleOwner();
            C52711k.m112236a((Object) viewLifecycleOwner, "fragment.viewLifecycleOwner");
            viewLifecycleOwner.getLifecycle().mo324a(maybeBindLifeCycleTransformer);
        } else {
            aVar.getLifecycle().mo324a(maybeBindLifeCycleTransformer);
        }
        C2193n<T> a = nVar.mo6489a((C2199t<? super T, ? extends R>) maybeBindLifeCycleTransformer);
        C52711k.m112236a((Object) a, "compose(transformer)");
        return a;
    }
}
