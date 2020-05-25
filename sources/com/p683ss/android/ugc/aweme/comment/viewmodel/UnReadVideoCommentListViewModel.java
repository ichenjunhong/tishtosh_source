package com.p683ss.android.ugc.aweme.comment.viewmodel;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.UnReadVideoCommentListViewModel */
public final class UnReadVideoCommentListViewModel extends C0209x {

    /* renamed from: a */
    public static final C25406a f67194a = new C25406a(null);

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.UnReadVideoCommentListViewModel$a */
    public static final class C25406a {
        private C25406a() {
        }

        public /* synthetic */ C25406a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static UnReadVideoCommentListViewModel m61820a(FragmentActivity fragmentActivity, String str) {
            C52711k.m112240b(fragmentActivity, "activity");
            C52711k.m112240b(str, "tag");
            C0209x a = C0214z.m440a(fragmentActivity).mo360a(str, UnReadVideoCommentListViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…istViewModel::class.java)");
            return (UnReadVideoCommentListViewModel) a;
        }
    }

    /* renamed from: a */
    public static final UnReadVideoCommentListViewModel m61819a(FragmentActivity fragmentActivity, String str) {
        return C25406a.m61820a(fragmentActivity, str);
    }
}
