package com.p683ss.android.ugc.aweme.feed.model;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.video.C48021h;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel */
public final class FeedSharePlayerViewModel extends C0209x {
    public static final Companion Companion = new Companion(null);
    public boolean hasBindCover;
    public C48021h player;

    /* renamed from: com.ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }

        public final C48021h getPlayerManager(FragmentActivity fragmentActivity) {
            C52711k.m112240b(fragmentActivity, "activity");
            return getViewModel(fragmentActivity).player;
        }

        public final FeedSharePlayerViewModel getViewModel(FragmentActivity fragmentActivity) {
            C52711k.m112240b(fragmentActivity, "activity");
            C0209x a = C0214z.m440a(fragmentActivity).mo359a(FeedSharePlayerViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…yerViewModel::class.java)");
            return (FeedSharePlayerViewModel) a;
        }
    }

    public static final C48021h getPlayerManager(FragmentActivity fragmentActivity) {
        return Companion.getPlayerManager(fragmentActivity);
    }

    public static final FeedSharePlayerViewModel getViewModel(FragmentActivity fragmentActivity) {
        return Companion.getViewModel(fragmentActivity);
    }
}
