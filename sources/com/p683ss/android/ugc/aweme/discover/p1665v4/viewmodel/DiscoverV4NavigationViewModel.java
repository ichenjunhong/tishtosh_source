package com.p683ss.android.ugc.aweme.discover.p1665v4.viewmodel;

import com.bytedance.jedi.arch.C11790ac;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.p683ss.android.ugc.aweme.discover.api.DiscoverApi;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewmodel.DiscoverV4NavigationViewModel */
public final class DiscoverV4NavigationViewModel extends JediViewModel<DiscoverV4NavigationState> {
    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new DiscoverV4NavigationState(C11790ac.f31299a);
    }

    /* renamed from: a */
    public static C2201v<DiscoverV4CategoryResponse> m68224a(int i) {
        C2201v<DiscoverV4CategoryResponse> a = DiscoverApi.m66818a().categoryListV4(0, i).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a());
        C52711k.m112236a((Object) a, "DiscoverApi.getInstance(…dSchedulers.mainThread())");
        return a;
    }
}
