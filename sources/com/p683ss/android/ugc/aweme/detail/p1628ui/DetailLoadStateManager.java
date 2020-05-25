package com.p683ss.android.ugc.aweme.detail.p1628ui;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y.C0212b;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.DetailLoadStateManager */
public final class DetailLoadStateManager extends C0209x {

    /* renamed from: b */
    public static final C27479a f72275b = new C27479a(null);

    /* renamed from: a */
    public final C0198r<Boolean> f72276a = new C0198r<>();

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.DetailLoadStateManager$a */
    public static final class C27479a {

        /* renamed from: com.ss.android.ugc.aweme.detail.ui.DetailLoadStateManager$a$a */
        public static final class C27480a implements C0212b {
            C27480a() {
            }

            /* renamed from: a */
            public final <T extends C0209x> T mo361a(Class<T> cls) {
                C52711k.m112240b(cls, "modelClass");
                return (C0209x) new DetailLoadStateManager();
            }
        }

        private C27479a() {
        }

        public /* synthetic */ C27479a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static DetailLoadStateManager m66087a(FragmentActivity fragmentActivity) {
            C52711k.m112240b(fragmentActivity, "activity");
            C0209x a = C0214z.m441a(fragmentActivity, (C0212b) new C27480a()).mo359a(DetailLoadStateManager.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…StateManager::class.java)");
            return (DetailLoadStateManager) a;
        }
    }
}
