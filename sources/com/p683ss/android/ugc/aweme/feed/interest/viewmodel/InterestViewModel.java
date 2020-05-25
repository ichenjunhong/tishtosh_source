package com.p683ss.android.ugc.aweme.feed.interest.viewmodel;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.interest.viewmodel.InterestViewModel */
public final class InterestViewModel extends C0209x {

    /* renamed from: b */
    public static final C30432a f79549b = new C30432a(null);

    /* renamed from: a */
    public final C0198r<Aweme> f79550a = new C0198r<>();

    /* renamed from: com.ss.android.ugc.aweme.feed.interest.viewmodel.InterestViewModel$a */
    public static final class C30432a {
        private C30432a() {
        }

        public /* synthetic */ C30432a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static InterestViewModel m71352a(FragmentActivity fragmentActivity) {
            C52711k.m112240b(fragmentActivity, "activity");
            C0209x a = C0214z.m440a(fragmentActivity).mo359a(InterestViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…estViewModel::class.java)");
            return (InterestViewModel) a;
        }
    }
}
