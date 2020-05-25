package com.p683ss.android.ugc.aweme.search.model;

import android.app.Activity;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.search.model.SearchResultParamProvider */
public final class SearchResultParamProvider extends C0209x {

    /* renamed from: b */
    public static final C41433a f105006b = new C41433a(null);

    /* renamed from: a */
    public C41440e f105007a;

    /* renamed from: com.ss.android.ugc.aweme.search.model.SearchResultParamProvider$a */
    public static final class C41433a {
        private C41433a() {
        }

        public /* synthetic */ C41433a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C41440e m91252a(Context context) {
            C52711k.m112240b(context, "context");
            Activity a = C23729p.m58248a(context);
            if (a != null) {
                C0209x a2 = C0214z.m440a((FragmentActivity) a).mo359a(SearchResultParamProvider.class);
                C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…aramProvider::class.java)");
                C41440e eVar = ((SearchResultParamProvider) a2).f105007a;
                if (eVar == null) {
                    return new C41440e();
                }
                return eVar;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }

        /* renamed from: a */
        public static void m91253a(Context context, C41440e eVar) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(eVar, "param");
            Activity a = C23729p.m58248a(context);
            if (a != null) {
                C0209x a2 = C0214z.m440a((FragmentActivity) a).mo359a(SearchResultParamProvider.class);
                C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…aramProvider::class.java)");
                ((SearchResultParamProvider) a2).f105007a = eVar;
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }
}
