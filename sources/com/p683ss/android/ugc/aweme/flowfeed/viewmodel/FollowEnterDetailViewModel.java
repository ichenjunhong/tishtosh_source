package com.p683ss.android.ugc.aweme.flowfeed.viewmodel;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.viewmodel.FollowEnterDetailViewModel */
public final class FollowEnterDetailViewModel extends C0209x {

    /* renamed from: b */
    public static final C31856a f83229b = new C31856a(null);

    /* renamed from: a */
    public boolean f83230a;

    /* renamed from: com.ss.android.ugc.aweme.flowfeed.viewmodel.FollowEnterDetailViewModel$a */
    public static final class C31856a {
        private C31856a() {
        }

        public /* synthetic */ C31856a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static FollowEnterDetailViewModel m74257a(String str, FragmentActivity fragmentActivity) {
            C52711k.m112240b(str, "tag");
            C52711k.m112240b(fragmentActivity, "activity");
            C0209x a = C0214z.m440a(fragmentActivity).mo360a("FollowEnterDetailViewModel", FollowEnterDetailViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…ailViewModel::class.java)");
            return (FollowEnterDetailViewModel) a;
        }
    }

    /* renamed from: a */
    public static final FollowEnterDetailViewModel m74256a(String str, FragmentActivity fragmentActivity) {
        return C31856a.m74257a(str, fragmentActivity);
    }
}
