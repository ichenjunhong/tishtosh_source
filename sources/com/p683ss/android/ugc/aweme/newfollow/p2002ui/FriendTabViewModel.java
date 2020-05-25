package com.p683ss.android.ugc.aweme.newfollow.p2002ui;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.FriendTabViewModel */
public final class FriendTabViewModel extends C0209x {

    /* renamed from: c */
    public static final C37903a f96513c = new C37903a(null);

    /* renamed from: a */
    public final C0198r<C37924g> f96514a = new C0198r<>();

    /* renamed from: b */
    public final C0198r<C37925h> f96515b = new C0198r<>();

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.FriendTabViewModel$a */
    public static final class C37903a {
        private C37903a() {
        }

        public /* synthetic */ C37903a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static FriendTabViewModel m84728a(FragmentActivity fragmentActivity) {
            C52711k.m112240b(fragmentActivity, "activity");
            C0209x a = C0214z.m440a(fragmentActivity).mo359a(FriendTabViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…TabViewModel::class.java)");
            return (FriendTabViewModel) a;
        }
    }

    /* renamed from: a */
    public static final FriendTabViewModel m84727a(FragmentActivity fragmentActivity) {
        return C37903a.m84728a(fragmentActivity);
    }
}
