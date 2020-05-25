package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.commercialize.loft.p1575b.C26006a;
import com.p683ss.android.ugc.aweme.commercialize.loft.p1575b.C26009d;
import com.p683ss.android.ugc.aweme.discover.adapter.C27903j;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27722e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.t */
final /* synthetic */ class C28710t implements Runnable {

    /* renamed from: a */
    private final DiscoverFragment f75345a;

    /* renamed from: b */
    private final C26006a f75346b;

    C28710t(DiscoverFragment discoverFragment, C26006a aVar) {
        this.f75345a = discoverFragment;
        this.f75346b = aVar;
    }

    public final void run() {
        DiscoverFragment discoverFragment = this.f75345a;
        C26006a aVar = this.f75346b;
        if (discoverFragment.mListView != null && discoverFragment.mListView.getAdapter() != null) {
            C27903j jVar = (C27903j) ((C27722e) discoverFragment.mListView.getAdapter()).f72753e;
            C26009d.f68671j.mo53461a(discoverFragment.getContext());
            FragmentActivity activity = discoverFragment.getActivity();
            C52711k.m112240b(activity, "context");
            ((C26009d) C26009d.f68671j.mo53461a(activity)).f68672a = null;
            int i = 0;
            int size = jVar.f72772k.size();
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (((DiscoverItemData) jVar.f72772k.get(i)).getType() == 1) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                jVar.notifyItemChanged(i, null);
            }
        }
    }
}
