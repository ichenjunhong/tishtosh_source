package com.p683ss.android.ugc.aweme.choosemusic.fragment;

import com.p683ss.android.ugc.aweme.choosemusic.fragment.NewMusicListFragment.C24887a;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.f */
final /* synthetic */ class C24929f implements C24887a {

    /* renamed from: a */
    private final C24923c f66017a;

    C24929f(C24923c cVar) {
        this.f66017a = cVar;
    }

    /* renamed from: a */
    public final void mo50830a() {
        C24923c cVar = this.f66017a;
        if (cVar.isViewValid() && cVar.f65989a.mo76939a()) {
            NewMusicListFragment e = cVar.mo50885e();
            if (e != null && e.isViewValid() && e.f65855b != null && e.mListView.getAdapter() == e.f65855b) {
                e.f65855b.am_();
            }
            cVar.f65989a.mo76937a(C24923c.m60580h(), cVar.f66000p);
        }
    }
}
