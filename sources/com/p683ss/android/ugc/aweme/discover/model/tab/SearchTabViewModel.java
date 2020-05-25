package com.p683ss.android.ugc.aweme.discover.model.tab;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.p683ss.android.ugc.aweme.app.C23046bb;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.tab.SearchTabViewModel */
public final class SearchTabViewModel extends C0209x {
    public static final Companion Companion = new Companion(null);
    public final NextLiveData<C23046bb> tabInfo = new NextLiveData<>();

    /* renamed from: com.ss.android.ugc.aweme.discover.model.tab.SearchTabViewModel$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addObserver(View view, C0184k kVar, C52671b<? super C23046bb, C52860x> bVar) {
            C52711k.m112240b(view, "view");
            C52711k.m112240b(kVar, "lifecycleOwner");
            C52711k.m112240b(bVar, "observer");
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }

        public final SearchTabViewModel from(View view) {
            C52711k.m112240b(view, "view");
            Activity d = C23729p.m58270d(view);
            if (d != null) {
                C0209x a = C0214z.m440a((FragmentActivity) d).mo359a(SearchTabViewModel.class);
                C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…TabViewModel::class.java)");
                return (SearchTabViewModel) a;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.model.tab.SearchTabViewModel$SearchObserver */
    public static final class SearchObserver implements C0199s<C23046bb> {
        private C52671b<? super C23046bb, C52860x> listener = SearchTabViewModel$SearchObserver$listener$1.INSTANCE;

        public final SearchObserver setListener(C52671b<? super C23046bb, C52860x> bVar) {
            C52711k.m112240b(bVar, "listener");
            this.listener = bVar;
            return this;
        }

        public final void onChanged(C23046bb bbVar) {
            if (bbVar != null) {
                this.listener.invoke(bbVar);
            }
        }
    }

    public static final void addObserver(View view, C0184k kVar, C52671b<? super C23046bb, C52860x> bVar) {
        Companion.addObserver(view, kVar, bVar);
    }

    public static final SearchTabViewModel from(View view) {
        return Companion.from(view);
    }
}
