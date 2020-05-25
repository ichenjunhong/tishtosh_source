package com.p683ss.android.ugc.aweme.discover.viewmodel;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.search.model.C41434a;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel */
public final class SearchEnterViewModel extends C0209x {

    /* renamed from: b */
    public static final C28950a f75784b = new C28950a(null);

    /* renamed from: a */
    public C41434a f75785a;

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel$a */
    public static final class C28950a {
        private C28950a() {
        }

        public /* synthetic */ C28950a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static SearchEnterViewModel m68268a(FragmentActivity fragmentActivity) {
            if (fragmentActivity == null) {
                return new SearchEnterViewModel();
            }
            C0209x a = C0214z.m440a(fragmentActivity).mo359a(SearchEnterViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…terViewModel::class.java)");
            return (SearchEnterViewModel) a;
        }

        /* renamed from: b */
        public static C41434a m68269b(FragmentActivity fragmentActivity) {
            if (fragmentActivity == null) {
                return null;
            }
            return ((SearchEnterViewModel) C0214z.m440a(fragmentActivity).mo359a(SearchEnterViewModel.class)).f75785a;
        }
    }

    /* renamed from: a */
    public static final SearchEnterViewModel m68265a(FragmentActivity fragmentActivity) {
        return C28950a.m68268a(fragmentActivity);
    }

    /* renamed from: b */
    public static final C41434a m68266b(FragmentActivity fragmentActivity) {
        return C28950a.m68269b(fragmentActivity);
    }

    /* renamed from: a */
    public final void mo58512a(Bundle bundle) {
        if (bundle != null) {
            Serializable serializable = bundle.getSerializable("search_enter_param");
            if (!(serializable instanceof C41434a)) {
                serializable = null;
            }
            this.f75785a = (C41434a) serializable;
        }
    }
}
