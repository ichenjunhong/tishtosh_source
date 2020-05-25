package com.p683ss.android.ugc.aweme.challenge.viewmodel;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import com.p683ss.android.ugc.aweme.challenge.p1497c.C24559a;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel */
public final class ChallengeDetailViewModel extends C0209x {

    /* renamed from: c */
    public static final C24785a f65604c = new C24785a(null);

    /* renamed from: a */
    public final C23275b<Integer> f65605a = new C23275b<>();

    /* renamed from: b */
    public final C23275b<C52847n<Integer, C24559a>> f65606b = new C23275b<>();

    /* renamed from: com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel$a */
    public static final class C24785a {
        private C24785a() {
        }

        public /* synthetic */ C24785a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static ChallengeDetailViewModel m60319a(FragmentActivity fragmentActivity) {
            C52711k.m112240b(fragmentActivity, "activity");
            C0209x a = C0214z.m440a(fragmentActivity).mo359a(ChallengeDetailViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…ailViewModel::class.java)");
            return (ChallengeDetailViewModel) a;
        }
    }
}
