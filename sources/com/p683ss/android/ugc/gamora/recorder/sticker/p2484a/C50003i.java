package com.p683ss.android.ugc.gamora.recorder.sticker.p2484a;

import com.p683ss.android.ugc.aweme.shortvideo.senor.ISenorPresenter;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46295d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.i */
final class C50003i implements C46295d {

    /* renamed from: a */
    ISenorPresenter f125281a;

    /* renamed from: a */
    public final void mo97793a() {
        ISenorPresenter iSenorPresenter = this.f125281a;
        if (iSenorPresenter != null && !iSenorPresenter.mo90413b()) {
            iSenorPresenter.mo90408a();
        }
    }

    /* renamed from: b */
    public final void mo97794b() {
        ISenorPresenter iSenorPresenter = this.f125281a;
        if (iSenorPresenter != null && iSenorPresenter.mo90413b()) {
            iSenorPresenter.unRegister();
        }
    }

    /* renamed from: a */
    public final void mo93022a(ISenorPresenter iSenorPresenter, boolean z) {
        C52711k.m112240b(iSenorPresenter, "newSensor");
        ISenorPresenter iSenorPresenter2 = this.f125281a;
        boolean z2 = true;
        if (!z && iSenorPresenter2 != null && !(!C52711k.m112239a((Object) iSenorPresenter.getClass(), (Object) iSenorPresenter2.getClass()))) {
            z2 = false;
        }
        if (z2) {
            mo97794b();
            this.f125281a = iSenorPresenter;
            mo97793a();
        }
    }
}
