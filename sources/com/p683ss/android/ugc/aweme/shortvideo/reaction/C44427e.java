package com.p683ss.android.ugc.aweme.shortvideo.reaction;

import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.e */
final /* synthetic */ class C44427e implements Runnable {

    /* renamed from: a */
    private final C44418b f112392a;

    C44427e(C44418b bVar) {
        this.f112392a = bVar;
    }

    public final void run() {
        C44418b bVar = this.f112392a;
        bVar.mo90298d();
        bVar.f112378m = C45547d.m99208b(bVar.f112366a, bVar.f112366a.getResources().getString(R.string.dj9));
        bVar.f112378m.setIndeterminate(true);
    }
}
