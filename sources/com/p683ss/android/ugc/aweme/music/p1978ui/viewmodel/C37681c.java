package com.p683ss.android.ugc.aweme.music.p1978ui.viewmodel;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.c */
final /* synthetic */ class C37681c extends C52720t {

    /* renamed from: a */
    public static final C52771j f96089a = new C37681c();

    C37681c() {
    }

    public final String getName() {
        return "listState";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(SimilarMusicListState.class);
    }

    public final String getSignature() {
        return "getListState()Lcom/bytedance/jedi/arch/ext/list/ListState;";
    }

    public final Object get(Object obj) {
        return ((SimilarMusicListState) obj).getListState();
    }
}
