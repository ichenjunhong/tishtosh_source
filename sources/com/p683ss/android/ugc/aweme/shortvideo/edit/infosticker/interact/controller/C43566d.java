package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller;

import android.arch.lifecycle.C0198r;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.C44545c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.d */
final /* synthetic */ class C43566d implements Runnable {

    /* renamed from: a */
    private final C43560c f110266a;

    C43566d(C43560c cVar) {
        this.f110266a = cVar;
    }

    public final void run() {
        C43560c cVar = this.f110266a;
        C0198r b = cVar.f110243t.mo90442b();
        C44545c cVar2 = new C44545c((((float) cVar.f110234k.getContentView().getWidth()) / 2.0f) + cVar.f110234k.getContentView().getX(), cVar.f110234k.getContentView().getY(), cVar.mo88734g(), cVar.mo88733f(), false);
        b.postValue(cVar2);
    }
}
