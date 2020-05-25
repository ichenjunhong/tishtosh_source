package com.p683ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.p683ss.android.ugc.aweme.discover.viewmodel.SearchMusicListState;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.d */
final /* synthetic */ class C28292d extends C52720t {

    /* renamed from: a */
    public static final C52771j f74202a = new C28292d();

    C28292d() {
    }

    public final String getName() {
        return "listState";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(SearchMusicListState.class);
    }

    public final String getSignature() {
        return "getListState()Lcom/bytedance/jedi/arch/ext/list/ListState;";
    }

    public final Object get(Object obj) {
        return ((SearchMusicListState) obj).getListState();
    }
}
