package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27722e;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.n */
final /* synthetic */ class C28656n implements C0199s {

    /* renamed from: a */
    private final DiscoverFragment f75224a;

    C28656n(DiscoverFragment discoverFragment) {
        this.f75224a = discoverFragment;
    }

    public final void onChanged(Object obj) {
        C27722e eVar = (C27722e) this.f75224a.mListView.getAdapter();
        if (!((Boolean) obj).booleanValue()) {
            eVar.mo56152b(3);
        }
    }
}
